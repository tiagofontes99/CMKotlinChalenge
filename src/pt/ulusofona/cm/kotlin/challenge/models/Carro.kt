package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDateTime
import java.util.*

class Carro(override val identificador: String, var motor: Motor, var dataDeAquisicao: Date = Date()) : Veiculo(
    identificador)
    {
        override fun requerCarta(): Boolean {
            return true
        }

}