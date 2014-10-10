package practice;

import java.util.ArrayList;


public    class HarshaTest{

public static void main(String [] string){
	System.out.println(reverseSentense ("ankur is my name"));
}    
    static String reverseSentense(String str){
        ArrayList<String> al=new ArrayList<String>();
        int j=0;
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)==' '){
                 al.add((String)str.substring(j,i));
                 j=i+1;
             }
             
             if(i>=str.length()-1)al.add((String)str.substring(j,i+1));
         } 
        
        String   s=" ";
        for(int i=al.size()-1;i>=0;i--){
           if(i>0) s=s.concat(al.get(i)+" ");
           else s=s.concat(al.get(i));
          }
        return s;
    }
}