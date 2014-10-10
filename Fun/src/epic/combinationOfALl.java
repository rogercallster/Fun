package epic;

public class combinationOfALl {
	//sqrt

	public static void main(String[] str){
		double num= 25;
		System.out.println(sqrt(num));
	}

	private static double sqrt(double num) {
		
		double r=0;
		double j=0,k=0,p;
		double result=0;
		for(int i=0;i<5;i++){
			k=0;
			
		    while(j*j<=num){
			    j++;
			    k++;
			    if(i>0 && k>9){
			    	
			    	break;
			    }
		    }
		    
		    j--;k--;
		  
		    num=(num%(j*j))*100;
		   
		    if (i>0){
		    result=j;
		    }
		    else {
		         p=1;
		    	for(int l=0;l<i;l++)p*=10;
		    	result+=k/p;
		    	k=0;
		    }	
		    	j=(j+j)*10;
		    	 if(num<=0)return result; 
		}
		return result;
	}
}
