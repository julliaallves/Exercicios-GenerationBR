package com.generation.exerccio5

fun main (){

    // GlobalScope - corrotina morre quando fechar o aplicativo como um todo
    // ViewModelScope - ciclo de vida da viewmodel
    // LifecycleScope - sobrevive ao ciclo de vida de uma activity ou fragment

    // só executamos fun dentro da corrotina se por suspend

    // job é a identificaçao da corrotina que serve p dizer quem é a corrotina

    // contexto - main: processado dentro de activity ou fragment, IO: os que vem de rede, default: exige mais do processador da máquina

    // p chamar ela, poe na na view model, exemplo: viewModelScope.launch(Dispatchers.IO) {}

}