package testAgain;

public class Bits {

	public static void main(String[] args) {
         int a=63;//11111
         int b=5;//10000000
         int i=1,j=3;
         int k=~0;
         k=k<<3;
         int l=(1<<(i+1) )-1;
         k=k|l;//11110001
         l=a&k;
         k=b<<i;
         
         System.out.print(k|l);
	}

}
