package ch1;

public class q3 {
	
	public static void main(String[] args) {
		
		char[] ch={'o','b','c','d','e','s','g','a','b','c','a','a','a','a','a'};
		ch=removeDup(ch);
		for(char c: ch)System.out.print(c+" ");
	}

	private static char[] removeDup(char[] ch) {
		char[] c=new char[ch.length];
		int i=0;
		int index=0;
		
		for(char character:ch){
			
			if((i&(1<<character-'a'-0))==0){
				ch[index]=character;
				index++;
				i|=1<<character-'a'-0;
			}
		}
		for(i=index;i<ch.length;i++)ch[i]='a'-'a'-0;
		return ch; 
		
	}

}
