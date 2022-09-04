//Created by Mehrdad Ghazi - 9/4/2022

package edu.seminolestate.fibonaccci;

public class Ghazi_Fibonacci {

	public static void main(String[] args) {
		
		int passedNum = 10;
		
		System.out.println("The " + passedNum + "th number of the Fibonacci sequence is " + fibonacciRecursive(10));
		
	}
	/**
	 * The Fibonacci methods uses recursion to return the nth number in the Fibonacci sequence
	 * @author Mehrdad Ghazi
	 * @param n the number in the sequence you want to calculate
	 * @return returns the nth number in the Fibonacci sequence
	 */
	public static int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

}
