package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;

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
	LogAnalyzer logAnalyzer;
	
	@Mock
	AnalyzeException analyzeException;
	
	@Test
	void test() throws Exception{
//		doThrow(new IOException()).when(logLoader).load("a.none");
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		assertThrows(IOException.class,() -> logAnalyzer.analyze(null));
	}

}
