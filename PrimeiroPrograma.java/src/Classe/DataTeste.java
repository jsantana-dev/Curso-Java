package Classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 19;
        d1.mes = 9;
        d1.ano = 2023;

        System.out.printf("%02d/%02d/%d\n", d1.dia,d1.mes,d1.ano);

        Data d2 = new Data(); //funciona perfeitamente com var d2 = new Data();
        d2.dia = 5;
        d2.mes = 2;
        d2.ano = 2024;

        System.out.printf("%02d/%02d/%d", d2.dia,d2.mes,d2.ano);

    }
}

/*
dentro da classe data, criar três atributos: dia, mês e ano
não se preocupar em restringir ou olhar validações

dentro da classe data teste, instanciar duas datas (new/construtor)
 */