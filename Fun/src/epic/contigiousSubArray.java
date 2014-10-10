package epic;

/*
 

Find the largest sum contiguous sub array. The length of the returned sub array must be 
at least of length 2.
 * */

public class contigiousSubArray {
    public static void main(String[] st){
    	int[] a={2,4,3,-9,3,5,3,7,3,34,6,7,-456,5,34,63,2,-52,7,3,4};
    	int maxSum=0;
    	int sum=0;
    	for(int i=0;i<a.length;i++){
    		//System.out.println(sum);
    		if(sum+a[i]<0){
    			
    			sum=0;
    		}
    		else {
    			sum+=a[i];
    		}
    		maxSum=maxSum>sum?maxSum:sum;
    	}
    	
    	System.out.println(maxSum);
    }
    
}
