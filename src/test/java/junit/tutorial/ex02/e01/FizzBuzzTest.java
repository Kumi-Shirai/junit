package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	void test() {
		List<String> list = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
				"11","Fizz","13","14","FizzBuzz","16");
		assertIterableEquals(list, fizzBuzz.createFizzBuzzList(16),"失敗");
	}

}
