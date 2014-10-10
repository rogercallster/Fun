package testAgain;



import java.io.*;

public class Q7 {
    static int count;
    
    public static void main(String args[])
    {
            permute(5,"",'b');
            System.out.println(count);
    }

    private static void permute(int len, String string,char j) {
            char i;
            if(len==0)
            {
                    System.out.println(string);
                    count++;
                    return;
            }
            for(i=j;i<='z';i++)
            {
                    permute(len-1,string+i,(char) (i+1));
            }
            
            
    }

}

