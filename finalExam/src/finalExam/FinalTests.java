package finalExam;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalTests {
	
	@Test 
	public void testX(){

		Final f = new Final();
		
		assertEquals(f.doubleX("axxb"), true);
		assertEquals(f.doubleX("axaxax"), false);
		assertEquals(f.doubleX("xxxxx"), true);
		
	}
}
		


