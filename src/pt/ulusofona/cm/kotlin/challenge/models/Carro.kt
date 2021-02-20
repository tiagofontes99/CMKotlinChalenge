package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*
import java.time.LocalDateTime

class Carro (var mototr : Motor, dataDeAquisicao: Date) : Veiculo(
    identificador = "teste", posicao = Posicao(),
    dataDeAquisicao =  LocalDateTime.now()) {


}