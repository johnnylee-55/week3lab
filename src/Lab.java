
public class Lab {

	public static void main(String[] args) {
		// create an array with the following values: 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, 13, 6};
		
		// print out the first element in the array
		System.out.println(array[0]);
		
		// print out the last element in the array w/out using the number 5
		System.out.println(array[array.length - 1]);
		
		// print out the element in the array at position 6. what happens?
		// > error, element is out of bounds
		
		// print out the element in the array at position -1. what happens?
		// > error, element is out of bounds
		
		// write a traditional or loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// write an enhanced for loop that prints out each element in the array
		for (int digit : array) {
			System.out.print(digit + " ");
		}
		System.out.println();
		
		// create a new variable called sum, write a loop that adds each element in the array to the sum
		int sumArray = 0;
		for (int digit : array) {
			sumArray += digit;
		}
		System.out.println("sum of elements in array: " + sumArray);
		
		// create new variable called average, and assign the average value of the array to it
		double average = (double) sumArray / (double) array.length; // returns 5.83
		double falseAverage = sumArray / array.length;
		System.out.println("average of elements in array: " + average);
		System.out.println("incorrect result: " + falseAverage);
	
		// write an enhanced for loop that prints out each number in the array only if the number is odd
		System.out.print("elements in array that are odd: ");
		for (int digit: array) {
			if (digit % 2 != 0) {
				System.out.print(digit + " ");
			}
		}
		
		// create an array that contains the values "Sam", "Sally, "Tom", and "Robert"
		String[] people = {"Sam", "Sally", "Tom", "Robert"};
		
		// calculate the total number of letters in the new array
		int totalLetters = 0;
		for (String person : people) {
			totalLetters += person.length();
		}
		System.out.println("total # of letters in array: " + totalLetters);
		
		// write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Tom");
		greet("Sally");
		
		// write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(greet2("Nick") );
		
		// analyze the difference between these two methods - what do you find? how are they different?
		/*
		 * greet() performs a task while greet2() returns something
		 */
		
		// write and test a method that takes a String and an int and returns true if the numbers of letters
		// in the string is greater than the int
		String myString = "Sheesh";
		int myInt = 8;
		System.out.println("string-int compare: " + stringIntCompare(myString, myInt) );
		
		// write and test a method that takes an array of string and a string and returns true if
		// the string passed in exists in the array
		String testString = "beAns";
		String[] food = {"Tomato", "Onion", "Beef", "Strawberries", "Burger", "Beans"};
		System.out.println("string exists in array: " + stringExists(testString, food) );
		
		// write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println("smallest integer in array: " + smallestInt(array) );
		
		// write and test a method that takes an array of double and returns the average
		double[] numbers = {2.9, 3.5, 2.32, 3.1, 2.75};
		System.out.println("average of elements in array: " + averageDouble(numbers) );
		
		// write and test a method that takes an array of Strings and returns an array of int where each element
		// matches the length of the string at that position
		System.out.print("lengths of each string in array: ");
		int[] stringLengths = lengthOfStrings(food);
		for (int length : stringLengths) {
			System.out.print(length + " ");
		}
		System.out.println();
		
		// write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		// even amount of letters is greater than the sum of those with an odd amount of letters
		System.out.println("more even-lettered strings than odd-lettered: " + moreEvenLetters(food) );
		
		// write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println("is palidrome: " + isPalindrome("tacocat") );

	}
	
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public static String greet2(String name) {
		return "Greetings, " + name + "!";
	}
	
	public static boolean stringIntCompare(String string, int integer) {
		return string.length() > integer;
	}
	
	public static boolean stringExists(String myString, String[] array) {
		for (String word : array) {
			if (word.equalsIgnoreCase(myString) ) {
				return true;
			}
		}
		return false;
	}
	
	public static int smallestInt(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double averageDouble(double[] array) {
		double sum = 0;
		for (double number: array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	public static int[] lengthOfStrings(String[] string) {
		int[] stringLengths = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			stringLengths[i] = string[i].length();
		}
		return stringLengths;
	}
	
	public static boolean moreEvenLetters(String[] array) {
		int evencounter = 0;
		int oddcounter = 0;
		
		for (String string : array ) {
			if (string.length() % 2 == 0) {
				evencounter += string.length();
			} else {
				oddcounter += string.length();
			}
		}
		return evencounter > oddcounter;
	}
	
	public static boolean isPalindrome(String string) {
		for (int i = 1; i <= string.length() / 2; i++) {
			if (string.charAt(i - 1) != string.charAt(string.length() - i) ) {
				return false;
			}
		}
		return true;
	}

}
