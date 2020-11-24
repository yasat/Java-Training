package com.project.training;

public class Primecheck {
	  static int[] remove(int[] numbers) 
	  { 
	      int n = 1; 
	  
	       
	      for (int i = 1; i < numbers.length; i++) { 
	          int j; 
	          for (j = 0; j < i; j++) 
	              if (numbers[i] == numbers[j]) 
	                  break; 
	          if (j == i) 
	              numbers[n++] = numbers[i]; 
	      } 
	   
	      int[] new_arr = new int[n]; 
	      for (int i = 0; i < n; i++) 
	          new_arr[i] = numbers[i];
	  
	      return new_arr; 
	  } 
	  
	  public static void main(String[] args) 
	  { 
	      int[] numbers = { 3, 5, 7, 2, 2, 5, 7, 7 }; 
	      numbers = remove(numbers); 
	  
	      for (int i = 0; i < numbers.length; i++) 
	          System.out.print(numbers[i] + " "); 
	      System.out.println(); 
	  } 
} 
	
