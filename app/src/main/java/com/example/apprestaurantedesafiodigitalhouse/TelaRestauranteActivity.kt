package com.example.apprestaurantedesafiodigitalhouse

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class TelaRestauranteActivity : AppCompatActivity() {

    val recyclerViewPratos = findViewById<RecyclerView>(R.id.recyclerview_tela_restaurante)
    val imgDoRestaurante = findViewById<ImageView>(R.id.img_restaurante_menu)
    val nomeDoRestaurante = findViewById<TextView>(R.id.nome_do_restaurante_menu)
    val botaoVoltarTelaInicial = findViewById<ImageButton>(R.id.img_btn_back_to_tela_inicial)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_restaurante)

        val informacoes = intent.extras
    }
}