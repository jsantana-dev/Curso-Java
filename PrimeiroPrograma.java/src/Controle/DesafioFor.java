package Controle;

public class DesafioFor {
    public static void main(String[] args) {

        for(String v = "#"; !v.equals("########"); v+= "#") {
            System.out.println(v);
        }
    }
}

/*
Desafio: fazer uma escadinha

não pode usar valor numérico para controlar o laço

ex.:
String valor = "#";
        for(int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
 */