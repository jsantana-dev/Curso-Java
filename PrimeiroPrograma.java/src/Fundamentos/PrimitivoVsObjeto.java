package Fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = "texto"; //String é uma classe e "texto" é um objeto
        s.toUpperCase();

        // Wrappers = versão objeto dos tipos primitivos (só carrega seu valor)
        int a = 123;
        System.out.println(a);

    }
}
