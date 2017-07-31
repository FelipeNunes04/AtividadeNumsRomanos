package br.edu.ifpi.converteromanos;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {
	@Test
	public void deveConverterNumRomanosEmInteiros() {
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int num1 = conversor.converte("XV");
		int num2 = conversor.converte("XXVIII");
		int num3 = conversor.converte("IV");
		int num4 = conversor.converte("IIIIV");
		int num5 = conversor.converte("IIVV");
		
		Assert.assertEquals(15, num1);
		Assert.assertEquals(28, num2);
		Assert.assertEquals(4, num3);
		Assert.assertEquals(0, num4);
		Assert.assertEquals(0, num5);

	}
}
