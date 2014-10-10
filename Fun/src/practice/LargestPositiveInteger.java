package practice;

import java.util.ArrayList;

public class LargestPositiveInteger {
	public static void main(String[] st){
		//int i=(1<<31)-1;
		int count=0;
		int [] i={9,9};
		int[] a= square(i);
		
		for(int j=a.length-1;j>=0;j-- ) System.out.println( a[j]);
        
	
	}
	

	 static  int[] square(int[] arr){
	      int[] al= new int[arr.length*2];
	      int count=arr.length;
	      int quotient=0;
	      for(int i=arr.length-1;i>=0;i--){
	          for(int j=arr.length-1;j>=0;j--){
	              al[count+(j)]=((arr[i]*arr[j])%10)+(quotient)+al[count+(j)];
	              
	              quotient=(arr[i]*arr[j])/10;
	          }
	       count--;
	      }
	      return al;
	   }
	   
	  }	

	