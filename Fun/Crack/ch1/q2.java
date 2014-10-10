package ch1;

public class q2 {
//c style string reverse
	public static void main(String[] args) {
        String str= "test this string now and reverse in place";
        System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		int i=0;
		char temp;
		char[] s= str.toCharArray();
		while(i<=str.length()/2){
			
			temp=str.charAt(i);
			s[i]=str.charAt(str.length()-i-1);
			s[(str.length()-i-1)]=temp;
			i++;
		}
		str="";
		for(char c:s)str=str+c;
		
		return str;
	}

}
