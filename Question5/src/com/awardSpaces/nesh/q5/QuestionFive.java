package com.awardSpaces.nesh.q5;

public class QuestionFive 
{
	int count=3;
	int arr[]={3,6,2};
	static boolean IsPossible(int arr[], int n, int sum)
	{
		if (n == 1) return sum == Math.abs(arr[0]);
		return IsPossible(arr, n-1,  sum + arr[n-1]) || IsPossible(arr, n-1,  sum - arr[n-1]);

	}
	public static void main(String[] args)
	{
	    int arr[]={1,2,3};
	    System.out.println(IsPossible(arr, 3, 0) ? "yes\n" : "no\n");

	    int arr2[]={3,6,2};
	    System.out.println(IsPossible(arr2, 3, 0) ? "yes\n" : "no\n");

	}
}
