import static org.junit.Assert.*;  

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class minCheckTest {
	private String id;
	private int val_1;
	private int val_2;
	private int val_3;
	private int minVal;
	
	public minCheckTest(String ID, int A, int B, int C, int min) {
	    this.id = ID;
		this.val_1 = A;
		this.val_2 = B;
		this.val_3 = C;
		this.minVal = min;
	} 

	@Parameterized.Parameters
	public static Collection<Object[]>  testdata() {
		minChecker m = new minChecker();
	   return Arrays.asList(new Object[][] {

		   //ENTER YOUR TEST CASES HERE
	      { "T1.1",0,0,0,0},
	      //Test Equivalence Partition
	      { "T1.2",-100,-75,-65,-65},
	      { "T1.3",500,43,121,-1},
	      { "T1.4",-100,43,-65,-65},
	      { "T1.5",2,32,4,2}, 
	      { "T1.6",500,8,7,7},
	      { "T1.7",430,3,5,3},
	      //Boundary Value Analysis
	      { "T2.1",Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE},
	      { "T2.2",9,9,9,9},
	      { "T2.3",10,10,10,-1},
	      { "T2.4",Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,-1},
	      { "T2.5",Integer.MAX_VALUE,Integer.MAX_VALUE,9,9},
	      
	      //This program takes in 3 integer values
	      //Find the smallest value    
	      //One value has to be less than 10
	      //If no value is less than 10, return -1, indicating an error
	      // public static int minValue(int x, int y, int z)
	      
	      
	      //I'll use Equivalence partition and Boundary value analysis

	   });
	}
	
	@Test
	public void minValueTests() {
		   System.out.println(id + " - A: " + val_1 + " B: " + val_2 + " C: " + val_3 + ". The min value is " + minVal);
		   assertEquals(minVal, minChecker.minValue(val_1, val_2, val_3));
	}

}
