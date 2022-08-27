package teste;

import calculadora.Multiplicacao;

public class TesteMultiplicacao {
	public static void main(String [] args) {
		 Multiplicacao multiplicacao = new Multiplicacao();
		
		/* Caso de teste 1: o resultado da multiplicação
		 * está correto.
		 * */
		int resultado = multiplicacao.calcular(10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da multiplicação
		 * está correto.
		 * */
		resultado = multiplicacao.calcular(0, 10);
		System.out.println(resultado);
		
		/* Caso de teste 3: o resultado da multiplicação
		 * está correto.
		 * */
		resultado = multiplicacao.calcular(0, 0);
		System.out.println(resultado);
		
		/* Caso de teste 4: o resultado da multiplicação
		 * está correto.
		 * */
		resultado = multiplicacao.calcular(-10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 5: o resultado da multiplicação
		 * está correto.
		 * */
		resultado = multiplicacao.calcular(10, -3);
		System.out.println(resultado);
		
		/* Caso de teste 6: o resultado da multiplicação
		 * está correto.
		 * */
		resultado = multiplicacao.calcular(-10, -3);
		System.out.println(resultado);
		
		/* Caso de teste 7: é apresentado um erro pois
		 * não são aceitos valores com ponto flutuante.
		 * */
		resultado = multiplicacao.calcular(-10.5, 3);
		System.out.println(resultado);
		
		/* É necessário mudar o tipo de retorno e os 
		 * parâmetros para aceitar ponto flutuante.
		 * */
	}
}
