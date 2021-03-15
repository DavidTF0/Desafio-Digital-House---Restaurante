package com.example.apprestaurantedesafiodigitalhouse.view

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apprestaurantedesafiodigitalhouse.R

class TelaDescricaoPratoPrincipalActivity : AppCompatActivity() {

    val imgDoPrato by lazy { findViewById<ImageView>(R.id.prato_principal_tela_descricao) }
    val nomeDoPrato by lazy { findViewById<TextView>(R.id.txt_nome_do_prato_tela_descricao) }
    val descricaoDoPrato by lazy { findViewById<TextView>(R.id.txt_descricao_prato_principal) }
    val botaoVoltarTelaRestauranteActivity by lazy { findViewById<ImageButton>(R.id.img_btn_back_to_tela_restaurante) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.descricao_do_prato)

        initTelaDescricaoPratoPrincipal()

    }

    fun initTelaDescricaoPratoPrincipal() {
        val infosPratos = intent.extras

        botaoVoltarTelaRestauranteActivity.setOnClickListener {
            onBackPressed()
        }

        if (infosPratos != null) {

            val nomePrato = infosPratos.getString("NOME_DO_PRATO", "Não ha um nome de Prato")
            val fotoDoPrato = infosPratos.getInt("FOTO_DO_PRATO")
            val descricaoPratoPrincipal = infosPratos.getString("DESCRICAO_DO_PRATO", "Não ha uma descriçao")

            nomeDoPrato.text = nomePrato
            imgDoPrato.setImageResource(fotoDoPrato)
            descricaoDoPrato.text = descricaoPratoPrincipal

        } else {
            Toast.makeText(this, "Não foi possivel Carregar as informações", Toast.LENGTH_SHORT)
                .show()
        }
    }
}