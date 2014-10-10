package practice;

public class RaceRocketFuel {
    
	 public static void main(String[] st){
		 int[] set= {4,2,6,1,6,23,7,22,25,233,3,24,1};
		//for(int i:set)System.out.println(i);
		 //PRINT
		 quickSort(set,0,set.length-1);
		 for(int i:set)System.out.println(i);
		 
		 
	 }
	 
		 static void quickSort(int [] set, int l,int h){
			 if(l<h){
				 int i=l;
				 int j=h;
				 long pivot = set[h];
				 while(j>=i){
					while(set[i]<pivot) {
						i++;
					}
					while(set[j]>pivot){
						j--;
					}
					
					if(i<=j){
					  swap(set,i,j);
					  i++;j--;
					  }
					
					else break;
				 }
				 if(l<j)
				 quickSort(set,l,i-1);
				 if(h>i)
				 quickSort(set,i,h);
				 
				 
			 }
		 }

		private static void swap(int[] ar ,int i, int j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
		}
	 
}


class Set{
	long start;
	long end;
	int id;
}