package edu.seminolestate.workflow;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("The 1st number of the Fibonacci sequence is " + fibonacci(1));
        System.out.println("The 5th number of the Fibonacci sequence is " + fibonacci(5));
        System.out.println("The 10th number of the Fibonacci sequence is " + fibonacci(10));
    }
    
    public static int fibonacci(int n) {
    	if (n <= 1)
    		return n;
    	
    	return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
