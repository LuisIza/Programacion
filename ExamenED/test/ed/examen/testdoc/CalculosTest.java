package ed.examen.testdoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculosTest {
	
	@Test
	public void testPotencia() {
		//fail("Not yet implemented");
	}
	@Test
	public void testPotencia1() {
		int valoReal = Calculos.potencia(2, 3);
		int valorEsperado = 8;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testPotencia2() {
		int valoReal = Calculos.potencia(0, 2);
		int valorEsperado = 0;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testPotencia3() {
		int valoReal = Calculos.potencia(5, 0);
		int valorEsperado = 1;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testPotencia4() {
		int valoReal = Calculos.potencia(0, 0);
		int valorEsperado = 1;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testPotencia5() {
		int valoReal = Calculos.potencia(-2, 3);
		int valorEsperado = -8;
		assertEquals(valoReal,valorEsperado,0.001);
	}

	@Test
	public void testFactorial() {
		//fail("Not yet implemented");
	}
	@Test
	public void testFactorial1() {
		int valoReal = Calculos.factorial(3);
		int valorEsperado = 6;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testFactorial2() {
		int valoReal = Calculos.factorial(0);
		int valorEsperado = 1;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	
	//He añadido un if para que salga un error 
	//para valores númericos en la clase calculos.
	@Test
	public void testFactorial3() {
		int valoReal = Calculos.factorial(-1);
		int valorEsperado = -1;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testFactorial4() {
		int valoReal = Calculos.factorial(5);
		int valorEsperado = 60;
		assertEquals(valoReal,valorEsperado,0.001);
	}
	@Test
	public void testFactorial5() {
		int valoReal = Calculos.factorial(-3);
		int valorEsperado = -1;
		assertEquals(valoReal,valorEsperado,0.001);
	}

	@Test
	public void testAreaTriangulo() {
		//fail("Not yet implemented");
	}
	@Test
	public void testAreaTriangulo1() {
		double valoReal = Calculos.areaTriangulo(2, 3);
		double valorEsperado = 3.0;
		assertEquals(valoReal,valorEsperado,0.01);
	}
	@Test
	public void testAreaTriangulo2() {
		double valoReal = Calculos.areaTriangulo(-1, 3);
		double valorEsperado = -1.0;
		assertEquals(valoReal,valorEsperado,0.01);
	}
	@Test
	public void testAreaTriangulo3() {
		double valoReal = Calculos.areaTriangulo(2, -4);
		double valorEsperado = -2.0;
		assertEquals(valoReal,valorEsperado,0.01);
	}
	@Test
	public void testAreaTriangulo4() {
		double valoReal = Calculos.areaTriangulo(0, 2);
		double valorEsperado = 0.0;
		assertEquals(valoReal,valorEsperado,0.01);
	}
	@Test
	public void testAreaTriangulo5() {
		double valoReal = Calculos.areaTriangulo(2, 0);
		double valorEsperado = 0.0;
		assertEquals(valoReal,valorEsperado,0.01);
	}

}
