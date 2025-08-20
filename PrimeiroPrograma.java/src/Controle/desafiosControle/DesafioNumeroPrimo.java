package Fundamentos.desafiosControle;

import java.util.Scanner;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {

        int contadorDeDivisores = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite um número para verificar se é primo: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO número " + numero + " é primo.");
        } else {
            System.out.println("\nO número " + numero + " não é primo.");
        }

        entrada.close();
    }
}
