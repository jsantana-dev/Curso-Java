package Fundamentos.desafiosBasicos;

import java.util.Scanner;

public class DesafioMathPow {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor = entrada.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O valor ao quadrado é: " + quadrado);
        System.out.println("O valor ao cubo é: " + cubo);

        entrada.close();

    }
}
