package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geo;
	
	//Se instancia um objeto Geometria antes de cada test
    @BeforeEach
    public void testBefore() {
        geo = new Geometria();
        assertTrue(geo instanceof Geometria);
    }
    
    @Test
    public void testConstructorParam() {
        geo = new Geometria(1);
        assertEquals(1, geo.getId());
        assertTrue(geo.getNom().equals("cuadrado"));
        System.out.println("testConstructorParam(): " + geo.getNom().equals("cuadrado"));
    }
    
    
//  Test del area del cuadrado.
    @Test
    public void testAreaCuadrado() {
        int esperado = 9;
        int resultado = geo.areacuadrado(3);
        assertEquals(esperado, resultado);
        System.out.println("\ntestAreaCuadrado():\nEsperado: " + esperado + "\nResultado: " + resultado);
    }
    
//  Test del area del circulo.
	@Test
    public void testAreaCirculo() {
        double esperado = 78.53999999999999;
        double resultado = geo.areaCirculo(5);
        assertEquals(Double.valueOf(esperado), Double.valueOf(resultado));
        System.out.println("\ntestAreaCirculo():\nEsperado: " + esperado + "\nResultado: " + resultado);
    }
	
//  Test del area del triangulo.
	@Test
	public void testAreaTriangulo() {
		double esperado = 7;
		double resultado = geo.areatriangulo(2, 7);
		assertEquals(Double.valueOf(esperado), Double.valueOf(resultado));
		System.out.println("\ntestAreaTriangulo():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del area del rectangulo.
	@Test
	public void testAreaRectangulo() {
		double esperado = 120;
		double resultado = geo.arearectangulo(10, 12);
		assertEquals(Double.valueOf(esperado), Double.valueOf(resultado));
		System.out.println("\ntestAreaRectangulo():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del area del pentagono.
	@Test
	public void testAreaPentagono() {
		double esperado = 15;
		double resultado = geo.areapentagono(10, 3);
		assertEquals(Double.valueOf(esperado), Double.valueOf(resultado));
		System.out.println("\ntestAreaPentagono():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del area del rombo.
	@Test
	public void testAreaRombo() {
		double esperado = 5;
		double resultado = geo.arearombo(5, 2);
		assertEquals(Double.valueOf(esperado), Double.valueOf(resultado));
		System.out.println("\ntestAreaRombo():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del area del romboide.
	@Test
	public void testAreaRomboide() {
		int esperado = 90;
		int resultado = geo.arearomboide(15, 6);
		assertEquals(esperado, resultado);
		System.out.println("\ntestAreaRomboide():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del area del trapecio.
	@Test
	public void testAreaTrapecio() {
		int esperado = 42;
		int resultado = geo.areatrapecio(10, 2, 7);
		assertEquals(esperado, resultado);
		System.out.println("\ntestAreaTrapecio():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
    
//  Test del getId.
	@Test
	public void testGetId() {
		geo.setId(2);
		int esperado = 2;
		int resultado = geo.getId();
		assertEquals(esperado, resultado);
		System.out.println("\ntestGetId():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del getArea.
	@Test
	public void testGetArea() {
		geo.setArea(5);
		int esperado = 5;
		int resultado = (int) geo.getArea();
		assertEquals(esperado, resultado);
		System.out.println("\ntestGetArea():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del toString.
	@Test
	public void testToString() {
		geo.setId(3);
		String esperado = "Geometria [id=3, nom=Default, area=0.0]";
		String resultado = geo.toString();
		assertTrue(esperado.equalsIgnoreCase(resultado));
		System.out.println("\ntestToString():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del setNom.
	@Test
	public void testGetNom() {
		geo.setNom("Circulo");
		String esperado = "Circulo";
		String resultado = geo.getNom();
		assertTrue(esperado.equalsIgnoreCase(resultado));
		System.out.println("\ntestGetNom():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	
//  Test del tipos de figura.
	@Test
	public void testTipoFigura1() {
		String esperado = "Circulo";
		String resultado = geo.figura(2);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura2() {
		String esperado = "Circulo";
		String resultado = geo.figura(2);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura3() {
		String esperado = "Triangulo";
		String resultado = geo.figura(3);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura4() {
		String esperado = "Rectangulo";
		String resultado = geo.figura(4);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura5() {
		String esperado = "Pentagono";
		String resultado = geo.figura(5);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura6() {
		String esperado = "Rombo";
		String resultado = geo.figura(6);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura7() {
		String esperado = "Romboide";
		String resultado = geo.figura(7);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura8() {
		String esperado = "Trapecio";
		String resultado = geo.figura(8);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
	@Test
	public void testTipoFigura9() {
		String esperado = "Default";
		String resultado = geo.figura(9);
		assertTrue(esperado.equals(resultado));
		System.out.println("\ntestTipoFigura():\nEsperado: " + esperado + "\nResultado: " + resultado);
	}
}