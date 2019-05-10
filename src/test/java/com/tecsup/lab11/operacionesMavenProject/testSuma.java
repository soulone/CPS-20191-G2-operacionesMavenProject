package com.tecsup.lab11.operacionesMavenProject;

import org.junit.Assert;
import org.junit.Test;


public class testSuma {
	@Test
	public void testS() {		
		Suma app = new Suma();		
		Assert.assertEquals(app.suma(4, 3), 7);
	}
}
