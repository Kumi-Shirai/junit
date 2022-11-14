package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
	
	Counter counter = new Counter();

	@Test
	void test1() {
		int rs = counter.increment();
		assertEquals(1, rs,"失敗");
	}
	@Test
	void test2() {
		
		int rs = counter.increment();
		rs = counter.increment();
		assertEquals(2, rs,"失敗");
	}
	@Test
	void test3() {
		int i = 1;
		int rs = 0;
		while(i <= 50) {
			rs = counter.increment();
			i ++;
		}
		rs = counter.increment();
		assertEquals(51, rs,"失敗");
	}

}
