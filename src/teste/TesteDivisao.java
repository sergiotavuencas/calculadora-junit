package teste;

import calculadora.Divisao;

public class TesteDivisao {
	public static void main(String [] args) {
		 Divisao divisao = new Divisao();
		
		 /* Caso de teste 1: o resultado da divisão
		  * não está sendo exibido por inteiro.
		  * */
		int resultado = divisao.calcular(10, 3);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da divisão
		 * está correto.
		 * */
		resultado = divisao.calcular(0, 10);
		System.out.println(resultado);
		
		/* Caso de teste 3: o resultado da divisão
		 * está aprensentando um erro, pois não há
		 * tratamento para quando ambos os valores
		 * são iguais a zero.
		 * */
		resultado = divisao.calcular(0, 0);
		System.out.println(resultado);
		
		/* Caso de teste 2: o resultado da divisão
		 * está correto.
		 * */
		resultado = divisao.calcular(10, -3);
		System.out.println(resultado);
		
		/* É necessário mudar o tipo de retorno para ponto flutuante, especificar 
		 * qual valor é o dividendo e qual é o divisor, e tratar com um if para 
		 * não aceitar ambos os valores iguais a zero.
		 * */
	}
}
