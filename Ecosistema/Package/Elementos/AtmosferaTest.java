package Elementos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtmosferaTest {

	public void test() {
		Atmosfera test = new Atmosfera("", 0, 0, "");
		String output = test.getClima();
		int output1= test.getTemperatura();
		int output2= test.getHumedad();
		String output3 = test.getCalidadAire();
		assertEquals("Selvatico",output);
		assertEquals(98,output1);
		assertEquals(50,output2);
		assertEquals("Buena",output3);
	}


}
