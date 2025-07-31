package Fundamentos.desafiosBasicos;

import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        entrada.close();
    }
}
