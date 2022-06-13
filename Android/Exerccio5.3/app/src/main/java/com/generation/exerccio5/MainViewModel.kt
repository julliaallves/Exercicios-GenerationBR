package com.generation.exerccio5

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.exerccio5.API.Repository
import com.generation.exerccio5.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    private val repository: Repository
        ) : ViewModel () {

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    val dataSelecionada = MutableLiveData<LocalDate>()

    init {
        //listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            _myCategoriaResponse.value = repository.listCategoria()
        try{ //p evitar q programa quebre se tiver sem internet
            val response = repository.listCategoria()
            _myCategoriaResponse.value = response
        }catch (e: Exception){
            Log.d("Erro", e.message.toString())
        }

        }
    }
}