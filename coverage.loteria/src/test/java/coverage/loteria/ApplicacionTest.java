package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import coverage.loteria.model.CartonGenerator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicacionTest {
	
    CartonGenerator cartongenerator = null;
	
		
	Loteria loteria = null;
	
	
	
	@BeforeAll
	void init() {
		
        cartongenerator = new CartonGenerator();
		
		
		loteria = new Loteria(5F, 9, cartongenerator);
		
		
	}
	
	@Test
	void test1() {
		
		assertNotNull(loteria);
	}
	
	@Test
	void test2() {
		
		assertEquals(5F, loteria.getPozo());
	}
	
	@Test
	void test3() {
		
		assertEquals(9, loteria.getBoletos());
	}
	
	@Test
	void test4() {
		
		assertNotNull(cartongenerator.isGanador());
	}
	
	@Test
	void test5() {
		
		assertEquals(0, loteria.getGanadores());
	}
	
	@Test
	void test6() {
		
		assertFalse(loteria.hayCuadrupleGanador());
	}
	
	@Test
	void test7() {
		
		assertFalse(loteria.hayGanadorUnico());
	}

}
