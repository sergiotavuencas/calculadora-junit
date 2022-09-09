package junit.test;

import org.junit.Test;

import calculadora.Divisao;
import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
public class DivisaoJunitTest {
	/* Teste da divisao de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, 5);
		
		Assert.assertEquals(1.4, teste);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um positivo e um neutro.
	 * */
	@SuppressWarnings("deprecation")
	@Test
	public void SegundoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, 0);
		
		Assert.assertEquals(0, teste);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, 5);
		
		Assert.assertEquals(-1.4, teste);
	}

	/* Teste da divisao de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, -5);
		
		Assert.assertEquals(1.4, teste);
	}
	
	/* Teste da divisao de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(-7, 0.2);
		
		Assert.assertEquals(-35, teste);
	}
	
	/* Teste da divisao de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Divisao divisao = new Divisao();
		int teste = divisao.calcular(7, -5);
		
		Assert.assertEquals(-1.4, teste);
	}
}
