
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDelete {
	
	@Test
	public void test()
	{
		DeleteA a=new DeleteA();
		assertEquals("BC",a.rem("ABC"));
		assertEquals("FGH",a.rem("AFGH"));
		assertEquals("",a.rem(""));
		assertEquals("K",a.rem("KA"));
		assertEquals("",a.rem("A"));
		assertEquals("B",a.rem("AB"));
		assertEquals("sk",a.rem("ask"));
		
	}

}
