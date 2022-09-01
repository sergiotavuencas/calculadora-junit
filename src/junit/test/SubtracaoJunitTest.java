package junit.test;

import org.junit.Test;

import calculadora.Subtracao;

@SuppressWarnings("unused")
public class SubtracaoJunitTest {
	/* Teste da subtracao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, 5);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(5, 7);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, 5);
	}

	/* Teste da subtracao de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, -5);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * um negativo e um neutro.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, 0);
	}

	/* Teste da subtracao de dois valores inteiros,
	 * um neutro e um negativo.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(0, -5);
	}
	
	/* Teste da subtracao de dois valores inteiros
	 * e neutros.
	 * */
	@Test
	public void SetimoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(0, 0);
	}
	
	/* Teste da subtracao de dois valores inteiros
	 * e negativos.
	 * */
	@Test
	public void OitavoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, -5);
	}
	
	/* Teste da subtracao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void NonoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, .5);
	}
}
