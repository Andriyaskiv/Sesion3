package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	private static Cuenta aux;
	private static Cuenta cuentaa;
	private static Cuenta cuentab;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux = new Cuenta("12345","Manuel",0);
		cuentaa= new Cuenta("12345", "Juan", 50);
		cuentab= new Cuenta("67890", "Ana", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		aux.Retirar(100);
		assertEquals(aux.getSaldo(),-100);
	}
	@Test
	void testIngresar() {
		aux.Ingresar(1000);
		assertEquals(aux.getSaldo(),1000);
	}
	@Test
	void Test0014() {
		assertEquals(cuentaa.getSaldo(), 50);
		assertEquals(cuentab.getSaldo(), 0);
		
		cuentaa.Retirar(200);
		cuentab.Retirar(350);
		cuentaa.Ingresar(100);
		cuentab.Retirar(200);
		cuentab.Retirar(150);
		cuentaa.Retirar(200);
		cuentab.Ingresar(50);
		cuentab.Retirar(100);
		
		assertEquals(cuentaa.getSaldo(), -250);
		assertEquals(cuentab.getSaldo(), -450);
	}

}
