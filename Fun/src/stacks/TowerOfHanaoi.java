package stacks;

import java.util.Stack;

public class TowerOfHanaoi {
	public static void main(String [] st){
	    Stack<Integer> src =new Stack<Integer>();
	    Stack<Integer> mid =new Stack<Integer>();
	    Stack<Integer> dst =new Stack<Integer>();
	
	    for(int i=10;i>0;i--){
		    src.push(i);
		    
	    }
	    
	    
	    
	    
	    towerOfHanaoi(10,src,mid,dst);
	    for(int i=10;i>0;i--){
	    System.out.println(dst.pop());
	    }
}

	private static void towerOfHanaoi(int n, Stack<Integer> src, Stack<Integer> mid,
			Stack<Integer> dst) {
        if(n>0){
        	towerOfHanaoi(n-1, src , dst , mid);
        	dst.push((src.pop()));
        	towerOfHanaoi(n-1, mid, src, dst);
        }
        
		
	}

}