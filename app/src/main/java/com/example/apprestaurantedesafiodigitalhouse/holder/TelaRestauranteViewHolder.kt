package com.example.apprestaurantedesafiodigitalhouse.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apprestaurantedesafiodigitalhouse.R

class TelaRestauranteViewHolder (view: View): RecyclerView.ViewHolder(view) {

    val cardViewPratos = view.findViewById<CardView>(R.id.cardview_prato_principal)
    val nomeDoPrato = view.findViewById<TextView>(R.id.nome_do_prato_principal)
    val fotoDoPrato = view.findViewById<ImageView>(R.id.img_prato_principal)

}
