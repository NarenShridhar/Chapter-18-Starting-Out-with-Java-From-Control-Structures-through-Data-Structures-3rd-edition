// This version of the Binary Search class sorts using a generic class that implements the Comparable Inteface.
public class GenericBinarySearcher<T extends Comparable>
{

	// Recursive binary search
	public int binarySearch(Comparable<T>[] userArray, int first, int last, T userValue)
	{
		// The midpoint of the search.
		int middle;

		// Test the base case where the value is not found. 
		if(first > last)
		{
			return -1;
		}

		// Calculate the middle position.
		middle = (first + last)/2;

		// Search for the value

		if(userArray[middle] == userValue)
		{
			return middle;
		}

		else if(userArray[middle].compareTo(userValue) < 0)
		{
			return binarySearch(userArray, middle + 1, last, userValue);
		}

		else
		{
			return binarySearch(userArray, first, middle - 1, userValue);
		}
	}

	// Created a void method called insertionSort to help sort an array, userArray, of T objects.
	public void insertionSort(T[] userArray)
	{
		// Created a T variable called unsortedValue to hold the first unsorted value.
		T unsortedValue;

		// Created an integer variable called scan to scan the userArray.
		int scan;

		/*
			The outer loop steps the index variable through each subscript in the userArray, starting at 1. The portion of
			the userArray containing element 0  by itself is already sorted.
		*/

		for(int index = 1; index < userArray.length; index++)
		{
			// The first element outside the sorted portion is userArray[index]. Store the value of this element in unsortedValue.
			unsortedValue = userArray[index];

			// Start scan at the subscript of the first element outside the unsorted part.
			scan = index;

			// Move the first element in the still unsorted part into its proper position in the sorted part.
			while(scan > 0 && userArray[scan - 1].compareTo(unsortedValue) > 0)
			{
				userArray[scan] = userArray[scan - 1];
				scan--;
			}

			// Insert the unsorted value in its proper position within the sorted subset
			userArray[scan] = unsortedValue;
		}
	}
}