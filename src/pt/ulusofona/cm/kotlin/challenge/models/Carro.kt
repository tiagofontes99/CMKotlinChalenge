package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*
import java.time.LocalDateTime

class Carro (override val identificador : String, var motor: Motor , dataDeAquisicao: Date) : Veiculo(
    identificador)
    {


}