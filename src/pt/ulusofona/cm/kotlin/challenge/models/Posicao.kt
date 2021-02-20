package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

open class Posicao(var x: Int = 0 ,var y: Int = 0 ) : Movimentavel{

    override fun moverPara(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

}