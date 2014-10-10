package epic;

public class swapAdjacent {
	public static void main(String [] string)
	{
	        String a = "1bC3werAu";
	        String b = "rew3u1ACb";
	        char temp;
	        int n =(b.length());
	        int j=0;
	        int index;
	        for(int i=0;i<b.length()-1;i++){
	        	index=find(b.charAt(i),a);
	        	a=put(a,index,i);
	        	System.out.println(a +"        "+b);               
	        }
	        
	        
	}

	private static String put(String a,int index, int i) {
        for(int j=index;j>i;j--){
        	a=swap(a,j);
        }
        return a;
	}

	private static String swap(String a, int j) {
              char c= a.charAt(j);
              char c1=a.charAt(j-1);
               return a.substring(0,j-1)+c+c1+a.substring(j+1,a.length());
	}

	private static int find(char c, String a) {
		for(int i=0;i<a.length();i++)if(a.charAt(i)==c)return i;
		return 0;
	}

}
