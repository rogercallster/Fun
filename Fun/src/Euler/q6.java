package Euler;

public class q6 {
	
	public static void main(String[] st){
		long sum=0;
		for(int i=1;i<=100;i++){
			for(int j=0;j<=100;j++){
				if(i!=j)sum+=i*j;
			}
		}
		System.out.println(sum);
	}

}
