package Fundamentos.controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.5) {
                System.out.println("A!");
        } else if (nota >= 7) {
            System.out.println("B!");
        } else if (nota >= 5.5) {
            System.out.println("C!");
        } else if (nota >= 4) {
            System.out.println("D!");
        } else if (nota >= 2.5) {
            System.out.println("E");
        } else {
            System.out.println("F, Reprovado!");
        }

        System.out.println("Fim.");
            entrada.close();
        }
    }
