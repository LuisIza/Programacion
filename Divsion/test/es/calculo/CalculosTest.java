package es.calculo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculosTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testDivision() {
		//fail("Not yet implemented");
		double valorReal =  Calculos.division(4,2);
		double valorEsperado = 2.0;
		assertEquals (valorEsperado,valorReal,0.001);
	}
	
	@Test
	void testDivision1() {
		//fail("Not yet implemented");
		double valorReal =  Calculos.division(4,0);
		double valorEsperado = -1.0;
		assertEquals (valorEsperado,valorReal,0.001);
	}

	@Test
	void testDivision2() {
		//fail("Not yet implemented");
		double valorReal =  Calculos.division(2,3);
		double valorEsperado = 0.666;
		assertEquals (valorEsperado,valorReal,0.001);
	}
	
	@Test
	void testAreaCirculo() {
		//fail("Not yet implemented");
		double valorReal =  Calculos.areaCirculo(5);
		double valorEsperado = 78.53;
		assertEquals (valorEsperado,valorReal,0.01);
	}
	
	@Test
	void testAreaCirculo1() {
		//fail("Not yet implemented");
		double valorReal =  Calculos.areaCirculo(-15);
		double valorEsperado = -1;
		assertEquals (valorEsperado,valorReal,0.001);
	}


}
