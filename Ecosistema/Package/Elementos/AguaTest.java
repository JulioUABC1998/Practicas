package Elementos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AguaTest {

	@Test
	public void test() {
		Agua test = new Agua(0, "");
		int output = test.getCantidad();
		assertEquals(0,output);
		String output1 = test.getCalidad();
		assertEquals(50,output);
		assertEquals("Buena",output1);

	}
}
