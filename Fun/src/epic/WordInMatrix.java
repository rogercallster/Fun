package epic;

public class WordInMatrix {
   public static void main(String str){
	   
	   String s="ak";
   }

   static void wordInMatrix(String s,char [][] a){
	  int i=0,j=0;
   	  while(s.length()>0){
   		  if(i==a.length-1 && j==a[0].length)return ;
   		  if(!(s.charAt(0)==(a[i][j]))){
   			  if(i<a.length)i++;
   			  else{
   				  i=0;
   				  j++;
   			  }
   			  
   		  }
   		  else{
   			  i=0;
   		  }
   	  }
  }
  
 }
class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}