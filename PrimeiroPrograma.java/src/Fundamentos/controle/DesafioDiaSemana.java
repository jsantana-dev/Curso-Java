package Fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");

        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("Primeiro dia da semana, 1");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("Segundo dia da semana, 2");
        } else if (dia.equalsIgnoreCase("terça")
                || dia.equalsIgnoreCase("terca")) {
            System.out.println("Terceiro dia da semana, 3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("Quarto dia da semana, 4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("Quinto dia da semana, 5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("Sexto dia da semana, 6");
        } else if (dia.equalsIgnoreCase("sábado")
                || dia.equalsIgnoreCase("sabado")){
            System.out.println("Sétimo dia da semana, 7");
        } else {
            System.out.println("Dia inválido.");
        }

        entrada.close();
    }
}

/*
if("domingo".equalsIgnoreCase(dia)) {
    System.out.println(1);
}

da no mesmo, segunda opção
 */