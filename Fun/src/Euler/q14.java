package Euler;
/*
 * n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains
 10 terms. Although it has not been proved yet (Collatz Problem), it is thought 
 that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 * */
public class q14 {

	public static void main(String[] args) {
        int counter=0,max=0,j,k=0;
        for (int i=113383;i<1000000;i++){
        	j=i;
        	
        	while(i>1){
        		
        		counter++;
        		if(i%2==0){
        			i/=2;
        		}
        		else i=3*i+1;
        		
        	}
        	if (counter>max){
        		max=counter;
        		k=j;
        		//System.out.print(max);
        	}
        	counter=0;
        	i=j;
        }
        System.out.println(max+" "+k);
	}

}
