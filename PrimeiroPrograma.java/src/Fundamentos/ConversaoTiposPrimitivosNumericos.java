package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float)1.123456788888; // explícita (cast) | ou 1.123456788888F;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (cast)
        System.out.println(d);

        double e = 1.999;
        int f = (int) e; // explícita (cast)
        System.out.println(f);
    }
}
