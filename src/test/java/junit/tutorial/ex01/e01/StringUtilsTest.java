package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void test() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result,"テストケース1　失敗");
	}

}
