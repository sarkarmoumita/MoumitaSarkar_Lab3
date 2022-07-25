package com.greatlearning.TreeSum;
import java.util.Scanner;
public class Driver {
	   public static void main(String args[])
	   {
		   Node root=null;
		   Scanner sc=new Scanner(System.in);
		   CheckSum tree=new CheckSum();
		   root=tree.insert(root,40);
		   root=tree.insert(root,20);
		   root=tree.insert(root,60);
		   root=tree.insert(root,10);
		   root=tree.insert(root,30);
		   root=tree.insert(root,50);
		   root=tree.insert(root,70);
		   tree.findPairWithGivenSum(root,130);
		   tree.findPairWithGivenSum(root,80);
		   tree.findPairWithGivenSum(root,110);
		   tree.findPairWithGivenSum(root,65);
}
}