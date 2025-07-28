package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        //o java não permite mudança do tipo de variável

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; //declaração da variável
        d = 123.65; //inicialização
        System.out.println(d); //usada

        var e = 123.45;
        System.out.println(e);

        var f = 12; //inteiro
        //f = 12.01;
    }
}
