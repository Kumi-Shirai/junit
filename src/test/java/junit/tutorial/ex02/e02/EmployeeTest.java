package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	

	@Test
	void test() {
		InputStream sytemin = System.in;
		InputStream fileStream1 = new FileInputStream("/junit/src/main/java/junit/tutorial/ex02/e02/employee.txt");
		List<Employee> list = Employee.load(fileStream1);
		assertAll("employee",
			() -> assertEquals("Ichiro",list.get(0),"失敗"),
			() -> assertEquals("Tanaka",list.get(1),"失敗"),
			() -> assertEquals("ichiro@example.com",list.get(2),"失敗")
				);
		
//		fileStream1.close();
	}

}
