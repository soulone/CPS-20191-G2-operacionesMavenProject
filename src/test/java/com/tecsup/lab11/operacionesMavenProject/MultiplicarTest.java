package com.tecsup.lab11.operacionesMavenProject;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplicarTest {
	@Test
	public void testM() {
		Multiplicar app = new Multiplicar();
		int valor_esperado = 12;
		int a=3;
		int b=4;
		int comparador=app.multiplicar(a, b);
		Assert.assertEquals(valor_esperado,comparador);
	}

}
