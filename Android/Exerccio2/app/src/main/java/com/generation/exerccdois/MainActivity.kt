package com.generation.exerccdois

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //é por causa dessa linha que vizualizamos o layout

        //findViewById(id) - p referenciar o id do layout

        val botao1 = findViewById<Button>(R.id.buttonD6) //R p buscar resources, uma val qualquer, <Button> é uma classe oculta, oq ta no Palette

       botao1.setOnClickListener {
        //    Toast.makeText(this, "Opa!", Toast.LENGTH_LONG).show() //cada vez q clica no botão aparece isso, =println, é tipo uma msg de erro no fim da tela/msg flutuante
            rolarDados(6)
        }

        val botao2 = findViewById<Button>(R.id.buttonD10)
                botao2.setOnClickListener {
            rolarDados2(9)
        }

        val botao3 = findViewById<Button>(R.id.buttonD20)
        botao3.setOnClickListener {
            rolarDados3(20)
        }

    }

    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random() //random p dar aletoriedade
val textDado = findViewById<TextView>(R.id.textDado)
        textDado.text = rolagem.toString() //todo textview tem esse text

        val image = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }

    }

    private fun rolarDados2(lados: Int){
        val rolagem = (0..lados).random()
        val textDado2 = findViewById<TextView>(R.id.textDado2)
        textDado2.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageLados2)

        when(rolagem){
            0 -> image.setImageResource(R.drawable.d10_0)
            1 -> image.setImageResource(R.drawable.d10_1)
            2 -> image.setImageResource(R.drawable.d10_2)
            3 -> image.setImageResource(R.drawable.d10_3)
            4 -> image.setImageResource(R.drawable.d10_4)
            5 -> image.setImageResource(R.drawable.d10_5)
            6 -> image.setImageResource(R.drawable.d10_6)
            7 -> image.setImageResource(R.drawable.d10_7)
            8 -> image.setImageResource(R.drawable.d10_8)
            9 -> image.setImageResource(R.drawable.d10_9)
        }

    }

    private fun rolarDados3(lados: Int){
        val rolagem = (1..lados).random()
        val textDado3 = findViewById<TextView>(R.id.textDado3)
        textDado3.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageLados3)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.d20_1)
            2 -> image.setImageResource(R.drawable.d20_2)
            3 -> image.setImageResource(R.drawable.d20_3)
            4 -> image.setImageResource(R.drawable.d20_4)
            5 -> image.setImageResource(R.drawable.d20_5)
            6 -> image.setImageResource(R.drawable.d20_6)
            7 -> image.setImageResource(R.drawable.d20_7)
            8 -> image.setImageResource(R.drawable.d20_8)
            9 -> image.setImageResource(R.drawable.d20_9)
            10 -> image.setImageResource(R.drawable.d20_10)
            11 -> image.setImageResource(R.drawable.d20_11)
            12 -> image.setImageResource(R.drawable.d20_12)
            13 -> image.setImageResource(R.drawable.d20_13)
            14 -> image.setImageResource(R.drawable.d20_14)
            15 -> image.setImageResource(R.drawable.d20_15)
            16 -> image.setImageResource(R.drawable.d20_16)
            17 -> image.setImageResource(R.drawable.d20_17)
            18 -> image.setImageResource(R.drawable.d20_18)
            19 -> image.setImageResource(R.drawable.d20_19)
            20 -> image.setImageResource(R.drawable.d20_20)


        }

    }
}