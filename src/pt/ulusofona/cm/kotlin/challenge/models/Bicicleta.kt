package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDateTime
import java.util.*

class Bicicleta (override val identificador : String): Veiculo(
    identificador){

    override fun requerCarta(): Boolean {
        return false
    }

    override fun toString() : String{
        return "Bicicleta | $identificador | $dataDeAquisicao | $posicao"
    }




}