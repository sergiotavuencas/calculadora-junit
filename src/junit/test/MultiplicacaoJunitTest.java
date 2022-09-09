package junit.test;

import org.junit.Test;

import calculadora.Multiplicacao;
import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
public class MultiplicacaoJunitTest {
	/* Teste da multiplicacao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(7, 5);
		
		Assert.assertEquals(35, teste);
	}
	
	/* Teste da multiplicacao de dois valores inteiros,
	 * um positivo e um neutro.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(7, 0);
		
		Assert.assertEquals(0, teste);
	}
	
	/* Teste da multiplicacao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, 5);
		
		Assert.assertEquals(-35, teste);
	}

	/* Teste da multiplicacao de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, -5);
		
		Assert.assertEquals(35, teste);
	}
	
	/* Teste da multiplicacao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Multiplicacao multiplicacao = new Multiplicacao();
		int teste = multiplicacao.calcular(-7, .5);
		
		Assert.assertEquals(-3.5, teste);
	}
}
