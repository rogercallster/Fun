package testAgain;

public class GrayCode {
	
	public static void main(String[] st){
		int a=4,b=7;
		System.out.println(isGrayCode(a,b));
	}

	private static boolean isGrayCode(int a, int b) {
		int result=(a^b);
		int count=0;
		while(result > 0){
			if((result&1)==1)count++;
			result=result>>1;
		}
		
		return count==1?true:false;
	}

}
