package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*
import kotlin.collections.ArrayList

class Pessoa (val nome: String,val dataDeNascimento: Date,) : Movimentavel{

    var  veiculos: ArrayList<Veiculo> = ArrayList()
    var  carta: Carta = Carta()
    var  posicao: Posicao = Posicao()


    fun comprarVeiculo(veiculos: Veiculo) {}

    fun pesquisarVeiculo(identificador : String){}

    fun venderVeiculo(identificador: String , comprador: Pessoa){}

    fun moverVeiculoPara(identificador: String , x : Int , y : Int ){}

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){}
}