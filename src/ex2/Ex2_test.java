package ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ex2_test {
	
	private Ex2 q2;
	private float[] testList1;
	private float[] testList2;

	@BeforeEach
	void setUp() {
		q2 = new Ex2();
		testList1 = new float[] {1,2,3,4,5,6,7,8,9};
		testList2 = new float[] {-20,-10,0,10,20};
	}

	@AfterEach
	void tearDown() {
		q2 = null;
		testList1 = null;
		testList2 = null;
	}

	@Test
	void user_input_n1_test1() {
		assertThrows(NumberFormatException.class, () -> q2.user_input_n1("999999999999999999999999999999999999999999999999999999999"));
	}
	
	@Test
	void user_input_n1_test2() {
		assertThrows(NumberFormatException.class, () -> q2.user_input_n1("s"));
	}
	
	@Test
	void user_input_n1_test3() {
		assertThrows(NumberFormatException.class, () -> q2.user_input_n1("1000001"));
	}
	
	@Test
	void user_input_n1_test4() {
		assertEquals(100,q2.user_input_n1("100"));
	}
	
	@Test
	void user_input_n2_test1() {
		assertThrows(NumberFormatException.class, () -> q2.user_input_n2("999999999999999999999999999999999999999999999999999999999"));
	}
	
	@Test
	void user_input_n2_test2() {
		assertThrows(NumberFormatException.class, () -> q2.user_input_n2("s"));
	}
	
	@Test
	void user_input_n2_test3() {
		assertEquals(-100,q2.user_input_n2("-100"));
	}

	@Test
	void summation_test() {
		assertEquals(45.,q2.summation(testList1));	
		assertEquals(0.,q2.summation(testList2));	
	}
	
	@Test
	void product_test() {
		assertEquals(362880.,q2.product(testList1));	
		assertEquals(0.,q2.product(testList2));
	}
	
	@Test
	void average_test() {
		assertEquals(5.,q2.average(testList1));	
		assertEquals(0.,q2.average(testList2));
	}
	
	@Test
	void variance_test() {
		assertEquals((20.0/3),q2.variance(testList1),0.001);	
		assertEquals(200.,q2.variance(testList2));	
	}
	
	@Test
	void smallest_int_test() {
		assertEquals(1.,q2.smallest_float(testList1));	
		assertEquals(-20.,q2.smallest_float(testList2));	
	}
	
	@Test
	void largest_int_test() {
		assertEquals(9.,q2.largest_float(testList1));	
		assertEquals(20.,q2.largest_float(testList2));
	}	
}
