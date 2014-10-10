package Euler;
/*
 * A palindromic number reads the same both ways. The largest palindrome made
 *  from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers
 * */
public class q4 {

	public static void main(String[] args) {
	     int max=0;
	     int x=0,y=0;
         for(int i=999;i>99;i--){
        	 for(int j=999;j>99;j--){
        		 if(isPalindrome(i*j)){
        			 
        			 if(max<i*j){
        				 max=i*j;
        				 x=i;
            			 y=j;
            			
        			 }
        					 
        			 
        			 break;
        			  
        		 }
        			 
        	 }
        	 
         }
         System.out.println("x "+x+ " y "+y+ " and product "+max);
	}
	public static Boolean isPalindrome(int i){
		int j=0;
		while(i>=Math.pow(10,j)){
			j++;
		}
		
		while(i>9){
			if(i%10 == i%Math.pow(10, j-1)){
				j-=2;
				
				i=i/10;
				if(j<=0 )break;
			}
			else return false;
		}
		return 	true;
	}

}
