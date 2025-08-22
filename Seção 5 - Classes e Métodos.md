**Seção 5 - Classes e Métodos**



.java -> Produto.java (arquivo fica dentro de um pacote)

Produto.java -> public class Produto {} = Classe pública, tem que ter o mesmo nome do arquivo

o nome influencia desde que a Classe seja pública





Programa real:

Escolha uma Classe para colocar dentro de outra Classe com método main. (Porta de entradada do programa)

Todas as outras classes não terão método main.



Classe define {} bloco de código

public class Produto {

 	public static void main (String\[] args) { --> bloco de código



 	}

}



**Classe vs Objeto #01**



Anatomia de uma Classe

class Nome {

 	//corpo (conteúdo)

}



pode haver variações antes de class e depois de Nome

corpo:

* atributos -> dados ex.: int, boolean, Date, String
* comportamentos -> métodos ex.: Main (execução, algoritmos)



são chamados de membros



**Classe vs Objeto #02**



* Classe define um tipo e um tipo é uma estrutura de dados, ou seja, Classe é uma estrutura de dados.
* Classe representa uma simplificação.
* Os dados criados a partir das classes são chamados de objetos.
* Objeto == instância.



**Membros de uma Classe**



Tudo que declaramos dentro do corpo da Classe (dentro das chaves{}). Ou seja, dentro dos blocos de construção é chamado de membro.



* Os blocos de construção que define o que a Classe sabe (dados/atributos) e o que ela sabe fazer (métodos).



**Atributos ou Métodos podem pertencer à instância (objeto) ou à Classe.**



**Atributos**

São as variáveis que armazenam os dados (o estado) de um objeto ou de uma Classe.



* Atributos de Objetos:



Cada objeto criado a partir de uma Classe terá sua própria cópia desses atributos.

Se você criar dois objetos *Produto*, cada um terá seu próprio *nome* e *preco*. Mudar o preço de um não afeta o outro.



Ex.:

public class Produto {

 	String nome; // atributo de objeto

 	double preco; // ""

 	double desconto; // ""

}



* Atributos de Classes (Atributos Estáticos/*static*):



1. São declarados com a palavra-chave *static*;
2. Existe apenas uma cópia desse atributo, que é compartilhada por todos os objetos daquela Classe. Ele pertence à Classe em si.
3. É ideal para valores constantes ou dados que devem ser os mesmos para todas as instâncias.



Ex.:

public class Produto {

 	String nome;

 	double preco;



 	//Este valor é o mesmo para **TODOS** os produtos.

 	static double FATOR\_IMPOSTO = 0.08; //atributo de Classe



**Métodos**

São blocos de código que definem comportamentos e ações que um objeto ou Classe pode executar.



* Métodos de Objeto:



1. Operam sobre um objeto específico.
2. Eles podem ler e modificar os atributos de instância daquele objeto.
3. A maioria dos métodos que você vai criar será de instância.



Ex.:

public class Produto {

 	String nome;

 	double preco;



 	//Método de instância: calcula o preço com desconto **para este** produto.

 	double precoComDesconto(double desconto) {

 	return preco \* (1 - desconto);

 	}

}





* Métodos de Classes (Métodos Estáticos/*static*).



1. São declarados com a palavra-chave *static*.
2. Pertencem à uma Classe. Para chamá-los você (geralmente) usa o nome da Classe (*Produto.metodoEstatico()*)
3. **NÃO PODEM** acessar atributos de objetos, pois não estão associados a nenhum objeto em particular. Só podem acessar outros membros estáticos.
4. O método *main* é o exemplo mais comum. Ele precisa ser *static* para que a JVM possa executá-lo sem precisar criar um objeto da sua Classe primeiro.



Ex.:

public class Produto {

 	//.. atributos



 	// Método estático: uma função utilitária que pertence à Classe.

 	static void manualProduto() {

 	System.out.println("Esse é o manual geral para todos os produtos.");

 	}

}



**Construtores**

Os construtores são considerados membros especiais de uma Classe.



1. É um bloco de código especial usado para criar e inicializar um objeto.
2. Ele tem o mesmo nome da Classe e não possui tipo de retorno (nem mesmo *void*).



Ex.:

public class Produto {

 	String nome;

 	double preco;



 	// Construtor: usado para criar um objeto Produto já com nome e preço.

 	Produto(String nomeInicial, double precoInicial) {

 		nome = nomeInicial;

 		preco = precoInicial;

 	}

}



**Métodos #01**

São os comportamentos de uma classe. Blocos de código nomeados que executam uma ação ou uma tarefa específica, tem como principal função agrupar lógica para que ela possa ser reutilizada, evitando repetição.



