public class NumberAnalyzer<T extends Number>
{
	// Created an array of type T. 
	T[] array;

	// Created a double variable total to hold the total of the elements. 
	double total;

	// Constructor that accepts an array of T type objects. 
	public NumberAnalyzer(T[] userArray)
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
			if(array[i].doubleValue() > highest.doubleValue())
			//if((array[i].toString()).compareTo(highest.toString()) > 0)
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
			if(array[i].doubleValue() < lowest.doubleValue())
			{
				// Set highest to that value.
				lowest = array[i];
			}
		}

		// Return the highest value. 
		return lowest;
	}

	// The getTotal method gets the total of all the elements in the array. 
	public double getTotal()
	{
		// Initialized the total to start at 0.0.
		total = 0.0;

		// For loop increments the index.
		for(int i = 0; i < array.length; i++)
		{
			// The total is equal to the sum of all the indexes. 
			total += array[i].doubleValue();
		}

		return total;
	}

	// The getAverage method gets the average of all the elements in the array. 
	public double getAverage()
	{
		return getTotal()/array.length;
	}

	// toString method.
	public String toString()
	{
		String output;

		output = "The highest value in the array is: " + getHighest() + "\nThe lowest value in the array is: " + getLowest() 
		+ "\nThe total of the elements is: " + getTotal() + "\nThe average of the elements is: " + getAverage();

		return output;
	}
}