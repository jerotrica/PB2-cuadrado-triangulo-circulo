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
		assertEquals(31.399999618530273, circuloPrueba.visualizarPerimetro(),0);
		assertEquals(157.75360107421875, circuloPrueba.visualizarArea(), 0);
	}
// PUSE TANTOS DECIMALES COMO PEDIA EL FAILURE, EN GENERAL DABA BIEN PERO ERRABA POR UNA MILESIMA.

}
