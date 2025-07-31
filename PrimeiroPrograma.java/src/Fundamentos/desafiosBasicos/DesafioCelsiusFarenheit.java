package Fundamentos.desafiosBasicos;

import java.util.Scanner;

public class DesafioCelsiusFarenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("Valor em Fahrenheit: %.2f%n",fahrenheit);

        entrada.close();
    }
}
