package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistema.boundary.SistemaBiologico;

class SistemaBiologicoTest {

	@Test
	void test() {
		
		SistemaBiologico miSistemaBiologico = new SistemaBiologico("");
		
		assertEquals("default", miSistemaBiologico.getNombre());
		
	}

}
