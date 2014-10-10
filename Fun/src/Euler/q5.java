package Euler;
/*What is the smallest positive number that is evenly divisible by all 
 * of the numbers from 1 to 20?*/

public class q5 {
   public static void main(String [] st){
	   long product=1l;
	   int index=1;
	   for (int i=2;i<20;i++){
		   index=1;
		   if(isPrime(i)){
			   while(Math.pow(i,index)<=20)index++;
			   System.out.println(Math.pow(i,(index-1))+" "+i);
			   product*=Math.pow(i,(index-1));
		   }
		   
			   
	   }
	   System.out.println(product);
	   
   }

private static boolean isPrime(int i) {
	int x=(int)(Math.sqrt(i));
	if(i==2 ||i==3)return true;
	while(x>1){
		if(i%x==0)return false;
		x--;
	}
	return true;
	
}
}
