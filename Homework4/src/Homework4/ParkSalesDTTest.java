package Homework4;
import org.junit.Test; 

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParkSalesDTTest {
	private String id;
	private int age;
	private boolean passHolder;
	private ParkSales.Rate rate;

public ParkSalesDTTest(String ID, int age, boolean passHolder,ParkSales.Rate rate) {
    this.id = ID;
	this.age = age;
    this.passHolder = passHolder;
    this.rate = rate;
 }

@Parameterized.Parameters
public static Collection<Object[]>  testdata() {
   return Arrays.asList(new Object[][] {
	   
	  //Equivalence Partitioning Tests
      { "T1.1", 5, true, ParkSales.Rate.FREE},
      { "T1.2", 15, false, ParkSales.Rate.YOUTH},
      { "T1.3", 40, false, ParkSales.Rate.ADULT},      
      { "T1.4", 90, false, ParkSales.Rate.SENIOR},
      { "T1.5", 6, false, ParkSales.Rate.KID},
      { "T1.6", -10, false, ParkSales.Rate.ERROR},
      
	  // Boundary Value Analysis Tests
      { "T2.1", 0, true, ParkSales.Rate.FREE},
      { "T2.2", 9, false, ParkSales.Rate.KID},
      { "T2.3", 10, false, ParkSales.Rate.YOUTH},
      { "T2.4", 20, false, ParkSales.Rate.YOUTH},
      { "T2.5", 21, false, ParkSales.Rate.ADULT},      
      { "T2.6", 64, false, ParkSales.Rate.ADULT},
      { "T2.7", 65, false, ParkSales.Rate.SENIOR},
      { "T2.8", Integer.MAX_VALUE, false, ParkSales.Rate.SENIOR},
      { "T2.9", Integer.MIN_VALUE, false, ParkSales.Rate.ERROR},
      { "T2.10", -1, false, ParkSales.Rate.ERROR},
      
      // Add your Decision Table Tests below here
      
   });
}

@Test
public void rateEPTests() {
   System.out.println("Test ID: " + id + ". Age: " + age + ". The rate is : " + rate);
   assertEquals(rate, ParkSales.admissionRate(age, passHolder));
}

}