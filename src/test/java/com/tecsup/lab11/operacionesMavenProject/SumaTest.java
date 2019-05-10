package com.tecsup.lab11.operacionesMavenProject;

import org.junit.Test;

import junit.framework.Assert;

public class SumaTest {
	@Test
	public void testS() {
		Suma app = new Suma();
		int valor_esperado = 7;
		int a=3;
		int b=4;
		int comparador=app.suma(a, b);
		Assert.assertEquals(valor_esperado,comparador);
	}

}
