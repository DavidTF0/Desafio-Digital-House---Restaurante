package com.example.apprestaurantedesafiodigitalhouse.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.apprestaurantedesafiodigitalhouse.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    val btnLogin by lazy { findViewById<Button>(R.id.btn_login) }
    val layoutEmail by lazy { findViewById<TextInputLayout>(R.id.text_input_layout_email) }
    val layoutPassword by lazy { findViewById<TextInputLayout>(R.id.text_input_layout_password) }
    val inputTextEmail by lazy { findViewById<TextInputEditText>(R.id.text_input_email) }
    val inputTextPassword by lazy { findViewById<TextInputEditText>(R.id.text_input_password) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        login()
    }


    fun login() {

        btnLogin.setOnClickListener {

            val intentIniciarApp = Intent(it.context, TelaInicialRestaurantesActivity::class.java)
            it.context.startActivity(intentIniciarApp)

        }
    }


}