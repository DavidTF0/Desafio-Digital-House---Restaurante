package com.example.apprestaurantedesafiodigitalhouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.adapter.RecyclerViewTelaInicialAdapter

class MainActivity : AppCompatActivity() {

    val recyclerViewTelaInicial by lazy { findViewById<RecyclerView>(R.id.recyclerview_tela_inicial) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initApp()
    }


    fun initApp(){
        recyclerViewTelaInicial.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerViewTelaInicial.adapter = RecyclerViewTelaInicialAdapter(ListasDeItens.listaDeRestaurantes())
    }
}