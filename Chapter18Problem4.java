public class Chapter18Problem4
{
	public static void main (String[] args)
	{
		// Created 2 objects of the GenericInsertionSorter class for Integer objects and String objects.
		GenericInsertionSorter<Integer> gis1 = new GenericInsertionSorter<Integer>();

		GenericInsertionSorter<String> gis2 = new GenericInsertionSorter<String>();

		// Created an Integer array
		Integer[] integerArray = {3, 5, 1, 4, 2};

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

		// Sort the integer array using the Insertion sort method in the GenericInsertionSorter class
		gis1.insertionSort(integerArray);

		// Sort the String array using the Insertion sort method in the GenericInsertionSorter class
		gis2.insertionSort(stringArray);

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
	}
}