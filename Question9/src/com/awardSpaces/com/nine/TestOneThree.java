package com.awardSpaces.com.nine;

public class TestOneThree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * The palindorme program
		 */
		String element = "ABCCBA";
		if(element.length()%2 == 0)
		{
			checkIfPalindrome(element,element.length()/2, element.length());
		}
		else
		{
			checkIfPalindrome(element,(element.length()-1)/2, element.length());
		}

	}

	static int index = 0;
	private static void checkIfPalindrome(String element, int iterate, int fin) 
	{
		// TODO Auto-generated method stub
		while(iterate>=0)
		{
			if(element.charAt(index)== element.charAt(fin-1))
			{index++;fin--;}
			else
			{break;}
			iterate --;
		}
		if(iterate>0)
		{
			System.out.println("Not a palindrome");
		}
		else
		{
			System.out.println("It is a palindrome");
		}
		
	}

}
