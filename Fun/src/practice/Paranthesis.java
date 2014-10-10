package practice;

import java.util.ArrayList;

/*
 * 
 * 
 * 8.5 Implement an algorithm to print all valid 
 * (e.g., properly opened and closed) combinations
 * */


public class Paranthesis {
public static void main(String[] st){
	int[] a={4,7,3,6,7};
	 ArrayList<ArrayList<Integer>>  al=getTriangle( a);
	for(int i=0;i<al.size();i++){
		System.out.println();
		for(int j=0;j<al.get(i).size();j++){
			System.out.print(al.get(i).get(j)+" ");
		}
			
		
	}
}
  static  ArrayList<ArrayList<Integer>> getTriangle(int[] a){
	             ArrayList<ArrayList<Integer>>  al=new  ArrayList<ArrayList<Integer>> ();
	             ArrayList<Integer> a1=new ArrayList<Integer>();
                           if(a.length==1){
                        	   
                               a1.add(a[0]);
                               al.add(a1);
                               
                           }
                           else{
                               int l=a.length-1;
                                int[] x=new int[l];
                                for(int i=0;i<l;i++){
                                    x[i]=a[i]+a[i+1];
                                    a1.add(i, x[i]);
                                }
                                al.add(a1);
                                al.addAll(getTriangle(x));
                                
                           }
                           return al;
                           
    
    }

}
