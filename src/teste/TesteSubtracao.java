package teste;

import calculadora.Subtracao;

public class TesteSubtracao {
	public static void main(String [] args) {
		 Subtracao subtracao = new Subtracao();
		
		/* Caso de teste 1: o resultado da subtração
		 * está correto.
		 */
		int resultado = subtracao.calcular(10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da subtração
		 * está correto.
		 */
		resultado = subtracao.calcular(3, 10);
		System.out.println(resultado);
		
		/*	Caso de teste 3: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(-100, 50);
		System.out.println(resultado);
		
		/*	Caso de teste 4: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(50, -100);
		System.out.println(resultado);
		
		/* Caso de teste 5: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(-10, 0);
		System.out.println(resultado);
		
		/* Caso de teste 6: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(0, -10);
		System.out.println(resultado);
		
		/*	Caso de teste 7: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(-10, -3);
		System.out.println(resultado);
		
		/*	Caso de teste 8: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(0, 0);
		System.out.println(resultado);
		
		/*	Caso de teste 9: o resultado da subtração
		 * 	está correto.
		 * */
		resultado = subtracao.calcular(0.2, 0);
		System.out.println(resultado);
		
		/* É necessário mudar o tipo de retorno e os 
		 * parâmetros para aceitar ponto flutuante.
		 * */
	}
}
