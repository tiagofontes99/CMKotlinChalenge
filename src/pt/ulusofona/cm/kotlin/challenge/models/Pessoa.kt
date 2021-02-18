package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.Main
import java.util.*

class Pessoa {

    fun Pessoa(nome: String, veiculos: List<Main.Veiculo>, dataDeNascimento: Date, carta: Main.Carta, posicao: Main.Posicao){}

    fun comprarVeiculo(veiculos: Main.Veiculo) {}

    fun pesquisarVeiculo(identificador : String){}

    fun venderVeiculo(identificador: String , comprador: Main.Pessoa){}

    fun moverVeiculoPara(identificador: String , x : Int , y : Int ){}

    fun temCarta(): Boolean{
        return true
    }

    fun tirarCarta(){}
}