package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void test1() {
		assertTrue(NumberUtils.isEven(10),"失敗");
	}
	@Test
	void test2() {
		assertFalse(NumberUtils.isEven(7),"失敗");
	}

}
