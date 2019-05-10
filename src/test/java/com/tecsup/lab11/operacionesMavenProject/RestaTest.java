package com.tecsup.lab11.operacionesMavenProject;

import org.junit.Test;

import junit.framework.Assert;

public class RestaTest {
	@Test
	public void testR() {
		Resta app = new Resta();
		int VALOR_ESPERADO = 2;
		int a=app.a;
		int b=app.b;
		int comparador=app.resta(a, b);
		Assert.assertEquals(VALOR_ESPERADO,comparador);
		
		
	}
}
