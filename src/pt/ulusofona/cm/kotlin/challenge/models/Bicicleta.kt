package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDateTime

class Bicicleta (override var identificador : String): Veiculo(
    identificador, posicao = Posicao(),
    dataDeAquisicao =  LocalDateTime.now()){
}