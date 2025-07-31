package Fundamentos.desafios;


public class DesafioEquacaoSegundoGrau {
    public static void main(String[] args) {

        System.out.println("Equação Quadrática: ax² + bx + c = 0");

        int a = 1;
        int b = 12;
        int c = -13;

        System.out.printf("Sua equação é: %dx² + %dx + %d = 0", a, b, c);
        System.out.println("\nPara achar delta, faça: delta = b² -4ac");

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta é igual a: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a); //calcula raiz quadrada
        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("\nO x2 da equação é: %.2f", x2);

    }
}
