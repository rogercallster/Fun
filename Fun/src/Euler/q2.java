package Euler;
/*
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence
 *  whose values do not exceed four million, find the sum of the even-valued terms.
 * */
public class q2 {
	public static void main(String[] args) {
		int n=1;
		int i=2;
		int temp=n;
		int sum=2;
		while(i<4000000){
		   temp=i;	
    	   i+=n;
    	   n=temp;
    	   if(i%2==0)sum+=i;
    	   
       }
		System.out.println(sum);
       
		
	}

}
