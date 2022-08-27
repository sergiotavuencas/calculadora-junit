package teste;

import calculadora.Divisao;

public class TesteDivisao {
	public static void main(String [] args) {
		 Divisao divisao = new Divisao();
		
		 /* Caso de teste 1: o resultado da divisão
		  * não está completo.
		  * */
		int resultado = divisao.calcular(10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da divisão
		 * está correto.
		 * */
		resultado = divisao.calcular(0, 10);
		System.out.println(resultado);
		
		/* Caso de teste 3: é apresentado um erro
		 * pois o divisor precisa ser diferente de zero.
		 * */
		resultado = divisao.calcular(10, 0);
		System.out.println(resultado);
		
		/* Caso de teste 4: o resultado da divisão
		 * está incompleto.
		 * */
		resultado = divisao.calcular(10, -3);
		System.out.println(resultado);
		
		/* Caso de teste 5: é apresentado um erro
		 * pois não são aceitos valores com ponto
		 * flutuante.
		 * */
		resultado = divisao.calcular(10, -3.5);
		System.out.println(resultado);
		
		
		/* É necessário mudar o tipo de retorno e os 
		 * parâmetros para aceitar ponto flutuante, 
		 * especificar qual valor é o dividendo e 
		 * qual é o divisor, e aplicar uma condição 
		 * para não aceitar zero como divisor.
		 * */
	}
}
