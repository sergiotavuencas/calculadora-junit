package teste;

import calculadora.Multiplicacao;

public class TesteMultiplicacao {
	public static void main(String [] args) {
		 Multiplicacao multiplicacao = new Multiplicacao();
		
		int resultado = multiplicacao.calcular(10, 3);
		System.out.println(resultado);
		
		resultado = multiplicacao.calcular(0, 10);
		System.out.println(resultado);
		
		resultado = multiplicacao.calcular(0, 0);
		System.out.println(resultado);
		
		resultado = multiplicacao.calcular(-10, -3);
		System.out.println(resultado);
	}
}
