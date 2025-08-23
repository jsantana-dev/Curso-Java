package Controle.desafiosControle;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMediaFinal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Informe sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Sua média foi " + media + " e você está aprovada.");
        } else if (media >= 4) {
            System.out.println("Sua média foi " + media + " e você está de recuperação.");
        } else {
            System.out.println("Sua média foi " + media + " e você está reprovado.");
        }

        entrada.close();
    }
}
