package Euler;

public class q10 {
    public static void main(String [] st){
    	int j=3;
    	long sum=2;
    	while(j<2000000){
    		if(isPrime(j))sum+=j;
    		j+=2;
    	}
    System.out.println(sum);		
    }

    public static Boolean isPrime(int i){
    	int sqrt=(int)Math.sqrt(i);
    	while(sqrt>1){
    		if(i%sqrt==0)return false;
    		sqrt--;
    	}
    	return true;
    }
    
}
