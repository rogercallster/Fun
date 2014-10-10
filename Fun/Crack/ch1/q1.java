package ch1;

public class q1 {
	public static void main(String [] str){
	    char[] ch= {'a','b','d','x','e','q','h'};
	    System.out.println(hasDuplicateChar(ch));
		
	}

	private static boolean hasDuplicateChar(char[] ch) {
		int num=0, i=0;
		for(char c:ch){
			i=1<<(c-'a'-0);
			if((num&i)!=0)return false;
			num|=i;
		}
		return true;
	}
}
