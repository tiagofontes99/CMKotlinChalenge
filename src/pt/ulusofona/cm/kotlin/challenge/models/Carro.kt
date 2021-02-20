package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*
import java.time.LocalDateTime

class Carro (var motor: Motor = Motor(cavalos = 100 , cilindrada = 100 ) , dataDeAquisicao: Date) : Veiculo(
    identificador = "teste", posicao = Posicao(),
    dataDeAquisicao =  LocalDateTime.now()) {


}