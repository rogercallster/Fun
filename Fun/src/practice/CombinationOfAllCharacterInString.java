package practice;

import java.util.ArrayList;

public class CombinationOfAllCharacterInString {
	public static void main(String[] st){
		ArrayList<String> al=new ArrayList<String>();
		al=Permutate("dcba","");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}

	private static ArrayList<String> Permutate(String string ,String print) {
		ArrayList <String> al= new ArrayList<String>();
        		if(string.equals("")){
                    if (orderred(print))
        			   al.add(print);
        			return al;
        		}
        		else{
                  for(int i=0;i<string.length();i++){
                    	 al.addAll(Permutate(string.substring(0,i)+string.substring(i+1,string.length()), print+(string.charAt(i))));
                   }
        		}
        		return al;
		
	}

	private static boolean orderred(String print) {
	 for(int i=1;i<print.length();i++){
		  if(!(( print.charAt(i)+0) > (print.charAt(i-1)+0)))return false;
		  
	 }
		return true;
	}

}
