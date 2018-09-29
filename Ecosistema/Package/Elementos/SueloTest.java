package Elementos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SueloTest {

	@Test
	public void test() {
		Suelo test = new Suelo(0, null);
		int output = test.getMinerales();
		assertEquals(0,output);
		Agua output1 = test.getAgua();
		assertEquals(null,output1);
	}

	

}
