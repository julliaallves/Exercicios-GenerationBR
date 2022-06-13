package com.generation.exerccio5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.exerccio5.databinding.FragmentFormBinding


class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding

    private  val  mainViewModel: MainViewModel by activityViewModels() //p viewmodel sobreviver em tds telas

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

       // val view =  inflater.inflate(R.layout.fragment_list, container, false)

        // val buttonSalvar = view.findViewById<Button>(R.id.buttonSalvar)

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            Log.d("Requisição", it.body().toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        return binding.root
    }

}