package com.awardSpaces.nesh.q8;

import java.util.*;

public class QuestionEight {
   public static void main(String args[]) {
      // create priority queue
      PriorityQueue < Integer >  prq = new PriorityQueue < Integer > (); 
       
      // insert values in the queue
      prq.add(6);  
      prq.add(9);
      prq.add(5);
      prq.add(64);
      prq.add(6);
      
      System.out.println ( "Priority queue values are: "+ prq);
      
      // create arr1
      Integer[] arr1 = new Integer[5];
      
      // use toArrsy() method
      Integer[] arr2 = prq.toArray(arr1); 
  
      System.out.println ( "Value in arr1: ");
      
      for ( int i = 0; i<arr1.length; i++ ){  
         System.out.println ( "Value: " + arr1[i]) ; 
      }
      
      System.out.println ( "Value in arr2: ");
      
      for ( int i = 0; i<arr2.length; i++ ){  
         System.out.println ( "Value: " + arr2[i]) ; 
      }
      prq.remove();
      prq.add(1);
      System.out.println ( "Priority queue values are: "+ prq);
   }
}