package com.generation.exerccio5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.exerccio5.databinding.FragmentFormBinding
import com.generation.exerccio5.fragment.DatePickerFragment
import com.generation.exerccio5.fragment.TimerPickerListener
import com.generation.exerccio5.model.Categoria
import kotlinx.coroutines.selects.select
import java.time.LocalDate


class FormFragment : Fragment(), TimerPickerListener {

    private lateinit var binding: FragmentFormBinding

    private val mainViewModel: MainViewModel by activityViewModels() //p viewmodel sobreviver em tds telas

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        // val view =  inflater.inflate(R.layout.fragment_list, container, false)

        // val buttonSalvar = view.findViewById<Button>(R.id.buttonSalvar)

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner) {
            response -> Log.d("Requisição", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        binding.editData.setOnClickListener {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    fun spinnerCategoria(listCategoria: List<Categoria>?){ //? p indicar q as vezes a variável pode ser nula
    if (listCategoria != null) {
    binding.spinnerCategoria.adapter =
        ArrayAdapter(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listCategoria
        )
    }

}

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value=date
    }

}