package ar.edu.unlam.pb2.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void CalculoPerimetro() {
		Cuadrado cuadradoPrueba = new Cuadrado();
		cuadradoPrueba.calcularPerimetro((float) 3);
		cuadradoPrueba.calcularArea((float) 3);
		assertEquals(12, cuadradoPrueba.visualizarPerimetro(), 0);
		assertEquals(9, cuadradoPrueba.visualizarArea(), 0);
	}

}
