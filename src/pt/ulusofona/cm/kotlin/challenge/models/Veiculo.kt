package pt.ulusofona.cm.kotlin.challenge.models
import java.time.LocalDateTime

open class Veiculo(open var identificador: String, var posicao: Posicao, var dataDeAquisicao: LocalDateTime){

}