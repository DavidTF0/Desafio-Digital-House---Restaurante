package com.example.apprestaurantedesafiodigitalhouse

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TelaRestauranteActivity : AppCompatActivity() {

    val recyclerViewPratos = findViewById<RecyclerView>(R.id.recyclerview_tela_restaurante)
    val imgDoRestaurante = findViewById<ImageView>(R.id.img_restaurante_menu)
    val nomeDoRestaurante = findViewById<TextView>(R.id.nome_do_restaurante_menu)
    val botaoVoltarTelaInicial = findViewById<ImageButton>(R.id.img_btn_back_to_tela_inicial)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_restaurante)

        initTelaRestaurante()
    }

    fun initTelaRestaurante (){
        val infos = intent.extras

        botaoVoltarTelaInicial.setOnClickListener {
            val intentVoltarTelaInicial = Intent(it.context, MainActivity::class.java)
            it.context.startActivity(intentVoltarTelaInicial)
            finish()
        }

        if (infos != null){
            val nomeRestaurante = infos.getString("NOME_DO_RESTAURANTE")
            val foto = infos.getInt("FOTO_DO_RESTAURANTE")

            nomeDoRestaurante.text = nomeRestaurante
            imgDoRestaurante.setImageResource(foto)

        } else {
            Toast.makeText(this, "Não foi possivel Carregar as informações", Toast.LENGTH_SHORT).show()
        }

        recyclerViewPratos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}