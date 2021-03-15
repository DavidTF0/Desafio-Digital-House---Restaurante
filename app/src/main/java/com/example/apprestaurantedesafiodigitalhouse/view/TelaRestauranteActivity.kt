package com.example.apprestaurantedesafiodigitalhouse.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.R
import com.example.apprestaurantedesafiodigitalhouse.adapter.RecyclerViewTelaRestauranteAdapter
import com.example.apprestaurantedesafiodigitalhouse.model.PratosDoRestaurantes
import java.io.Serializable

class TelaRestauranteActivity : AppCompatActivity() {

    val recyclerViewPratos by lazy { findViewById<RecyclerView>(R.id.recyclerview_tela_restaurante) }
    val imgDoRestaurante by lazy { findViewById<ImageView>(R.id.img_restaurante_menu) }
    val nomeDoRestaurante by lazy { findViewById<TextView>(R.id.nome_do_restaurante_menu) }
    val botaoVoltarTelaInicial by lazy { findViewById<ImageButton>(R.id.img_btn_back_to_tela_inicial) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_restaurante)

        initTelaRestaurante()
    }

    private fun initTelaRestaurante (){
        val infos = intent.extras

        botaoVoltarTelaInicial.setOnClickListener {
            val intentVoltarTelaInicial = Intent(it.context, TelaInicialRestaurantesActivity::class.java)
            it.context.startActivity(intentVoltarTelaInicial)
            finish()
        }

        if (infos != null){
            val nomeRestaurante = infos.getString("NOME_DO_RESTAURANTE")
            val foto = infos.getInt("FOTO_DO_RESTAURANTE")
            val listaDePratos = infos.getSerializable("LISTA_DE_PRATOS")

            nomeDoRestaurante.text = nomeRestaurante
            imgDoRestaurante.setImageResource(foto)
            recyclerViewPratos.adapter = RecyclerViewTelaRestauranteAdapter(getListaDePratos(listaDePratos))

        } else {
            Toast.makeText(this, "Não foi possivel Carregar as informações", Toast.LENGTH_SHORT).show()
        }


        recyclerViewPratos.layoutManager = GridLayoutManager(this, 2)
        recyclerViewPratos.isNestedScrollingEnabled


    }

    private fun getListaDePratos(lista: Serializable?): MutableList<PratosDoRestaurantes> {
        val listaArray = lista
        var mutableListDePratos = mutableListOf<PratosDoRestaurantes>()

        mutableListDePratos = listaArray as MutableList<PratosDoRestaurantes>

        return mutableListDePratos
    }
}