package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioFahrenheitCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double conversao = (fahrenheit - 32) / 1.8;

        System.out.println("Valor em Celsius: " + conversao);

        entrada.close();
    }
}
