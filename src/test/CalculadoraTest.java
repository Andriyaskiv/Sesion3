package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora.Matematicas;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5, Matematicas.suma(2,3)); 
	}
	@Test
	void testResta() {
		assertEquals(-1, Matematicas.resta(2,3)); 
	}
	@Test
	void testMultiplica() {
		assertEquals(6, Matematicas.multiplica(2,3)); 
	}
	@Test
	void testDivide() {
		assertEquals(0, Matematicas.divide(2,3)); 
	}
}
