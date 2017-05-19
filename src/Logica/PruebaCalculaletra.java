package Logica;
import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCalculaletra {

	@Test
	public void test() {
		CalcularLetra c = new CalcularLetra("53758335");
		assertEquals('K', c.dLetra());
		
	}

}
