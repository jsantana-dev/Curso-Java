package Classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    //pode ser usado também os parâmetros que ficam dentro dos ()
    //mas só ficaria acessível ao chamar o metodo precoComDesconto
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
