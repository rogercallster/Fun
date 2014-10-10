package epic;

import java.util.ArrayList;

public class AllPosibleCombinationOfAString {
	 public static void main(String[] str){
		 ArrayList <String> al=allPossibleCombination("123");
		 for(String s : al)System.out.println(s);
	 }
     static ArrayList <String> allPossibleCombination(String str ){
    	 ArrayList <String> al=new ArrayList<String>();
         al.addAll(allCombination(str,""));
    	  return al;
     }
     static ArrayList<String> allCombination(String src ,String dst){
    	 
    	 ArrayList <String> al=new ArrayList<String>();
    	 if(src.equals("")){
    		 al.add(dst);
    	 }
    	 else{
    		 al.add(dst);
    		for(int i=0;i<src.length();i++){
    			
    			
    			
    			al.addAll(allCombination((String)src.substring(0, i)+(String)src.substring(i+1, src.length()),dst+src.charAt(i)));
    		}
    	 }
    	 return  al;
     }
}
