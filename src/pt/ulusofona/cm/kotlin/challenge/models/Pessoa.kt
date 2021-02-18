package pt.ulusofona.cm.kotlin.challenge.models
import java.util.*

class Pessoa {

    fun Pessoa(nome: String, veiculos: List<Veiculo>, dataDeNascimento: Date, carta: Carta, posicao: Posicao){}

    fun comprarVeiculo(veiculos: Veiculo) {}

    fun pesquisarVeiculo(identificador : String){}

    fun venderVeiculo(identificador: String , comprador: Pessoa){}

    fun moverVeiculoPara(identificador: String , x : Int , y : Int ){}

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){}
}