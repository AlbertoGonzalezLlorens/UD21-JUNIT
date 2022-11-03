package Ud21.Calculadora;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Ud21.Calculadora.*;

class OperacionTest {
	
	Calculadora calc = new Calculadora();
	Operaciones op;
	ExcepcionNoDivisibleEntre0 ex = new ExcepcionNoDivisibleEntre0();
	App main = new App();
	
	@BeforeEach
	public void before() {
		op = new Operaciones();
	}
	
	@Test
	public void testSuma() {
		double resultado = op.suma("1", "1");
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado,resultado,delta);
	}
	
	@Test
	public void testResta() {
		double resultado = op.resta("2", "1");
		double esperado = 1;
		int delta = 1;
		assertEquals(esperado,resultado,delta);
	}
	
	@Test
	public void testMultiplicacion() {
		double resultado = op.multiplicacion("2", "1");
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado,resultado,delta);
	}
	
	@Test
	public void testDivision() {
		double resultado = op.division("2", "1");
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado,resultado,delta);
	}
	
	@Test
	public void testMain() {
		main.main(null);
	}

}
