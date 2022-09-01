package junit.test;

import org.junit.Test;

import calculadora.Soma;

@SuppressWarnings("unused")
public class SomaJunitTest {
	/* Teste da soma de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, 5);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * um neutro, e um positivo.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(0, 5);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * e neutros.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(0, 0);
	}

	/* Teste da soma de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, -5);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(-7, 5);
	}

	/* Teste da soma de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(-7, -5);
	}
	
	/* Teste da soma de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void SetimoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, .5);
	}
}
