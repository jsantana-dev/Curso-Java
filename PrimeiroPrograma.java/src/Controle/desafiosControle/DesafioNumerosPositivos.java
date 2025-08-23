package Controle.desafiosControle;

import java.util.Scanner;

public class DesafioNumerosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somadorDeNumeros = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número inteiro(ou negativo para sair): ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                somadorDeNumeros += numero;
                System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
            }
        }
        entrada.close();
    }
}
