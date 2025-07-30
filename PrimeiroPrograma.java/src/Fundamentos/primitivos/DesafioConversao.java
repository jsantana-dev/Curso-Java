package Fundamentos.primitivos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro salário: ");
        String s1 = entrada.nextLine().replace(",",".");

        System.out.println("Digite seu segundo salário: ");
        String s2 = entrada.nextLine().replace(",",".");

        System.out.println("Digite seu terceiro salário: ");
        String s3 = entrada.nextLine().replace(",",".");

        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);
        double num3 = Double.parseDouble(s3);

        double soma = num1 + num2 + num3;
        double media = (num1 + num2 + num3) / 3;

        System.out.printf("A Soma dos salários é igual a: R$%.2f%n", soma);
        System.out.printf("A Média: R$%.2f%n", media);

        entrada.close();
    }
}
/*
usando scanner, 3 strings vão poder receber 3 salários
para calcular a média dos últimos 3 salários de uma pessoa
(somar os 3 e dividir por 3)
flexibilidade de separar as casas decimais com . ou ,
converter string em valor numérico
 */