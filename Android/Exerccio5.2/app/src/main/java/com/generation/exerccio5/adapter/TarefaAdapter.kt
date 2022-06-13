package com.generation.exerccio5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.exerccio5.databinding.CardLayoutBinding
import com.generation.exerccio5.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

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

    //cria de fato a tarefa, como processa
    }

    override fun getItemCount(): Int {
        return listTarefa.size //retorna quantas vezes vai gerar loop
    }

    fun setList (list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()

    }

}