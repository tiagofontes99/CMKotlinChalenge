package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


open class Veiculo(open val identificador: String) : Movimentavel{

    fun requerCarta() : Boolean{
        return false
    }

}