package com.example.apprestaurantedesafiodigitalhouse.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.model.ListasDeItens
import com.example.apprestaurantedesafiodigitalhouse.R
import com.example.apprestaurantedesafiodigitalhouse.adapter.RecyclerViewTelaInicialAdapter

class TelaInicialRestaurantesActivity : AppCompatActivity() {

    val recyclerViewTelaInicial by lazy { findViewById<RecyclerView>(R.id.recyclerview_tela_inicial) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicial_lista_de_restaurantes)

        initApp()

    }

    fun initApp() {
        recyclerViewTelaInicial.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewTelaInicial.adapter =
            RecyclerViewTelaInicialAdapter(ListasDeItens.getListaDeRestaurantes())
    }
}