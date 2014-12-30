package com.awardSpaces.nesh.q6m;

import java.util.ArrayList;
import java.util.List;

public class QuestionSixM 
{
	class TreeElement
	{
		int data;
		List<TreeElement> children = new ArrayList<TreeElement>();
	}
	TreeElement[] arrQueue = new TreeElement[100];
	int rear = 0;
	int front =0;
	int MAX = 100;
	
	void insertElement(TreeElement element)
	{
		if(rear < MAX)
		{
			arrQueue[rear]=element;
			rear = rear+1;
		}
		else
		{
			System.out.println("Overflow condition");
		}
	}
	void deleteElement()
	{
		if(front > rear)
		{
			System.out.println("Underflow Condition");
		}
		else
		{
			front++;
		}
	}
	TreeElement currentElement()
	{
		if(front>rear)
		{
			System.out.println("Underflow condition");
			return null;
		}
		else
		{
			TreeElement element = arrQueue[front];
			deleteElement();
			return element;
		}
	}
	void display()
	{
		if(front > rear)
			System.out.println("Nothing to show");
		else 
			for(int i = front;i<rear;i++)
				System.out.println(arrQueue[i].data);
	}
	void buildTree()
	{
		TreeElement root = new TreeElement();
		root.data = 1;
		TreeElement child1Level1 = new TreeElement();
		TreeElement child2Level1 = new TreeElement();
		TreeElement child3Level1 = new TreeElement();
		child1Level1.data = 2;
		child2Level1.data = 3;
		child3Level1.data = 4;
		root.children.add(child1Level1);
		root.children.add(child2Level1);
		root.children.add(child3Level1);
		TreeElement child1Level2 = new TreeElement();
		TreeElement child2Level2 = new TreeElement();
		child1Level2.data = 5;
		child2Level2.data = 6;
		child2Level1.children.add(child1Level2);
		child2Level1.children.add(child2Level2);
		
		if(root == null)
			System.out.println("No tree");
		else
		{
			insertElement(root);
			while(front<rear)
			{
				TreeElement temp = currentElement();
				System.out.println(temp.data);
				for(int i=0;i<temp.children.size();i++)
					insertElement(temp.children.get(i));
			}
		}
	}
	public static void main(String[] args)
	{
		QuestionSixM obj = new QuestionSixM();
		obj.buildTree();
	}
}
