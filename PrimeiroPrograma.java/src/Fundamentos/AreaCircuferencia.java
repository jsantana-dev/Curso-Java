package Fundamentos;

public class AreaCircuferencia {
    public static void main(String[] args) {

        //atribuição
        double raio = 3.4;
        final double pi = 3.14159;

        //multiplicação
        double area = pi * raio * raio;
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
