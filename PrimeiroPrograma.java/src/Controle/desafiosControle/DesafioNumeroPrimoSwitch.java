package Controle.desafiosControle;

import java.util.Scanner;

public class DesafioNumeroPrimoSwitch {
    public static void main(String[] args) {

        int contadorDeDivisores = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        int resultado = (contadorDeDivisores == 0 && numero > 1) ? 0 : 1;

        switch (resultado) {
            case 0:
                System.out.println("\nO número " + numero + " é primo.");
                break;
            case 1:
                System.out.println("\nO número " + numero + " não é primo.");
                break;
        }
        entrada.close();
    }
}
