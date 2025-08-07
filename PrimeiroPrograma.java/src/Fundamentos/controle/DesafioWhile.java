package Fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                qtdDeNotas++;
            }

            double media = total / qtdDeNotas;
            System.out.println("Média = " + media);


            entrada.close();
        }
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

sistema tem que mostra o total, a qtd de notas digitadas e média
e um sinal para sair do programa: -1

se digitar uma nota inválida, informe que está errado e
peça pra digitar uma nota válida

 */
