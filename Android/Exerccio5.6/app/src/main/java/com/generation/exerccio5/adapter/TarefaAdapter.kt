package com.generation.exerccio5.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.recyclerview.widget.RecyclerView
import com.generation.exerccio5.MainViewModel
import com.generation.exerccio5.databinding.CardLayoutBinding
import com.generation.exerccio5.model.Tarefa

class TarefaAdapter(
    val taskClickListener: TaskClickListener,
    val mainViewModel: MainViewModel,
    val context: Context
) : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )//dizer onde vai jogar informações da tarefa
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria.descricao

        holder.itemView.setOnClickListener {
            taskClickListener.onTaskClickListener(tarefa)
        }

        holder.binding.switchAtivo
            .setOnCheckedChangeListener { CompoundButton, ativo ->
                tarefa.status = ativo
                mainViewModel.updateTarefa(tarefa)
            }

        holder.binding.buttonDeletar.setOnClickListener {
            showAlertDialog(tarefa.id)
        }

    }

    override fun getItemCount(): Int {
        return listTarefa.size //retorna quantas vezes vai gerar loop
    }

    fun setList(list: List<Tarefa>) {
        listTarefa = list.sortedByDescending { it.id }
        notifyDataSetChanged()

    }

    private fun showAlertDialog(id: Long) {
        AlertDialog.Builder(context)
            .setTitle("Excluir tarefa")
            .setMessage("Deseja excluir a tarefa?")
            .setPositiveButton("Sim") { _, _ ->
                mainViewModel.deleteTarefa(id)
            }
            .setNegativeButton("Não") { _, _ ->
            }.show()
    }

}