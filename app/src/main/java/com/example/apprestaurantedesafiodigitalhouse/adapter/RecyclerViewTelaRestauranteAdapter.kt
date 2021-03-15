package com.example.apprestaurantedesafiodigitalhouse.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.model.PratosDoRestaurantes
import com.example.apprestaurantedesafiodigitalhouse.R
import com.example.apprestaurantedesafiodigitalhouse.view.TelaDescricaoPratoPrincipalActivity
import com.example.apprestaurantedesafiodigitalhouse.holder.TelaRestauranteViewHolder

class RecyclerViewTelaRestauranteAdapter(val listaDePratos: MutableList<PratosDoRestaurantes>):
    RecyclerView.Adapter<TelaRestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelaRestauranteViewHolder {

        val telaRestauranteView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_prato_principal, parent, false)
        return TelaRestauranteViewHolder(telaRestauranteView)

    }

    override fun getItemCount(): Int {
        return listaDePratos.size
    }

    override fun onBindViewHolder(holder: TelaRestauranteViewHolder, position: Int) {

        val cardViewPratoPrincipal = holder.cardViewPratos
        val nomeDoPrato = holder.nomeDoPrato
        val fotoDoPrato = holder.fotoDoPrato

        nomeDoPrato.text = listaDePratos[position].nomeDoPrato
        fotoDoPrato.setImageResource(listaDePratos[position].fotoDoPrato)

        cardViewPratoPrincipal.setOnClickListener {
            val intentPratos = Intent(it.context, TelaDescricaoPratoPrincipalActivity::class.java)
            intentPratos.putExtra("NOME_DO_PRATO", listaDePratos[position].nomeDoPrato)
            intentPratos.putExtra("FOTO_DO_PRATO", listaDePratos[position].fotoDoPrato)
            intentPratos.putExtra("DESCRICAO_DO_PRATO", listaDePratos[position].descricaoPratoPrincipal)
            it.context.startActivity(intentPratos)
        }
    }
}