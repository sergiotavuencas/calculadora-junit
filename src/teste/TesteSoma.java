package teste;

import calculadora.Soma;

public class TesteSoma {
	public static void main(String [] args) {
		Soma soma = new Soma();
		
		// Case de teste 1: soma de dois valores
		int resultado = soma.calcular(10, 3);
		System.out.println(resultado);
		
		resultado = soma.calcular(0, 10);
		System.out.println(resultado);
		
		resultado = soma.calcular(0, 0);
		System.out.println(resultado);
		
		resultado = soma.calcular(10, -3);
		System.out.println(resultado);
	}
}
