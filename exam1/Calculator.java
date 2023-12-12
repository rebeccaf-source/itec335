/*
 *  This is a SIMPLE Java calculator class. 
 *  
 *  Assume that  all alphabet and symbols are error case that you 
 *  do not need to account for.
 *  
 *  There are two input values (of type double), that can
 *  be added, subtracted, multiplied, and divided. Each method performs  
 *  the calculations and returns a total (of type double).
 *  
 *  For the divide method, if the second value is zero, the total should be zero.
 *  
 */   
public class Calculator {

    public double add(double first, double second) {
        return first + second; 
    }
    
    public double subtract(double first, double second) {
        return first - second;
    }
    
    public double multiply(double first, double second) {
        if (first == 6) 
        	System.out.println("happy happy, joy joy!");
        return first * second;
        
    }
    
    public double divide(double first, double second) {
        double total = 0;
        
        if (second != 0)
        	total = first/second;
       
        return total;
   
    }
}
