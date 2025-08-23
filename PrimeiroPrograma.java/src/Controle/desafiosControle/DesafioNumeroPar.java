package Controle.desafiosControle;

import java.util.Scanner;

public class DesafioNumeroPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " está entre 0 e 10.");
            } else {
                System.out.println("O número " + numero + " está entre 0 e 10 mas não é um número par.");
            }
        } else {
                System.out.println("O número " + numero + " não está entre 0 e 10,");
            }
        entrada.close();
        }
    }

