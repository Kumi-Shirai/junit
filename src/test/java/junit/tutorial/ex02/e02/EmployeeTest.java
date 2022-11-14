package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	

	@Test
	void test() {
		InputStream systemin = System.in;//いらない
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> list = Employee.load(input);
		assertAll("employee",
			() -> assertEquals("Ichiro",list.get(0).getFirstName(),"失敗"),
			() -> assertEquals("Tanaka",list.get(0).getLastName(),"失敗"),
			() -> assertEquals("ichiro@example.com",list.get(0).getEmail(),"失敗")
				);
		
//		fileStream1.close();
	}

}
