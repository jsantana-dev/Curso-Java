package Classe;

public class Data {

    int dia;
    int mes;
    int ano;

    //construtor explícito
    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    String dataFormatada() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(dataFormatada());
    }
}
