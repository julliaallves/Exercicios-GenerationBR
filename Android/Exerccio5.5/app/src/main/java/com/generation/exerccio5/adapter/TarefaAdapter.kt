package com.generation.exerccio5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.recyclerview.widget.RecyclerView
import com.generation.exerccio5.MainViewModel
import com.generation.exerccio5.databinding.CardLayoutBinding
import com.generation.exerccio5.model.Tarefa

class TarefaAdapter (
    val taskClickListener: TaskClickListener,
    val mainViewModel: MainViewModel
        ): RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))//dizer onde vai jogar informações da tarefa
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
       val tarefa = listTarefa [position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria.descricao

        holder.itemView.setOnClickListener{
            taskClickListener.onTaskClickListener(tarefa)
        }

        holder.binding.switchAtivo
            .setOnCheckedChangeListener{CompoundButton, ativo ->
                tarefa.status = ativo
                mainViewModel.updateTarefa(tarefa)
            }

    }

    override fun getItemCount(): Int {
        return listTarefa.size //retorna quantas vezes vai gerar loop
    }

    fun setList (list: List<Tarefa>){
        listTarefa = list.sortedByDescending { it.id }
        notifyDataSetChanged()

    }

}