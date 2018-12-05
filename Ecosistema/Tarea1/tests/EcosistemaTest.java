package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistema.boundary.Ecosistema;
import Ecosistema.entity.Biotopo;
import junit.framework.Assert;

class EcosistemaTest {

	@Test
	void testEcosistema() {
		Ecosistema miEcosistema = new Ecosistema("Estomago");
		
		assertEquals("Estomago", miEcosistema.getNombre());
		
		Biotopo miBiotopo = new Biotopo("Amibas", miEcosistema);
		
		miEcosistema.losBiotopos.add(miBiotopo);
		
		assertEquals("Amibas", miEcosistema.losBiotopos.get(0).getNombre());
		

	}

}
