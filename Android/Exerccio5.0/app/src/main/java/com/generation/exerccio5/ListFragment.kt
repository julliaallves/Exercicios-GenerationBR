package com.generation.exerccio5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.exerccio5.adapter.TarefaAdapter
import com.generation.exerccio5.databinding.FragmentListBinding
import com.generation.exerccio5.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)



        // n tem necessidade desse mais por conta do binding val view = inflater.inflate(R.layout.fragment_list, container, false)

        // val floatingAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)

        val listTarefas = listOf( //lista estática de tarefas
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Henrique",
                "2022-05-15",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Henrique",
                "2022-05-15",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Henrique",
                "2022-05-15",
                false,
                "Dia a dia"
            )
        )

        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R. id. action_listFragment_to_formFragment)
        }

        return binding.root
    }
}
