package com.greatlearning.balancedBrackets.main;
import com.greatlearning.balancedBrackets.service.CheckBalanceBrackets;
public class Driver {
	public static void main(String args[])
	{
	  CheckBalanceBrackets chk=new CheckBalanceBrackets();
	  String s1="([[{}]])";
	  String s2="([[{}]]))";
	  String s3="(([[{}]])";
	  if(chk.checkBalanceStatus(s1))
	  {   System.out.print("Expression "+s1+":");
		  System.out.println("is balanced");
	  }
	  else
		 {System.out.print("Expression "+s1+":");
		  System.out.println("is unbalanced");}
	  if(chk.checkBalanceStatus(s2))
	  {   System.out.print("Expression "+s2+":");
		  System.out.println("is balanced");
	  }
	  else
		 {System.out.print("Expression "+s2+":");
		  System.out.println("is unbalanced");}
	  if(chk.checkBalanceStatus(s3))
	  {   System.out.print("Expression "+s3+":");
		  System.out.println("is balanced");
	  }
	  else
		 {System.out.print("Expression "+s3+":");
		  System.out.println("is unbalanced");}
	  }
}

