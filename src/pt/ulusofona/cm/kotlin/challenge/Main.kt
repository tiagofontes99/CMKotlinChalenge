package pt.ulusofona.cm.kotlin.challenge

import java.util.*

class Main {

    class AlterarPosicaoException() : Throwable() {}
    class MenorDeIdadeException() : Throwable() {}
    class PessoaSemCartaException () : Throwable() {}
    class VeiculoNaoEncontradoException () : Throwable() {}
    class VeiculoDesligadoException () : Throwable() {}
    class VeiculoLigadoException () : Throwable() {}


    data class Pessoa(var nome: String, var veiculos: List<Veiculo>, var dataDeNascimento: Date, var carta: Carta, var posicao: Posicao) {

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

    class Carta() {
        fun Carta(){}
    }

    class Posicao( var x: Int , var y: Int) {
        fun Posicao(x: Int , y: Int){}
    }

    class Motor(var cavalos : Int, var cilindrada : Int , var ligado: Boolean) {
        fun Motor(cavalos: Int, cilindrada: Int){}

    }

    class Bicicleta() {

    }

    class Carro(var identificador: String){
        fun Carro(identificador: String){}

    }

    data class Veiculo(
        var nome: String,
        var veiculos: List<Veiculo>
    ){

        fun Veiculo(identificador: String){}

        fun requerCarta():Boolean{
            return true
        }

    }

    interface Ligavel {

        fun ligar(){}

        fun desligar(){}

        fun estaLigado() : Boolean {
            return true
        }

    }

    interface Movimentavel {
        fun moverPara(x: Int , y: Int){}

    }



}
fun main() {
    // aqui escreves o código do programa

}