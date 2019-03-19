import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Priyanka
 *
 */
class CostEstimationTest {

	@Test
	void testFindcost() {
		CostEstimation c=new CostEstimation();
		assertEquals(300000.0,c.findcost(0, 250, false));
		assertEquals(216000.0,c.findcost(0, 180, true));
	}

}
