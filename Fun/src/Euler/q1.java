package Euler;

public class q1 {

	public static void main(String[] args) {
		/*
		 * 

If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
		 * */ 
        int sigma3=3*(999/3)*((999/3)+1)/2;
        int sigma5=5*(999/5)*((999/5)+1)/2;
        int sigma15=15*(999/15)*((999/15)+1)/2;
        System.out.println(sigma3 +" "+ sigma5+ " "+sigma15);
        System.out.println(sigma3 + sigma5-sigma15);
	}

}
