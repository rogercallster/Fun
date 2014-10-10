package Euler;

public class q7 {

	public static void main(String[] args) {
		int count=0,i=2;
       while(count<10001){
    	   if(isPrime(i))count++;
    	   i++;
       }
       System.out.println(i-1);
	}
 public static Boolean isPrime(int i){
	 int x=(int)Math.sqrt(i);
	 while(x>1){
         if(i%x==0)return false;
         x--;
	 }
	 return true;
 }
}
