package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(var cavalos: Int , var cilindrada : Int ) : Ligavel {
    var ligado : Boolean = false

    override fun ligar() : Boolean{
        ligado = true
        return true
    }

    override fun desligar(): Boolean{
        ligado = false
        return false
    }

    override fun estaLigado(ligado :Boolean) : Boolean {
        return ligado
    }


}