package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistema.boundary.Ecosistema;
import Ecosistema.entity.Biotopo;

class BiotopoTest {

	@Test
	void test() {
		Ecosistema miEcosistema = new Ecosistema("Estomago");
	
		Biotopo miBiotopo = new Biotopo("Amibas", miEcosistema);
		
		assertEquals("Amibas", miBiotopo.getNombre());
	}

}
