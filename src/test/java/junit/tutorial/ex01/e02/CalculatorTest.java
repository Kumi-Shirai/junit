package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();
	int rs;
	
//	@Test
//	void test() {
//		try {
//		rs = calculator.divide(10,0);
//		} catch (IllegalArgumentException e) {
//			assertEquals("divide by zero.", rs , "失敗");
//		}
////		assertThrows(IllegalArgumentException.class () -> calculator.divide(10,0));
//	}
	
	@Test
	void test() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class,() -> calculator.divide(10, 0));
	}
}
