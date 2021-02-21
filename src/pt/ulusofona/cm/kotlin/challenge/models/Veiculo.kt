package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDateTime
import java.util.*


open class Veiculo(open val identificador: String) : Movimentavel{
    var posicao : Posicao = Posicao()

    open var dataDeAquisicao : Date = Date()

    open fun requerCarta() : Boolean{
        return true
    }




}