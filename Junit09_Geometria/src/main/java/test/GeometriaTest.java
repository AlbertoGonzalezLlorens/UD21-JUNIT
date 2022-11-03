package test;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geo;
	
	Geometria geo_2 = new Geometria(1);
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}
	
	private static Stream<Arguments> getAreaTrapecio(){
		return Stream.of(
				Arguments.of(4,5,2));
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
	}
	
	@Test
	public void testAreaCuadrado() {
		int resultado = geo.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geo.areaCirculo(5);
		double esperado = 78;
		int delta = 1;
		assertEquals(esperado,resultado,delta);
	}
	
	@Test
	public void testAreaTriangulo() {
		int resultado = geo.areatriangulo(4,5);
		int esperado = 10;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAreaRectangulo() {
		int resultado = geo.arearectangulo(4,5);
		int esperado = 20;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAreaPentagono() {
		int resultado = geo.areapentagono(4,5);
		int esperado = 10;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAreaRombo() {
		int resultado = geo.arearombo(4,5);
		int esperado = 10;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAreaRomboide() {
		int resultado = geo.arearomboide(4,5);
		int esperado = 20;
		assertEquals(esperado,resultado);
	}

	@ParameterizedTest
	@MethodSource("getAreaTrapecio")
	public void testAreaTrapecio(int a, int b, int c) {
		int resultado = geo.areatrapecio(a,b,c);
		int esperado = 20;
		int delta = 1;
		assertEquals(esperado,resultado, delta);
	}
	
	@Test
	public void testFigura() {
		String resultado = geo.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura1() {
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura2() {
		String resultado = geo.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura3() {
		String resultado = geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura4() {
		String resultado = geo.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura5() {
		String resultado = geo.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura6() {
		String resultado = geo.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura7() {
		String resultado = geo.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFigura8() {
		String resultado = geo.figura(9);
		String esperado = "Default";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testGetId() {
		int resultado = geo.getId();
		int esperado = 9;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testGetNombre() {
		String resultado = geo.getNom();
		String esperado = "Default";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testGetIdContructorLleno() {
		int resultado = geo_2.getId();
		int esperado = 1;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testGetArea() {
		geo.arearombo(4,5);
		double resultado = geo.getArea();
		double esperado = 10;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testToString() {
		geo.areacuadrado(5);
		String resultado = geo.toString();
		String esperado = "Geometria [id=9, nom=Default, area=25]";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testSetId() {
		geo.setId(5);
		int resultado = geo.getId();
		int esperado = 5;
		assertEquals(esperado,resultado);
	}
}
