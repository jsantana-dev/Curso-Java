package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10); //métodos de instância (objeto)
        //a1.pi = 10;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 5;
        System.out.println(a2.area());

        //AreaCirc.PI = 3.1415;
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}

/* desafios membros de classe vs instância

 alterar a classe do produto que já foi criada
 quando um desconto é aplicado, ele vale para todos os produtos sem exceção
 desconto ser uma variável de classe
 desconto pode variar mas por padrão é 25%
 */