package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDateTime
import java.util.*

class Carro(override val identificador: String, var motor: Motor) : Veiculo(
    identificador)
    {
        override fun requerCarta(): Boolean {
            return true
        }


        override fun toString() : String{
            return "Carro | $identificador | $dataDeAquisicao | $posicao"
        }

        @JvmName("getMotor1")
        fun getMotor() : Motor{
            return motor
        }

        fun getmotor() : Motor{
            return motor
        }


}