package com.greatlearning.balancedBrackets.service;
import java.util.Stack;

//import com.greatlearning.balancedBrackets.service.UseStack;
public class CheckBalanceBrackets {
	Stack<Character> stack=new Stack<Character>();

	public boolean checkBalanceStatus(String s1)
	{
	    char x;
		for(int i=0;i<s1.length();i++)
		  {
			  char ch=s1.charAt(i);
		      if(ch=='{'||ch=='['||ch=='(')
		      {  stack.push(ch);
		         continue;}
		      if(stack.isEmpty())
		          return false;
		      x=stack.pop();
		      switch(ch)
		      {
		      case '}':
		    	       if (x=='('||ch=='[')
		    	       return false;
		               break;
		      case ']':if(x=='{'||x=='(')
		    	       return false;
		               break;
		      case ')':if(x=='{'||x=='[')
                       return false;
                       break;
              }
		    }// end for
		return stack.isEmpty();
	}// end checkBalanceStatus
}//end class


