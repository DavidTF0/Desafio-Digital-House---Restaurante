package com.example.apprestaurantedesafiodigitalhouse

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewTelaInicialAdapter(val listaDeRestaurante: MutableList<Restaurante>) :
    RecyclerView.Adapter<RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_restaurante, parent, false)
        return RestauranteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaDeRestaurante.size
    }

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val nomeDoRestaurante = holder.nomeDoRestaurante
        val enderecoDoRestaurante = holder.enderecoDoRestaurante
        val horarioDeFuncionamentoDoRestaurante = holder.horarioDeFuncionamento
        val fotoDoRestaurante = holder.imgViewRestaurante

        nomeDoRestaurante.text = listaDeRestaurante[position].nomeDoRestaurante
        enderecoDoRestaurante.text = listaDeRestaurante[position].endereco
        horarioDeFuncionamentoDoRestaurante.text = listaDeRestaurante[position].horarioDeFuncionamento
        fotoDoRestaurante.setImageResource(listaDeRestaurante[position].fotoDoRestaurante)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, TelaRestauranteActivity::class.java)
            intent.putExtra("NOME_DO_RESTAURANTE", listaDeRestaurante[position].nomeDoRestaurante)
            intent.putExtra("FOTO_DO_RESTAURANTE", listaDeRestaurante[position].fotoDoRestaurante)
            it.context.startActivity(intent)
        }
    }


}