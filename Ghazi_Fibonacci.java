//Created by Mehrdad Ghazi - 9/4/2022

package edu.seminolestate.fibonaccci;

public class Ghazi_Fibonacci {

	public static void main(String[] args) {
		
		int passedNum = 10;
		
		System.out.println("The " + passedNum + "th number of the Fibonacci sequence is " + fibonacciRecursive(10));
		
	}
	
	public static int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

}
