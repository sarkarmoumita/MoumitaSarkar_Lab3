package com.greatlearning.TreeSum;
import java.util.HashSet;
public class CheckSum {
	Node root;
	public Node insert(Node root,int data)
	{
		if(root==null)
		    {
			root=new Node(data);
			 return root;
		    }
		else if(data<root.key)
			root.left=insert(root.left,data);
		else if(data>root.key)
			root.right=insert(root.right,data);
		return root;
	}
	public boolean findPair(Node root,int sum,HashSet set)
	{
		if(root ==null)
		    return false;
		if (findPair(root.left,sum,set))
			return true;
		if(set.contains(sum-root.key))
		{
			System.out.print("Pair found for "+sum+":");
			System.out.println(" ("+root.key+","+(sum-root.key)+")");
			return true;
		}
		else
			set.add(root.key);
		return findPair(root.right,sum,set);
}
	
	public void findPairWithGivenSum(Node root,int sum)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		if(!findPair(root,sum,set))
		{
			System.out.print("Pair found for "+sum+":");
		    System.out.println(" pair does not exist");}
	}}


