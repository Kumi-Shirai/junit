package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
	AnalyzeException analyzeException;
	
	@Mock
//	LogAnalyzer logAnalyzer;
	LogLoader logLoader;
	
	@Test
	void test() throws Exception{
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		doThrow(new IOException()).when(logLoader).load(null);
		assertThrows(AnalyzeException.class,() -> logAnalyzer.analyze(null));
	}
	@Test
	void test2(){
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		AnalyzeException e = assertThrows(AnalyzeException.class,() -> logAnalyzer.analyze(null));
		assertEquals(IOException.class, e.addSuppressed(analyzeException), "失敗しました");
	}

}
