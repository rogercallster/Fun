package practice;

public class StringManupulations {
	public static void main(String[] str){
		hashFuntion("ankur");
		hashFuntion("rukna");
		hashFuntion("knaur");
	}
	

	  public static void  hashFuntion(String st){
	        char[] ch = st.toCharArray();
	        int sum=0;
	        for(int i =0;i<ch.length;i++) sum+=(ch[i])*Math.pow(10,i);
	        int index=0,s=sum,x=0;
	        System.out.println("   = "+sum);
	        while(s>0){
	        	x+=s%10;
	            s/=10;
	            
	            index++;
	            
	        }
	        System.out.println("Hash Funtion is = "+((int)(index*Math.pow(10,index))+x));
	    }
}
