package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@InjectMocks
	LogAnalyzer logAnalyzer = new LogAnalyzer();
	
	@Mock
	LogLoader logLoader;
	
	@Test
	void test() throws Exception{
		doThrow(new IOException("aaa")).when(logLoader).load("aaaaa");
		AnalyzeException e = assertThrows(AnalyzeException.class,() -> logAnalyzer.analyze("aaaaa"));
	
		/*
		 * AnalyzeExceptionごと取り出してしまっているため、メッセージの前にJava.io.IOException: がつく
		 * String m = e.getMessage(); 
		 * System.out.println(m); 
		 * assertEquals("java.io.IOException: aaa", m);
		 */
		
		Throwable throwable = e.getCause(); //AnalyzeExceptionの引数で設定している。Exceptionのスーパークラス
		assertTrue(throwable instanceof IOException);
		assertEquals("aaa", throwable.getMessage());
	}

}
