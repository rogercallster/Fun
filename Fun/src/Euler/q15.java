package Euler;

/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to 
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * 
 * How many such routes are there through a 20×20 grid?
 * */
public class q15 {

	public static void main(String[] argv){
		
		 long [][] a= new long [21][21];
		 for(int i=0;i<a.length;i++){
		      a[i][0]=1;
		      a[0][i]=1;
		  }

		 for(int i=1;i<a.length;i++){
		     for(int j=1;j<a.length;j++){
		          if(i!=0|| j!=0|| i!=a.length||j!=a.length){
		              a[i][j]=(a[i-1][j] + a[i][j-1]);
		          }
		          else a[i][j]=max(a[i-1][j] , a[i][j-1]);
		     }

		 } 
	    System.out.print(a[a.length-1][a.length-1]);
	}
	
	static long max(long a, long b){
		return a>b?a:b;
	}
}
