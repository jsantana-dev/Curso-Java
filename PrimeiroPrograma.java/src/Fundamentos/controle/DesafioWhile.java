package Fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) { // lê-se: enquanto nota for diferente de -1, execute o bloco de código
            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota; // total = total + nota
                qtdDeNotas++;
            } else if (nota != -1) { //lê-se: senão, se
                System.out.println("Nota inválida!!!");
            }
        }

        if (qtdDeNotas > 0) {
            double media = total / qtdDeNotas;
            System.out.println("\n-----Resultado-----");
            System.out.printf("Total de notas (soma) = %.2f ", total);
            System.out.println("Quantidade de notas = " + qtdDeNotas);
            System.out.printf("Média = %.2f ", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }

        entrada.close();
    }
}


/* desafio em java com apenas fundamentos básicos e estruturas de controle:
 calcular a média das notas de uma turma

não se sabe quantos alunos se tem nessa turma
usuário digita nota válida (de 0 a 10), se for true
armazena a nota em uma variável chamada total
e sempre que uma nova nota (válida) for digitada, acrescenta a total
de forma que total armazene a soma de todas as notas
uma nota válida: 1
segunda nota válida: 2

sistema tem que mostrar o total, a qtd de notas digitadas e média
e um sinal para sair do programa: -1

se digitar uma nota inválida, informe que está errado e
peça pra digitar uma nota válida
 */
