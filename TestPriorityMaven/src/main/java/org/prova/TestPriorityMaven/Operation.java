package org.prova.TestPriorityMaven;

public class Operation {
	private static int firstOperator;
	private static int secondOperator; 
	
	
	public Operation(int a, int b) {
		firstOperator=a;
		secondOperator=b;
	}
	
	
	public static int sum()  {
		int sum;
		sum=firstOperator+secondOperator;
		return sum;
	}
	
	public static int minus()  {
		int minus;
		minus=firstOperator-secondOperator;
		return minus;
	}
}
