package practice;

import java.util.Hashtable;

public class RandomPointerLinkedList {
  
	public static void main(String[] node ){
		
		String[] s = {"rat","bat","bay"};
			Hashtable <String,Boolean> ht=new Hashtable<String,Boolean>();
			ht.put("rat", true);
			ht.put("bat", true);
			ht.put("bay", true);
			reached (ht,"rat","bay",s);
			System.out.println(ht.get("rat"));
		}

	private static void reached(Hashtable<String, Boolean> ht, String string,
			String string2, String[] s) {
		 for(int  i =0;i<string.length();i++){;}
		 
		 
		
	}
		
	
	
}

