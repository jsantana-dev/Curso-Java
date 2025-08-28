package Classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(19, 9, 2023);
        String dataFormatada1 = d1.dataFormatada();
        System.out.println(dataFormatada1);
        d1.imprimirDataFormatada();

        var d2 = new Data();
        String dataFormatada2 = d2.dataFormatada();
        System.out.println(dataFormatada2);
        d2.imprimirDataFormatada();

    }
}

/*
Desafio 1:
dentro da classe data, criar três atributos: dia, mês e ano
não se preocupar em restringir ou olhar validações

dentro da classe data teste, instanciar duas datas (new/construtor)
 */

/*
Desafio 2:
criar dois construtores: um padrão e um explícito
explícito receberá dia, mês e ano
quando chamar o padrão, se não informar o dia, mes e ano
que, por padrão, imprima a data 1, mês 1 e ano 1970
 */