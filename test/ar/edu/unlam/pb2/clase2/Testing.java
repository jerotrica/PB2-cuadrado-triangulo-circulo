package ar.edu.unlam.pb2.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testingCuadrado() {
		Cuadrado cuadradoPrueba = new Cuadrado();
		cuadradoPrueba.calcularPerimetro((float) 3);
		cuadradoPrueba.calcularArea((float) 3);
		assertEquals(12, cuadradoPrueba.visualizarPerimetro(), 0);
		assertEquals(9, cuadradoPrueba.visualizarArea(), 0);
	}
	
	@Test
	public void testingCirculo() {
		Circulo circuloPrueba = new Circulo();
		circuloPrueba.calcularPerimetro((float) 5);
		circuloPrueba.calcularArea((float) 4);
		assertEquals(31.39, circuloPrueba.visualizarPerimetro(),0.01);
		assertEquals(157.75, circuloPrueba.visualizarArea(), 0.01);
	}

	@Test
	public void testingTriangulo() {
		Triangulo trianguloPrueba = new Triangulo();
		trianguloPrueba.calcularPerimetro(4, 4, 4);
		trianguloPrueba.calcularArea(10, 5);
		assertEquals(12, trianguloPrueba.visualizarPerimetro(),0);
		assertEquals(25, trianguloPrueba.visualizarArea(), 0);
	}
}
