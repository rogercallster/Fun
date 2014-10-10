package epic;

import java.util.ArrayList;

public class PrintAllPalindrome {
    public static void main(String [] st){
    	ArrayList <String > al=allPalindrome("123454321");
    	for(int i=0;i<al.size();i++){
    		System.out.println(al.get(i));
    	}
    }
    public static ArrayList<String> allPalindrome(String  st){
    	ArrayList <String> al=new ArrayList <String>();
    	
    	for(int window=3;window<st.length();window++){
    		for(int index=0;index<st.length()-window;index++){
    			String string = isPalindrome((String)st.substring(index, index+window+1));
    			if(!string.equals("")) 
    				al.add(string);
    		}
    	}
    	
    	return al;
    }
    public static String isPalindrome(String string){
    	
    	int index=0,length=string.length();
    	while(string.charAt(index)==string.charAt(length-index-1) ){
    		if( index>(length-index-1)) return string;
    		index++;
    	}
    	//System.out.println(string);
    		
    	return "" ;
    }
}
