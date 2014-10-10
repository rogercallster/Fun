package practice;

import java.util.Stack;


	public class Solution {
		public static void main(String[] st){
			int a[]={-90,1,2,4, 9, 4,5};
			//System.out.print(maxProduct(a));
			System.out.println( '0'+0+"   "+ '9'+0);
		}
		
		static int maxProduct(int[] A) {
	        //o is min  1 is max
	        int [][] a=new  int[A.length+1][2];
	        int max=0;
	        a[0][0]=1;
	        a[0][1]=1;
	        for(int i=1;i<A.length+1;i++){
	                a[i][0]=A[i-1]<A[i-1]*a[i-1][0]?  A[i-1]:A[i-1]*a[i-1][0] ;   
	                a[i][0]=a[i][0]<A[i-1]*a[i-1][1]?  a[i][0]:A[i-1]*a[i-1][1] ;   
	                a[i][1]=A[i-1]>A[i-1]*a[i-1][0]?  A[i-1]:A[i-1]*a[i-1][0] ;   
	                
	                a[i][1]=a[i][1]>A[i-1]*a[i-1][1]?  a[i][1]:A[i-1]*a[i-1][1] ;
	                
	                System.out.println(a[i][0]+" "+a[i][1]);
	                
	            }
	        for(int i=0;i<a.length;i++){
	            max=max<a[i][1]?a[i][1]:max;
	         }    
	         return max;
	    }
	        
	    
	   }
	   
	

	
