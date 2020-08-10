package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicacionTest {
	
    CartonGenerator cartonGenerator = null;
	
	Loteria loteria = null;
	
	
	@BeforeAll
	void init() {
		
        cartonGenerator = new CartonGenerator();
		
		
		loteria = new Loteria(5F, 9, cartonGenerator);
		
		
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
		
		assertNotNull(cartonGenerator.isGanador());
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
	void noUniqueWinner() {
		
		assertFalse(loteria.hayGanadorUnico());
	}
	
	@Mock
	CartonGenerator cGMock;
	
	@Test
	void oneWinner() {
		
		Mockito.when(cGMock.isGanador()).thenReturn(true, false);
		
		loteria = new Loteria(9F, 1100, cGMock);

		loteria.jugada();
		
		assertTrue(loteria.hayGanadorUnico());
		
		
	}
	
	@InjectMocks
	CartonGenerator cGInjectMock;
	
	@Mock
	Random random;
	
	@Test
	void fourWinners() {
		
		Mockito.when(random.nextInt()).thenReturn(1, 1, 1, 1, 0);
		
		Loteria loteria = new Loteria(9F, 1100, cGInjectMock);
		loteria.jugada();
		
		assertTrue(loteria.hayCuadrupleGanador()); 
		
	}
	
	
	

}
