package com.awardSpaces.nesh.q10;

public class QuestionTen {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {12,22,16,4,10,8};
		//System.out.println(arr.length);
		for(int i = 0; i<arr.length;i++)
			System.out.print(arr[i]+" ,");
		System.out.println();
		
		for(int i =0; i<arr.length-1;i++)
		{
			int min = arr[i];
			int pos = i;
			for(int j =1+i;j<arr.length;j++)
			{
				if(min>arr[j])
					{min=arr[j];pos=j;}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos]= temp;
		}
		for(int i = 0; i<arr.length;i++)
			System.out.print(arr[i]+" ,");
	}
	

}
