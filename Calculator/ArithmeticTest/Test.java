import static org.junit.jupiter.api.Assertions.*;


class Test {

	@org.junit.jupiter.api.Test
	void testAddition() {
		
		Arithmetic a=new Arithmetic();
		assertEquals(7,a.addition(5, 2));
	}

	@org.junit.jupiter.api.Test
	void testMultiplication() {
		
		Arithmetic a=new Arithmetic();
		assertEquals(10,a.multiplication(5, 2));
	}

	@org.junit.jupiter.api.Test
	void testDivision() {
		
		Arithmetic a=new Arithmetic();
		assertEquals(1,a.division(5, 5));
	}

}
