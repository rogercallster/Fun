package epic;

public class ValidNumber {

	public static void main(String[] args) {
        System.out.println(validNumber(121220));
	}
	static boolean validNumber(int num){
		int i=num;
                int count=0;
                while(num>0){
                    num/=10;
                    count++;
                }
                int div=count/3;
               num=i;
                int c= (i%(int)Math.pow(10,(count-(2*div))));
                num=(int) (i/(int)Math.pow(10,(count-(2*div))));    
                int b=(int) (i%(int)Math.pow(10,div));
              	num=(int) (i/(int)Math.pow(10,div));	
                int a=(int) (i/(int)Math.pow(10,div));
                
                if (a+b==c)return true;
               

		return false;
	}
}
