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
		
		System.out.println("\n --Bubble sort--");
		int arrB[] = {11,10,15,8,12,9,0,17};
		
		for(int i=0;i<arrB.length-1;i++)
		{
			for(int j = 0;j<(arrB.length-i-1);j++)
			{
				if(arrB[j]>arrB[j+1])
				{int temp = arrB[j];arrB[j]=arrB[j+1];arrB[j+1]=temp;}
			}
		}
		for(int i = 0; i<arrB.length;i++)
			System.out.print(arrB[i]+" ,");
		
		QuestionTen ten = new QuestionTen();
		ten.pintEle();
		ten.mergeSort(0,ten.arr2.length-1);
		ten.pintEle();
	}
		int arr2[] = {12,9,18,5,6,18,9,16,21,0,1};
		int[] helper = new int[arr2.length];
		void mergeSort(int low, int high)
		{
			if(low<high)
			{
				int mid = (low+high)/2;
				mergeSort(low,mid);
				mergeSort(mid+1,high);
				merge(low,mid,high);
			}
		}
		void merge(int low, int mid, int high) 
		{
			// TODO Auto-generated method stub
			for(int i=low;i<=high;i++)
				helper[i] = arr2[i];
			
			int i=low;
			int j=mid+1;
			int k=low;
			while(i<=mid && j<=high)
			{
				if(helper[i]<helper[j])
				{arr2[k]=helper[i];i++;}
				else
				{arr2[k]=helper[j];j++;}
				k++;
			}
			while(i<=mid)
			{
				arr2[k]=helper[i]; i++; k++;
			}
			while(j<=high)
			{
				arr2[k]=helper[j]; j++; k++;
			}
		}
		
		void pintEle()
		{
			System.out.println("\n ");
			for(int i=0;i<arr2.length;i++)
				System.out.print(arr2[i]+" ");
		}
	

}
