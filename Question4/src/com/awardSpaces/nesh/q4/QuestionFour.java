package com.awardSpaces.nesh.q4;

/**
 * Find first index of string s2 , If any anagram of a string s1 is exist in another string s2 ? 
 * e.g. s1 abcd 
 * s2 abcdefcdbacd 
 * output should be 0 ,5, 6,7 .
 *
 */
public class QuestionFour
{
	public static void main(String[] args)
	{
		String mainString = "abcdefcdbacd";
		String anaElements = "abcd";
		for(int i=0;i<(mainString.length()-anaElements.length());i++)
			findAnagramAt(mainString,i,anaElements);
	}

	private static void findAnagramAt(String mainString, int start,String anaElements) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<anaElements.length();i++)
		{
			char checking = mainString.charAt(start+i);
			if(anaElements.indexOf(checking)==-1)
				return;
			
		}
		System.out.println("Anagram found at :"+start);
		
	}
}
