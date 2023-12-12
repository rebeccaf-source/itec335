import org.junit.Test; 
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.experimental.runners.Enclosed;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class CalculatorTest {

	// Test Add method
	@RunWith(Parameterized.class)
	public static class addTest {

		@Parameters
		public static Collection<Object[]> nums() {
			return Arrays.asList(new Object[][] { 
				//Test cases require parameter one, parameter two, 
				// and the return value (expected calculated amt).
				
				{ 0, 0, 0 }, 
				{ 1.25, 1, 2.25 }, 
				{ 3, 1, 4 }, 
				
				//Add your BP, EP, DT tests below here. 
			    // Don't forget to add the comma after the last sample test case.
				 
				//Equivalence Partition Test
				{-100, 200, 100},
				
				//Boundary Value Analysis
				{-1000, -1000, -2000},
				{1000, 1000, 2000}
	
				
			});
		}

		private final Calculator calculator;
		private final double first;
		private final double second;
		private final double expectedAmt;

		public addTest(double first, double second, double expectedAmt) {

			this.calculator = new Calculator();
			this.first = first;
			this.second = second;
			this.expectedAmt = expectedAmt;
		}

		@Test
		public void ReturnCorrectSumTest() {
			double actualAmt = calculator.add(first, second);
			assertEquals(expectedAmt, actualAmt, 0.01);
		}

	}

	// Test Subtract method
	@RunWith(Parameterized.class)
	public static class subTest {

		@Parameters
		public static Collection<Object[]> nums() {
			return Arrays.asList(new Object[][] { 
				//Test cases require parameter one, parameter two, 
				// and the return value (expected calculated amt).

				{ 0, 0, 0 }, 
				{ -1, -1, 0 }, 
				{ 3, 1.6, 1.4 }, 
				
				//Add your BP, EP, DT tests below here. 
			    // Don't forget to add the comma after the last sample test case.

				//Equivalence Partition Test
				{-23, 930, -953},
				
				//Boundary Value Analysis
				{-1000, -1000, 0},
				{1000, 1000, 0}
			});
		}

		private final Calculator calculator;
		private final double first;
		private final double second;
		private final double expectedAmt;

		public subTest(double first, double second, double expectedAmt) {

			this.calculator = new Calculator();
			this.first = first;
			this.second = second;
			this.expectedAmt = expectedAmt;
		}

		@Test
		public void ReturnCorrectSumTest() {
			double actualAmt = calculator.subtract(first, second);
			assertEquals(expectedAmt, actualAmt, 0.01);
		}

	}
	
	// Test Multiply method
	@RunWith(Parameterized.class)
	public static class multiplyTest {

		@Parameters
		public static Collection<Object[]> nums() {
			return Arrays.asList(new Object[][] { 
				//Test cases require parameter one, parameter two, 
				// and the return value (expected calculated amt).
				{ 0, 0, 0 }, 
				{ 1, 1, 1 }, 
				{ 3, 1, 3 }, 
				
				//Add your BP, EP, DT tests below here. 
			    // Don't forget to add the comma after the last sample test case.
	
				//Equivalence Partition Test
				{52, 2, 104},
				
				//Boundary Value Analysis
				{-1000, -1000, 1000000},
				{1000, 1000, 1000000},
				
				{6, 7, 42}
			});
		}

		private final Calculator calculator;
		private final double first;
		private final double second;
		private final double expectedAmt;

		public multiplyTest(double first, double second, double expectedAmt) {

			this.calculator = new Calculator();
			this.first = first;
			this.second = second;
			this.expectedAmt = expectedAmt;
		}

		@Test
		public void ReturnCorrectSumTest() {
			double actualAmt = calculator.multiply(first, second);
			assertEquals(expectedAmt, actualAmt, 0.01);
		}

	}
	
	//Test Division method
	@RunWith(Parameterized.class)
	public static class divideTest {

		@Parameters
		public static Collection<Object[]> nums() {
			return Arrays.asList(new Object[][] { 
				//Test cases require parameter one, parameter two, 
				// and the return value (expected calculated amt).
				{ 0, 0, 0 }, 
				{ 1, 1, 1 }, 
				{ 4.5, 2.0, 2.25},
				
				//Add your BP, EP, DT tests below here. 
			    // Don't forget to add the comma after the last sample test case.
	
				//Equivalence Partition Test
				{-100, -50, 2},
				{800, 20, 40},
				
				//Boundary Value Tests
				{-1000, -1000, 1},
				{1000, 1000, 1},
				{-1000, 0, 0},
				{-1000, 1, -1000},
				{-1000, 1000, -1},
				{1000, 1, 1000}
			});
		}

		private final Calculator calculator;
		private final double first;
		private final double second;
		private final double expectedAmt;

		public divideTest(double first, double second, double expectedAmt) {

			this.calculator = new Calculator();
			this.first = first;
			this.second = second;
			this.expectedAmt = expectedAmt;
		}

		@Test
		public void ReturnCorrectSumTest() {
			double actualAmt = calculator.divide(first, second);
			assertEquals(expectedAmt, actualAmt, 0.01);
		}

	}

	
	

}
