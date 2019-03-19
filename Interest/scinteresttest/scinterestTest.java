import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class scinterestTest {

	@Test
	void testSimpleInterest() {
		scinterest s=new scinterest();
		assertEquals(252525.0,s.simpleInterest(20202,2.5f,5));
		
	}

	@Test
	void testCompoundInterest() {
		scinterest s=new scinterest();
		assertEquals(22856.7060585414,s.compoundInterest(20202,2.5f,5));
		
	}

}
