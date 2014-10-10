package ch1;

public class q4 {
	public static void main(String [] argv){
		String a="ankur",b="rukna";
		System.out.println(isAnagram(a,b));
		
	}

	private static boolean isAnagram(String a, String b) {
		int[][] lookup= new int[26][1];
		for(int i =0;i<a.length();i++){
			lookup[a.charAt(i)-'a'-0][0]=lookup[a.charAt(i)-'a'-0][0]+1;
		}
		for(int i =0;i<b.length();i++){
			lookup[b.charAt(i)-'a'-0][0]=lookup[b.charAt(i)-'a'-0][0]-1;
		}
		int length=a.length()>b.length()?a.length():b.length();
		for(int i =0;i<26;i++){
			if(lookup[i][0]!=0)return false;
			
		}
		return true;
	}

}
