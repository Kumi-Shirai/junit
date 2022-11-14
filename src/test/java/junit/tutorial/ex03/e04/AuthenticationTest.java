package junit.tutorial.ex03.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doReturn;

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
class AuthenticationTest {
	
	@InjectMocks
	Authentication authentication = new Authentication();
	
	@Mock
	AccountDao dao;

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

	@Test
	void test() {
		doReturn(null).when(dao).findOrNull("1");
		assertNull(authentication.authenticate("1", "aaa"));
	}
	@Test
	void test2() {
		Account account = new Account("1", "aaa");
		doReturn(account).when(dao).findOrNull("1");
		Account dbAccount = authentication.authenticate("1", "aaa");
//		assertEquals(account,authentication.authenticate("1", "aaa"));　←←不十分
		assertEquals(account.getName(), dbAccount.getName());
		assertEquals(account.getPassword(), dbAccount.getPassword());
	}
	@Test
	void test3() {
		Account account = new Account("1", "aaa");
		doReturn(account).when(dao).findOrNull("1");
		assertNull(authentication.authenticate("1", "bbb"));
	}

}
