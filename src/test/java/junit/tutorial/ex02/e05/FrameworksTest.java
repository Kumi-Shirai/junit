package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FrameworksTest {

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

	@ParameterizedTest
	@CsvSource({
		"GlassFish,Oracle,true", "GlassFish,DB2,true", "GlassFish,PostgreSQL,true", "GlassFish,MySQL,true"
	})
	void test1(ApplicationServer server,Database database,boolean suport) {
		assertEquals(suport, Frameworks.isSupport(server, database),"失敗です");
	}
	@ParameterizedTest
	@CsvSource({
		"JBoss,Oracle,false", "JBoss,DB2,true", "JBoss,PostgreSQL,true", "JBoss,MySQL,false"
	})
	void test2(ApplicationServer server,Database database,boolean suport) {
		assertEquals(suport, Frameworks.isSupport(server, database),"失敗です");
	}
	@ParameterizedTest
	@CsvSource({
		"Tomcat,Oracle,false", "Tomcat,DB2,fale", "Tomcat,PostgreSQL,false", "Tomcat,MySQL,true"
	})
	void test3(ApplicationServer server,Database database,boolean suport) {
		assertEquals(suport, Frameworks.isSupport(server, database),"失敗です");
	}

}
