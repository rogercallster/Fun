package ch1;

public class q8 {
    public static void main(String[] argv){
    	String a="ankuar",b="akuran";
    	System.out.print(isRotation(a,b));
    }

	private static boolean isRotation(String a, String b) {
		int i=0;
		int j=0;
		int counter=0;
		while(i<a.length()){
			
			if(a.charAt(i)==b.charAt(j)){
				System.out.println(j+" "+(b.length()-1) );	
				if(j==(b.length()-1)){
					j=-1;
				}
				if(i==a.length()-1)return true;
				i++;
			}
			else i=0;
			j++;
			if(counter==2*(a.length())-1)return false;
			counter++;
			
		}
		
		return false;
	}
}
