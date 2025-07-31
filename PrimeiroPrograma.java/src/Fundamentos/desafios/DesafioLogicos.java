package Fundamentos.desafios;

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = comprouTV50 || comprouTV32;

        System.out.println("Comprou TV 50\'? " + comprouTV50);
        System.out.println("Comprou TV 32\'? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + !comprouSorvete);

    }
}

/*
trabalho na terça (V ou F)
trabalho na quinta (V ou F)
condicional: se os dois forem V, "compra" TV de 50'
condicional 2: se apenas um for V, "compra" TV de 32'
condicional 3: "comprando" a de 50' ou de 32', toma sorvete
condicional 4: se os dois forem F, ficam em casa, + saudável
 */