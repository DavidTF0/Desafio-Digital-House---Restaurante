package com.example.apprestaurantedesafiodigitalhouse

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.model.Restaurante

class RestauranteViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val cardViewRestaurante = view.findViewById<CardView>(R.id.cardview_restaurante)
    val imgViewRestaurante = view.findViewById<ImageView>(R.id.imgview_restaurante)
    val nomeDoRestaurante = view.findViewById<TextView>(R.id.nome_do_restaurante)
    val enderecoDoRestaurante = view.findViewById<TextView>(R.id.endereco_restaurante)
    val horarioDeFuncionamento = view.findViewById<TextView>(R.id.horario_de_fechamento)
}