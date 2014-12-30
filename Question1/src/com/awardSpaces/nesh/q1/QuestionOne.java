package com.awardSpaces.nesh.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given a list of TestResult, where each result contains a test score, a student ID and a date, figure out the students' final scores. A final score is the average of a student's top 5 scores. 
 * Here is a sample of the list of TestResult: 
 * 50 JACK 5/14/2013 
 * 89 ALICE 3/25/2012 
 * 70 BOBBY 12/7/2010 
 * 60 JACK 8/9/2013 
 * 99 MIKE 9/11/2011 
 * 100 JOHN 7/4/2011 
 * 38 JACK 1/28/2014 
 * 46 JACK 11/15/2012 
 */
public class QuestionOne 
{
	public static void main(String[] args)
	{
		System.out.println("Program: One ");
		String[] elements = {"50 JACK 5/14/2013",
							"89 ALICE 3/25/2012",
							"70 BOBBY 12/7/2010",
							"60 JACK 8/9/2013",
							"99 MIKE 9/11/2011",
							"100 JOHN 7/4/2011",
							"38 JACK 1/28/2014",
							"46 JACK 11/15/2012"};
		
		HashMap<String, ArrayList> mapper = new HashMap<String, ArrayList>();
		
		for(int i =0; i<elements.length;i++)
		{
			String[] list = elements[i].split(" ");
			if(mapper.containsKey(list[1]))
			{
				List marksList = mapper.get(list[1]);
				marksList.add(list[0]);
				mapper.put(list[1], (ArrayList) marksList);
			}
			else
			{
				List marksList = new ArrayList();
				marksList.add(list[0]);
				mapper.put(list[1], (ArrayList) marksList);
			}
		}
			
		for (Map.Entry<String, ArrayList> entry : mapper.entrySet()) 
		{
		    String key = entry.getKey();
		    List value = entry.getValue();
		    Collections.sort(value);
		    System.out.println(key+" "+value);
		}
		
	}
}
