package com.awardSpaces.nesh.q2;

public class QuestionTwo 
{
	public int arr[] = {1,0,1,0,1,1,0,0,1,1,1,0,0,1};
	public void iterativeSolution()
	{
		int count =0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == 1)
				count++;
		}
		System.out.println("The number of 1: "+count+"\nThe number of 0: "+(arr.length-count));
	}
	
	int count =0;
	void recursiveSolution(int[] arrRc, int index)
	{
		if(index<arrRc.length)
		{
			//System.out.println(index);
			if(arrRc[index] == 1)
				count++;
			recursiveSolution(arrRc, index+1);
		}
		return;
	}
	
	public static void main(String[] args)
	{
		QuestionTwo obj = new QuestionTwo();
		obj.iterativeSolution();
		obj.recursiveSolution(obj.arr, 0);
		System.out.println("The next solution :"+obj.count);
	}
}
