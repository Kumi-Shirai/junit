package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
class NetworkResourcesTest {

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
	NetworkResources resources = new NetworkResources();
	
	@Mock
	NetworkLoader loader;
	
	@Test
	void test() throws IOException {
		/*
		 * InputStreamReader reader = new InputStreamReader(loader.getInput(),"Hello World");
		 * doReturn(reader).when(loader).getInput(); 
		 * String m = resources.load();
		 * assertEquals("Hello World", m);
		 */
		
		String st = "Hello World";
		InputStream stream = new ByteArrayInputStream(st.getBytes());
		doReturn(stream).when(loader).getInput();
		assertEquals(st, resources.load());
		
	}

}
