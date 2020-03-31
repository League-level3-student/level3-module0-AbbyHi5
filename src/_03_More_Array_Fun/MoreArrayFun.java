package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static //1. Create a main method to test the other methods you write.
	String[] names;
	public static void main(String[] args) {
		names = new String[]{"hello","hell","hel","he","h"};
		string(names);
		stringReverse(names);
		stringEveryOther(names);
		stringRandom(names);
	}
	
	//2. Write a method that takes an input of Strings and prints all the Strings in the input.
	
	public static void string(String[] input) {
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println("-");
	}
	
	//3. Write a method that takes an input of Strings and prints all the Strings in the input
	//   in reverse order.
	
	public static void stringReverse(String[] input) {
		
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.println(input[i]);
		}
		System.out.println("-");
	}
	
	//4. Write a method that takes an input of Strings and prints every other String in the input.
	
	public static void stringEveryOther(String[] input) {
		
		for (int i = 0; i < input.length; i++) {
			if(i%2 == 0){
			System.out.println(input[i]);
			}
		}
		System.out.println("-");
	}
	
	//5. Write a method that takes an input of Strings and prints all the Strings in the input
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	public static void stringRandom(String[] input) {
		
		Random rgen = new Random();  // Random number generator			
		 
		for (int i=0; i<input.length; i++) {
		    int randomPosition = rgen.nextInt(input.length);
		    String temp = input[i];
		    input[i] = input[randomPosition];
		    input[randomPosition] = temp;
		    System.out.println(input[i]);
		}
 
		
	}
	
}





