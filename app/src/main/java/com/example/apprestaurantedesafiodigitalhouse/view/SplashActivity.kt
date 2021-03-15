package com.example.apprestaurantedesafiodigitalhouse.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.apprestaurantedesafiodigitalhouse.R

class SplashActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)

            Handler(Looper.getMainLooper()).postDelayed({
                val mIntent = Intent(this, MainActivity::class.java)
                startActivity(mIntent)
                finish()
            },5000
            )
        }
}