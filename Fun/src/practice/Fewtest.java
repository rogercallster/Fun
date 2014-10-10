package practice;

public class Fewtest {

	public static void main(String[] args) {
		
		String s="123321";
		
		getEqualSumSubstring(s);
	
	}
	static int getEqualSumSubstring(String s) {
		int max=0,n=0;
		for(int i=0;i<s.length();i++){
			for(int j=i;j<=s.length();j++){
				if(j-i>1)
				n=isSum( s.substring(i,j));
				max=n>max?n:max;
			}
			
			
		}
			
		return max;
	}
	private static int isSum(String substring) {
		
		int sum1=0,sum2=0;
		int size=(substring.length())/2;
		for (int i=0;i<size;i++){
			sum1+=Character.getNumericValue((substring.charAt(i)));
			
			sum2+=Character.getNumericValue((substring.charAt(i+size)));
		}
		
		return sum1==sum2?sum1:0;
	}
	
}
