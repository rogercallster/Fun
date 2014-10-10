package epic;

public class qwertyKeyPad {
	
	public static void main(String [] st){
		
		
        char[][] ch = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}}; 
		qwertyValueForString(234,ch,"");
		
		
	}

	
		private static void qwertyValueForString(int n,char[][] ch,String st) {
            
            if(n==0 ){
            	System.out.println(st);
            	return;
            }
            
            for(int i=0;i<ch[(n%10)-2].length;i++){
            	
                qwertyValueForString( n/10,ch,ch[n%10][i]+st);

            
            }
            System.out.println();
		
    	}


}
