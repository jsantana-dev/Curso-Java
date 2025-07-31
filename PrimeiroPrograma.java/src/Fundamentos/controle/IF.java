package Fundamentos.controle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Você está aprovado!");
            System.out.println("Parabéns!");
        }

        if (media < 7 && media >= 5.0) {
            System.out.println("Você está em recuperação!");
            System.out.println("Estude!");
        }

        if (media < 5 && media >= 0) {
            System.out.println("Você está reprovado!");
        }
        entrada.close();
    }
}
