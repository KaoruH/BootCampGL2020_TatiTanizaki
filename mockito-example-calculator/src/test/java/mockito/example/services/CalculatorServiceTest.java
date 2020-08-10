/**
 * 
 */
package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	CalculatorServiceImpl cSImpl;
	
	@Mock
	BasicOperationsService bOServ;
	
	private static int[] numeros;
	
	@BeforeAll
	static void setup() {
		numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
	}
	
	@Test
	@DisplayName("3.3 - Sum Test")
	void sumTest() {
		
		Mockito.when(bOServ.add(5, 2)).thenReturn(7.0);
		
		assertEquals(7.0, cSImpl.calculateSum(5, 2));
		
		verify(bOServ).add(5, 2);
		
	}
	
	@Test
	@DisplayName("3.3 - Substraction Test")
	void substractionTest() {
		
		Mockito.when(bOServ.subtract(10, 2)).thenReturn(8.0);
		
		assertEquals(8.0, cSImpl.calculateSubstraction(10, 2));
		
		verify(bOServ).subtract(10, 2);
	}
	
	@Test
	@DisplayName("3.3 - Divide Test")
	void divideTest() throws ZeroDivisionException {
		
		Mockito.when(bOServ.divide(9, 3)).thenReturn(3.0);
		
		assertEquals(3.0, cSImpl.calculateDivision(9, 3));
		
		verify(bOServ).divide(9, 3);
	}
	
	@Test
	@DisplayName("3.3 - Multiply Test")
	void multiplyTest() {
		
		Mockito.when(bOServ.multiply(3, 5)).thenReturn(15.0);
		
		assertEquals(15.0, cSImpl.calculateMultiplication(3, 5));
		
		verify(bOServ).multiply(3, 5);
	}
	
	@Mock
	DataService dataServ;
	
	@Test
	@DisplayName("3.4")
	void averageTest() {
		
		//Mockito.when(dataServ.getListOfNumbers()).thenReturn(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		
		Mockito.when(dataServ.getListOfNumbers()).thenReturn(numeros);
		
		assertEquals(4.5, cSImpl.calculateAverage());
		
	}
	
	
	@Test
	@DisplayName("3.5")
	void averageTestConException() {
		
		Mockito.when(dataServ.getListOfNumbers()).thenReturn(null);
		
		assertThrows(NullPointerException.class, () -> {
			cSImpl.calculateAverage();
		});
		

	}

	@Test
	@DisplayName("3.6")
	void divisionConException() {

		assertThrows(ZeroDivisionException.class, () -> {
			cSImpl.calculateDivision(4, 0);
		});
		
		verify(bOServ, never()).divide(4,0);
	}
	
	
	@Test
	@DisplayName("3.7")
	void printResultTest() {
		
		Mockito.when(bOServ.add(3, 4)).thenReturn(7.0);
		
		double result = cSImpl.calculateSum(3, 4);
		
		assertEquals("El resultado es: " + result, cSImpl.printResult(result));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 8, 20, 500})
	@DisplayName("3.8")
	void oddTest(int number) {
		
		assertTrue(cSImpl.isOdd(number));
		
	}
	
	@Test
	@DisplayName("3.9")
	void basicOpServSpyTest() {
		
		BasicOperationsServiceImpl bOServToSpy = new BasicOperationsServiceImpl();
		
		BasicOperationsServiceImpl theBOServSpy = spy(bOServToSpy);
		
		cSImpl.setBasicOperationsService(theBOServSpy);
		
		cSImpl.calculateSum(5, 2);
		
		verify(theBOServSpy).add(5, 2);	
	}
	
	@Test
	@DisplayName("3.10")
	void listOfNumbersTest() {
		
		DataServiceImpl dSImpl = new DataServiceImpl();
		DataServiceImpl theDSImplSpy = spy(dSImpl);
		
		cSImpl.setDataService(theDSImplSpy);
				
		Mockito.when(theDSImplSpy.getListOfNumbers()).thenReturn(new int[] {5, 2, 1});
		
		theDSImplSpy.setListOfNumbers(new int[] {9, 3, 5, 7, 2, 7});
		
		assertTrue(theDSImplSpy.getListOfNumbers().length == 3);		
	}
	
	


}
