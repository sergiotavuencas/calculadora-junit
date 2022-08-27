package teste;

import calculadora.Soma;

public class TesteSoma {
	public static void main(String [] args) {
		Soma soma = new Soma();
		
		/* Caso de teste 1: o resultado da soma
		 * está correto.
		 * */
		int resultado = soma.calcular(10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da soma
		 * está correto.
		 * */
		resultado = soma.calcular(0, 10);
		System.out.println(resultado);
		
		/* Caso de teste 3: o resultado da soma
		 * está correto.
		 * */
		resultado = soma.calcular(0, 0);
		System.out.println(resultado);
		
		/* Caso de teste 4: o resultado da soma
		 * está correto.
		 * */
		resultado = soma.calcular(10, -3);
		System.out.println(resultado);
		
		/* Caso de teste 5: o resultado da soma
		 * está correto.
		 * */
		resultado = soma.calcular(-10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 6: o resultado da soma
		 * está correto.
		 * */
		resultado = soma.calcular(-10, -3);
		System.out.println(resultado);
		
		/* Caso de teste 7: etá apresentando um
		 * erro pois valores com ponto flutuante
		 * não são aceitos.
		 * */
		resultado = soma.calcular(10, 3.2);
		System.out.println(resultado);
		
		/* É necessário mudar o tipo de retorno e os 
		 * parâmetros para aceitar ponto flutuante.
		 * */
	}
}
