package junit.test;

import org.junit.Test;

import calculadora.Subtracao;
import junit.framework.Assert;

@SuppressWarnings({"unused", "deprecation"})
public class SubtracaoJunitTest {
	/* Teste da subtracao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, 5);
		
		Assert.assertEquals(2, teste);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(5, 7);
		
		Assert.assertEquals(-2, teste);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, 5);
		
		Assert.assertEquals(-12, teste);
	}

	/* Teste da subtracao de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, -5);
		
		Assert.assertEquals(12, teste);
	}
	
	/* Teste da subtracao de dois valores inteiros,
	 * um negativo e um neutro.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, 0);
		
		Assert.assertEquals(-7, teste);
	}

	/* Teste da subtracao de dois valores inteiros,
	 * um neutro e um negativo.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(0, -5);
		
		Assert.assertEquals(5, teste);
	}
	
	/* Teste da subtracao de dois valores inteiros
	 * e neutros.
	 * */
	@Test
	public void SetimoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(0, 0);
		
		Assert.assertEquals(0, teste);
	}
	
	/* Teste da subtracao de dois valores inteiros
	 * e negativos.
	 * */
	@Test
	public void OitavoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(-7, -5);
		
		Assert.assertEquals(-2, teste);
	}
	
	/* Teste da subtracao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void NonoCasoDeTeste() {
		Subtracao subtracao = new Subtracao();
		int teste = subtracao.calcular(7, .5);
		
		Assert.assertEquals(6.5, teste);
	}
}
