package practice;

import java.util.Stack;

public class Calculate {

	
	
public static void main(String[] str){// 48 //57
	
		Stack <Integer> stack1= new Stack<Integer>();
		char c;
		double result=Integer.parseInt(str[0]);
		for(int i=1;i<str.length;i++){
			if(str[i].charAt(0)+0<48 || str[i].charAt(0)+0>57){
				   c=str[i].charAt(0);
				  if(c=='+')result=result+stack1.pop();
				  if(c=='-')result=stack1.pop()-result;
				  if(c=='/')result=stack1.pop()/result; 
				  if(c=='*')result=result*stack1.pop();
				
			}
			else stack1.push(Integer.parseInt(str[i]));
		}	
		System.out.println(result);
	}
}
