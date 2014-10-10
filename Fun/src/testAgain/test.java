package testAgain;

import java.util.ArrayList;

public class test {
	public static void main(String [] st){
		int[] x={1,5,2,4};
		int[] y={1,5,7,2,5,4,6};
		ArrayList<Integer> al =LMS(x,y);
		for(int i=0;i<al.size();i++)System.out.print(al.get(i)+" ");
	}

static ArrayList<Integer> LMS(int[] x , int[] y){
    int[][] C= new int[x.length+1][y.length+1];
    int[][] tracker= new int[x.length+1][y.length+1];

    int val=0;
    for(int i=0;i<=x.length;i++){
      C[i][0]=0;
    }
    for(int j=1;j<=x.length;j++){
        C[0][j]=0;
    }

    for(int i=1;i<=x.length;i++){
        for(int j=1;j<=y.length;j++){
            if(x[i-1]==y[j-1]){
                C[i][j]=C[i-1][j-1]+1;
                tracker[i][j]=x[i-1];
            }
            else{
                C[i][j]=C[i-1][j]>C[i][j-1]?C[i-1][j]:C[i][j-1];
                tracker[i][j]=0;
                 
            }
        }
    }
    ArrayList<Integer> al=new ArrayList<Integer>();
    for(int i=1;i<=x.length;i++){
        for(int j=1;j<=y.length;j++){
        	if(C[i][j]>C[i][j-1]){
        		if(tracker[i][j]!=0)
                al.add(tracker[i][j]);         		
            }
        }
    }
    
	return al;

}
private static void print(int[][] c,int x,int y) {
   for(int i=0;i<=x;i++){
	   for(int j=0;j<=y;j++){
		   System.out.print(c[i][j] +" ");
	   }
	   System.out.println();
   }	
}

static ArrayList<Integer> LIS(int[] s){

    ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> l=new     ArrayList<Integer>();
    l.add(0,s[0]);
    al.add(l);
    int max=l.size();
    int index=0;
    for(int i=1;i<s.length;i++){
        l=new ArrayList<Integer>(); 
        for(int j=0;j<i;j++){
            if(s[i]> al.get(j).get(al.get(j).size()-1) && (al.get(j).size()+1) > max)
            {   
                max=al.get(j).size()+1;
                index=j;
            }
           
         }
        l.addAll(al.get(index));
        l.add((al.get(index).size()),s[i]);
         al.add(i,l);
         max=0;
    }
    
     max=0;
     index=0;
    for(int i=0;i<al.size();i++ ){
        if(max<al.get(i).size()){
          max=al.get(i).size();
          index=i;
         }     
}
    return al.get(index);
    }
}