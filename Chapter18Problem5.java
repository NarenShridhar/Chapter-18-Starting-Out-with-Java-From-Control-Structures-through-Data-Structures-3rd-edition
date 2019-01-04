import java.util.Scanner;

public class Chapter18Problem5
{
	public static void main (String[] args)
	{
		// Created 2 Objects of the GenericBinarySearcher class for Integer objects and String objects.
		GenericBinarySearcher<Integer> gbs1 = new GenericBinarySearcher<Integer>();

		GenericBinarySearcher<String> gbs2 = new GenericBinarySearcher<String>();

		// Created a Scanner object keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// To get the search results.
		int result1, result2;

		// The Integer value input by the user to search in the sorted array.
		Integer searchInteger;

		// The String value input by the user to search in the sorted array. 
		String searchString;

		// Char variable repeat allows the user to search as many times as they want.
		char repeat = 'Y';

		// Created an Integer array
		Integer[] integerArray = {0, 5, 1, 4, 10};

		// Created a String array
		String[] stringArray = {"Baba", "Shridhar", "Ranjini", "Vivek", "Meera"};

		// Display the original order
		System.out.println("\nOrginal Order: ");

		// Enhanced for loop to print each element. 
		for(Integer element : integerArray)
		{
			System.out.println(element + " ");
		}

		// Extra line for spacing
		System.out.println();

		// Display the original order
		System.out.println("\nOrginal Order: ");

		// Enhanced for loop to print each element. 
		for(String element : stringArray)
		{
			System.out.println(element + " ");
		}

		// Extra line for spacing
		System.out.println();

		// Sort the Integer array using the insertionSort method in the GenericBinarySearcher class. 
		gbs1.insertionSort(integerArray);

		// Sort the String array using the insertionSort method in the GenericBinarySearcher class. 
		gbs2.insertionSort(stringArray);

		// Display the sorted order
		System.out.println("\nSorted Order: ");

		// Enhanced for loop to print each element. 
		for(Integer element : integerArray)
		{
			System.out.println(element + " ");
		}

		// Extra line for spacing
		System.out.println();

		// Display the sorted order
		System.out.println("\nSorted Order: ");

		// Enhanced for loop to print each element. 
		for(String element : stringArray)
		{
			System.out.println(element + " ");
		}

		// While loops serves to allow the user to search the arrays as many times as they want. 
		while(repeat == 'Y' || repeat == 'y')
		{
			// Get the searchInteger.
			System.out.println("User, please enter a number to search for: ");

			// Set the searchInteger.
			searchInteger = keyboard.nextInt();

			// Store the result in result1.
			result1 = gbs1.binarySearch(integerArray, 0, integerArray.length - 1, searchInteger);

			// Display the results
			if(result1 == -1)
			{
				System.out.println("The value " + searchInteger + " was not found in the array.");
			}

			else
			{
				System.out.println(searchInteger + " was found at element " + result1);
			}

			// Consume the remaining newline...
			keyboard.nextLine();

			// Get the searchString
			System.out.println("User, please enter a String to search for: ");

			// Set the searchString
			searchString = keyboard.nextLine();

			// Store the result in result 2.
			result2 = gbs2.binarySearch(stringArray, 0, stringArray.length -1, searchString);

			System.out.println(result2);

			if(result2 == -1)
			{
				System.out.println("The String " + searchString + " was not found in the array.");
			}

			else
			{
				System.out.println(searchString + " was found at element " + result2);
			}

			System.out.println("User, do you want to search again? Type 'Y' or 'N'.");
			repeat = keyboard.nextLine().charAt(0);
		}
	}
}