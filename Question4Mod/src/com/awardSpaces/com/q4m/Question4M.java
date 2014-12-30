package com.awardSpaces.com.q4m;

public class Question4M 
{
	
	class LinkedList
	{
		private int Data;
		LinkedList nextElemenet = null;
	}
	static LinkedList root = null;
	
	void add(int element)
	{
		//Insert at the beginning
		if(root == null)
		{
			root = new LinkedList();
			root.Data=element;
			root.nextElemenet=null;
		}
		//Insert at the end of the list
		else
		{
			LinkedList temp = root;
			while(!(temp.nextElemenet == null))
				temp = temp.nextElemenet;
			LinkedList newElement = new LinkedList();
			newElement.Data = element;
			newElement.nextElemenet = null;
			temp.nextElemenet = newElement;
		}
	}
	void printList()
	{
		LinkedList temp = root;
		while(temp != null)
		{
			System.out.println(temp.Data);
			temp = temp.nextElemenet;
		}
			
	}
	void printReversed(LinkedList current)
	{
		if(current.nextElemenet != null)
			printReversed(current.nextElemenet);
		System.out.println(current.Data);
	}
	public static void main(String[] args)
	{
		Question4M obj = new Question4M();
		obj.add(0);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.printList();
		System.out.println("The test function");
		obj.printReversed(obj.root);
	}
}
