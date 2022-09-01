package junit.test;

import org.junit.Test;

import calculadora.Divisao;

@SuppressWarnings("unused")
public class DivisaoJunitTest {
	/* Teste da divisao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, 5);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um positivo e um neutro.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, 0);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, 5);
	}

	/* Teste da divisao de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, -5);
	}
	
	/* Teste da divisao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, 0.2);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, -5);
	}
}
