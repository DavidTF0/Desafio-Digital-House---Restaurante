package com.example.apprestaurantedesafiodigitalhouse.model

import com.example.apprestaurantedesafiodigitalhouse.R

object ListasDeItens {


    private fun listaDeRestaurantes(): List<Restaurante> {

        val listaDeRestaurantes = listOf<Restaurante>(

            Restaurante(
                "Vila São João",
                "Av. Do Estado 1234",
                "10:00 as 22:00",
                R.drawable.restaurante01,
                Restaurante01()
            ),

            Restaurante(
                "Don Maria",
                "Av. Do Estado 3528",
                "11:00 as 21:00",
                R.drawable.restaurante02,
                Restaurante02()
            )
        )
        return listaDeRestaurantes
    }


    private fun Restaurante01(): List<PratosDoRestaurantes> {
        val listaDePratoRestaurate01 = listOf<PratosDoRestaurantes>(
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            ),
            PratosDoRestaurantes(
                "Lazanha",
                R.drawable.prato_lasanha,
                "Lazanha assada no forno, feita com presunto, mussarela e carne moida"
            )
        )
        return listaDePratoRestaurate01
    }

    private fun Restaurante02(): List<PratosDoRestaurantes> {

        val listaDePratosDoRestaurantes02 = listOf<PratosDoRestaurantes>(

            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            ),
            PratosDoRestaurantes(
                "Bife De Contra File",
                R.drawable.bife_de_contra_file,
                "Bife de Contra File com Fritas, acompanhado de arroz e Feijão"
            )
        )
        return listaDePratosDoRestaurantes02
    }

    fun getListaDeRestaurantes(): List<Restaurante> {
        return listaDeRestaurantes()
    }
}


