package pt.ulusofona.cm.kotlin.challenge.models
import java.util.*

class Pessoa (var nome: String,var  veiculos: List<Veiculo>,var dataDeNascimento: Date,var  carta: Carta,var  posicao: Posicao){


    fun comprarVeiculo(veiculos: Veiculo) {}

    fun pesquisarVeiculo(identificador : String){}

    fun venderVeiculo(identificador: String , comprador: Pessoa){}

    fun moverVeiculoPara(identificador: String , x : Int , y : Int ){}

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){}
}