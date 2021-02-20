package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDateTime

class Bicicleta (): Veiculo(
    identificador = "teste", posicao = Posicao(),
    dataDeAquisicao =  LocalDateTime.now()){
}