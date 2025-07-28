package Fundamentos;

//import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        System.out.println("Digite um número inteiro: ");
        //Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100; //classe Byte, objeto byte
        Short s = 1000;

        //Integer.parseInt(entrada.nextLine());
        Integer i = 10000;
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c.toString());

        //entrada.close();
    }
}
