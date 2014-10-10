package Euler;
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class q3 {
	public static void main(String[] st){
		long var=(long) Math.sqrt(600851475143l);
		long i=var;
		while(i>2){
			if(isPrime(i)){
			if(600851475143l%i==0)break;
			}
			i--;
		}
		System.out.println(i);
	}

	private static boolean isPrime(long i) {
		int var=(int)Math.sqrt(i);
		while(var>2){
			
			if(i%var==0)return false;
			var--;
		}
		return true;
	}

}
