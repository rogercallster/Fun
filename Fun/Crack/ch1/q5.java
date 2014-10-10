package ch1;

public class q5 {
     public static void main(String[] agrv){
    	 System.out.println(spaceToPercent20(" my name is ankur "));
     }

	private static String spaceToPercent20(String string) {
		String s="";
		
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==' ')s=s+"20%";
			else s=s+string.charAt(i);
		}
		return s;
	}
}
