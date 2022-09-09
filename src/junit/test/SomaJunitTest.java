package junit.test;

import org.junit.Test;

import calculadora.Soma;
import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
public class SomaJunitTest {
	/* Teste da soma de dois valores inteiros,
	 * e positivos.
	 * */
	@Test
	public void PrimeiroCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, 5);
		
		Assert.assertEquals(12, teste);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * um neutro, e um positivo.
	 * */
	@Test
	public void SegundoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(0, 5);
		
		Assert.assertEquals(5, teste);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * e neutros.
	 * */
	@Test
	public void TerceiroCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(0, 0);
		
		Assert.assertEquals(0, teste);
	}

	/* Teste da soma de dois valores inteiros,
	 * um positivo e um negativo.
	 * */
	@Test
	public void QuartoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, -5);
		
		Assert.assertEquals(2, teste);
	}
	
	/* Teste da soma de dois valores inteiros,
	 * um negativo e um positivo.
	 * */
	@Test
	public void QuintoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(-7, 5);
		
		Assert.assertEquals(-2, teste);
	}

	/* Teste da soma de dois valores inteiros,
	 * e negativos.
	 * */
	@Test
	public void SextoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(-7, -5);
		
		Assert.assertEquals(-12, teste);
	}
	
	/* Teste da soma de dois valores, um inteiro,
	 * e um com ponto flutuante.
	 * */
	@Test
	public void SetimoCasoDeTeste() {
		Soma soma = new Soma();
		int teste = soma.calcular(7, .5);
		
		Assert.assertEquals(7.5, teste);
	}
}
