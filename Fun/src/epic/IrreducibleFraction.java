package epic;

public class IrreducibleFraction {
       public static void main(String[] st){
    	   double d=.0003;
    	   System.out.println(gcd((int)(d*10000),10000));
       }
       
       public static String gcd(int num, int b){
    	   int n=num,d=b,i=2;
               while(n-d>0||d-n>0){
            	   n=n>d?n-d:n;
            	   d=d>n?d-n:d;
               }
    	       	   return (num/n)+"/"+(b/num);
       }
}
