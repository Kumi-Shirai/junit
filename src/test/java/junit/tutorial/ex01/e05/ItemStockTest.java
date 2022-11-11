package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

//@Nested
//@DisplayName("itemStock")
class ItemStockTest {
	ItemStock itemStock = new ItemStock();
	Item book = new Item("book", 0);
	Item cd = new Item("CD", 0);

	@Test
	void test1() {
		assertEquals(0, itemStock.getNum(book),"失敗");
	}
	@Test
	void test2() {
		itemStock.add(book);
		assertEquals(1, itemStock.getNum(book),"失敗");
	}
	@Test
	void test3() {
		itemStock.add(book);
		itemStock.add(book);
		assertEquals(2, itemStock.getNum(book),"失敗");
	}
	@Test
	void test4() {
		itemStock.add(book);
		itemStock.add(cd);
		assertEquals(1, itemStock.getNum(book),"失敗");
	}

}
