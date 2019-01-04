public class HighestAndLowestElements<T extends Comparable>
{
	// Created an array of type T. 
	T[] array;

	// Constructor that accepts an array of T type objects. 
	public HighestAndLowestElements(T[] userArray)
	{
		array = userArray;
	}

	// The getHighest method finds the highest element in the array. 
	public T getHighest()
	{
		// Start by creating a variable highest of type T, and initializing it as the value of element 0 of the array. 
		T highest = array[0];

		// For loop incremenets the index. 
		for(int i = 0; i < array.length; i++)
		{
			// If the array value at each index is great than the highest...
			if(array[i].compareTo(highest) > 0)
			{
				// Set highest to that value.
				highest = array[i];
			}
		}

		// Return the highest value. 
		return highest;
	}

	// The getLowest method finds the lowest element in the array. 
	public T getLowest()
	{
		// Start by creating a variable lowest of type T, and initializing it as the value of element 0 of the array. 
		T lowest = array[0];

		// For loop incremenets the index. 
		for(int i = 0; i < array.length; i++)
		{
			// If the array value at each index is less than the highest...
			if(array[i].compareTo(lowest) < 0)
			{
				// Set highest to that value.
				lowest = array[i];
			}
		}

		// Return the highest value. 
		return lowest;
	}

	// toString method.
	public String toString()
	{
		String output;

		output = "The highest value in the array is: " + getHighest() + "\nThe lowest value in the array is: " + getLowest();

		return output;
	}
}