package Euler;
/*
 * 

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 * */
public class q9 {
	
     public static void main(String[] st){
    	 int c=0;
    	 int i,j = 0;
    	 for(i=1;i<=999;i++){
    		 for( j=0;j<999;j++){
    			 c=1000-i-j;
    			 if((i*i)+(j*j)==c*c){
    				 System.out.println(c*j*i);			 
    			 }
    		 }
    		 
    	 }
    	 
     }
}
