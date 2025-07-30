package Fundamentos.primitivos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        //não é possível mudar o que a String recebe
        String s = "Boa tarde!";
        s = s.toUpperCase();
        System.out.println(s.concat("!!"));
        System.out.println(s + "!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Jamylle";
        var sobrenome = "Santana";
        var idade = 33;
        var salario = 12345.987;
        System.out.println("Nome: " + nome +
                " Sobrenome: " + sobrenome +
                " Idade: " + idade +
                " Salário: " + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
