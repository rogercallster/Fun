package epic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeedOfAGivenNumber {
	public static void main(String [] sarewadsfaegfqergfdagfdgerg) throws NumberFormatException, IOException{
	    while(true){ 
	    	System.out.println("enter no .... ");
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	
	    	int num=Integer.parseInt(br.readLine());
	    	int seed=2;
	    	while(num/seed>=2){
	    		int saveSeed=seed;
    			int product=seed;
    			
	    		if(num%seed==0){
	    			
	    			
	    			while(seed>0){
	    			
	    				product*=seed%10;
	    				seed/=10;
	    				
	    			}
	    			
	    			
	    			if(product== num){
	    				System.out.println(saveSeed+" is seed for  "+num );
	    				break;
	    			}
	    			
	    		}
	    		seed=saveSeed+1;
	    			
	    	}
	    	
	    	
	    }
	}

}
