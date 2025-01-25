//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

import java.util.ArrayList;
import java.util.List;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
		int[] array = { 1, 5, 2, 8, 13, 6 };
		
		// 2. Print out the first element in the array
	
		System.out.println("\nQuestion 2:");
		System.out.println(array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println("\nQuestion 3:");
		System.out.println(array[array.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4:");
		//System.out.println(array[array.length]);
		//Index 6 out of bounds for length 6 error message
		
		// 5. Print out the element in the array at position -1, what happens?
       // Error message 
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
			for(int num : array)
			{System.out.println(num);}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			System.out.println("\nQuestion 8:");
			int sum=0;
			for(int num: array) {
				sum+=num;
			}
			System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
			System.out.println("\nQuestion 9:");
			
				double average=sum/array.length;
				System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
				System.out.println("\nQuestion 10:");
				for (int num :array) {
				   if (num%2!=0) {
					   System.out.println(num);
				   }
				}
				

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
				
				System.out.println("\nQuestion 11:");
				
				String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array

				System.out.println("\nQuestion 12:");
				int sum1=0;
				for (String name :names) {
					sum1 +=name.length();
				
				}
                System.out.println("The number of all chars in array names is " + sum1);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
            	System.out.println("\nQuestion 13:");
            	myGreeting("Alex");
            	myGreeting("Max");
            	
            	
            	
            	
            	
            	
			 // 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
            	System.out.println("\nQuestion 14:");
            	System.out.println(myGreeting1("Mariam"));
             	System.out.println(myGreeting1("Anton"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
            	System.out.println("\nQuestion 15:");
            	System.out.println(isMore("abracadabra",5));
            	System.out.println(isMore("no",20));
            	
            	
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
            	
            	System.out.println("\nQuestion 16:");
            	System.out.println(isIn(names,"no"));
            	System.out.println(isIn(names,"Sam"));
         	
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
            	System.out.println("\nQuestion 17:");
            	int[] myArray= {5,7,1,-3,24,185,0,500};
            	System.out.println("The smallest number of myArray is " + isSmall(myArray));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
            	System.out.println("\nQuestion 18:");
            	double[] myArr= {25.45,13.22,-12.23};
            	System.out.println(doubleAverage(myArr));
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
            	System.out.println("\nQuestion 18:");
            	
            	int[] nameLengths = ExtractLen(names);
        		for (int number : nameLengths) {
        			System.out.println(number);
        		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
        		System.out.println("\nQuestion 20:");
        		System.out.println(isEvenMoreThanOdd(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
        		System.out.println("\nQuestion 21:");
        		System.out.println(isPolindrom("racecar"));
        		System.out.println(isPolindrom("aaaracecar"));


	       	
	}
	

	
	// Method 13:
	 public static void myGreeting(String name) {
		 System.out.println("Hello dear " +name + "!");
	 }
	


	// Method 14:
	 public static String myGreeting1(String name) {
		 
		 String greeting= "Hello dear " +name + "!";
		 return greeting;
	 }
	
	
	// Method 15:
	 public static boolean isMore(String word, int num) {
		 boolean more=false;
 	     if (word.length()>num) {more=true;} 
 	     return more;
	 }
	
	// Method 16:
      public static boolean isIn(String[] arrStr, String str)
      {
    	  
    	  for(String lstr:arrStr ) {
    		  if (lstr.contains(str)) {
    			  return true;
    		  }
    	  }
    	  return false;
      }
	
	// Method 17:
	 public static int isSmall (int[] nums) {
		 int min=nums[0];	
		 for (int num:nums) {
		     if (min>num){ min=num;}
		 }
		 return min;
	 }

	
	// Method 18:
	 
	 public static double doubleAverage(double[] nums)
	 { 
		 double sum=0, result=0;
		 for (double num:nums) {
			 sum+=num;
			 result=sum/nums.length;
		 }
		 
		 return result;
	 }

	
	// Method 19:
	 
	 public static int[] ExtractLen(String [] str) {
		 
		 int [] result= new int[str.length];
		 for(int i = 0; i<str.length; i++ ) {
			 result[i]=str[i].length();
		 }
		 
		 return result;
	 }

	
	// Method 20:
	 
	 public static boolean isEvenMoreThanOdd(String[] myString) {
		 int sumEven=0, sumOdd=0;
		 for (String str:myString) {
			 if (str.length()%2==0) {
				 sumEven+=str.length();
			 } else  { sumOdd+=str.length();}
		 }
		 
		return sumOdd>sumEven;
		 
		 
	 }
	
	 
	 //
	

      
	 
	
	// Method 21:
	public static boolean isPolindrom(String str) {
		for (int i=0; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				return false;
			}
			
		}
		return true;
	}

}