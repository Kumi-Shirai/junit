package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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

MonthlyCalendar monCalendar;

	@Test
	void test1() {
		monCalendar = new MonthlyCalendar(LocalDate.of(2012, 1, 31));
		assertEquals(0, monCalendar.getRemainingDays(),"失敗しました");
	}
	@Test
	void test2() {
		monCalendar = new MonthlyCalendar(LocalDate.of(2012, 1, 30));
		assertEquals(1, monCalendar.getRemainingDays(),"失敗しました");
	}
	@Test
	void test3() {
		monCalendar = new MonthlyCalendar(LocalDate.of(2012, 2,1));
		assertEquals(28, monCalendar.getRemainingDays(),"失敗しました");
	}

}
