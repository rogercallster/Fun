package practice;

import java.util.Dictionary;
import java.util.Hashtable;

public class ScanAStringAndFindAllWordsFromDictionary {
    public static void main(String[] m){
    	boolean b=true;
    	Hashtable<String, Boolean> dictionary=new Hashtable<String, Boolean> ();
    	dictionary.put("n", true);
    	dictionary.put("ku", true);
    	dictionary.put("r", true);
    	dictionary.put("b",true);
    	dictionary.put("ita",true);
    	dictionary.put("a", true);
    	String s="ahew";
    	    	
    }

    static boolean  scan(String st, Hashtable dictionary){
    	if(st.length()==0)return true;
    	boolean t =false;
    	for(int i=0;i<=st.length();i++){
    		if(dictionary.get(st.substring(0,i))!=null) t=scan((String)st.substring(i,st.length()),dictionary);
            if (t)return t;  		
    	}
    	return t;
    }
    
}
