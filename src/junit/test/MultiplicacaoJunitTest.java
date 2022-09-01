package junit.test;

import org.junit.Test;

import calculadora.Multiplicacao;

@SuppressWarnings("unused")
public class MultiplicacaoJunitTest {
	/* Teste da multiplicacao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(7, 5);
	}
	
	/* Teste da multiplicacao de dois valores inteiros,
	 * um positivo e um neutro.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(7, 0);
	}
	
	/* Teste da multiplicacao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, 5);
	}

	/* Teste da multiplicacao de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, -5);
	}
	
	/* Teste da multiplicacao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, .5);
	}
}
