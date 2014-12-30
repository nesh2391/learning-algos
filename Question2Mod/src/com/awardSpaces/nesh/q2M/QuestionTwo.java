package com.awardSpaces.nesh.q2M;

public class QuestionTwo
{
	
	
	int recursiveOnes(int arr[], int low, int high)
	{
		int mean = ((low + high)/2);
		//System.out.println(mean);
		int val = 0;
		//Case 1
		if(arr[mean]==1)
		{
			//System.out.println("in 1");
			if(arr[mean+1]==0)
			{ 
				//System.out.println("final case");
				return mean;
			}
			low = mean +1 ;
			val = recursiveOnes(arr,low,high);
		}
		if(arr[mean]==0)
		{
			//System.out.println("in 0");
			high = mean -1;
			val = recursiveOnes(arr,low,high);
		}
		return val;
	}
	void iterativeOnes(int arr[])
	{
		int low =0;
		int high = arr.length;
		while(low<=high)
		{
			int mean = ((low + high)/2);
			//System.out.println(mean);
			int val = 0;
			//Case 1
			if(arr[mean]==1)
			{
				//System.out.println("in 1");
				if(arr[mean+1]==0)
				{ 
					//System.out.println("final case");
					System.out.println("The last one:"+(mean+1));
					break;
				}
				low = mean +1 ;
				val = recursiveOnes(arr,low,high);
			}
			if(arr[mean]==0)
			{
				//System.out.println("in 0");
				high = mean -1;
				val = recursiveOnes(arr,low,high);
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		QuestionTwo obj = new QuestionTwo();
		System.out.println("Last one: "+(obj.recursiveOnes(arr, 0, arr.length)+1));
		obj.iterativeOnes(arr);
	}
}
