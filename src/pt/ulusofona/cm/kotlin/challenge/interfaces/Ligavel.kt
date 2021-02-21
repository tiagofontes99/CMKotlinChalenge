package pt.ulusofona.cm.kotlin.challenge.interfaces

interface Ligavel{
    fun ligar() : Boolean{
        return true
    }

    fun desligar(): Boolean{
        return false
    }

    fun estaLigado(ligado :Boolean) : Boolean {
        return ligado
    }
}