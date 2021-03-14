package com.example.apprestaurantedesafiodigitalhouse.model

data class Restaurante (val nomeDoRestaurante: String, val endereco: String, val horarioDeFuncionamento: String, val fotoDoRestaurante: Int, val listaDePratosDoRestaurante: List<PratosDoRestaurantes>) {
}