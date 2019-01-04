// Needed for the ArrayList class
import java.util.ArrayList;

// Created a generic class MyList with a type parameter T. T is constrained to an upper bound of the Comparable class.
public class MyListModified<T extends Comparable>
{
	/*
		Created an ArrayList field of type T. It is important to note that when I declare on the right side of the equals
		that the ArrayList is of type T, there is no error in the compilation. However, when I do not delcare the type, 
		and I let the compiler infer the type (which it should), while it does compile, it gives the following warning
		message...

		"Note: /Users/NarenShridhar/Documents/JavaPrograms/ChapterEighteenProgrammingChallenges/MyList.java uses unchecked or unsafe operations.
		Note: Recompile with -Xlint:unchecked for details."

		I will test the end output with both versions and see if there is any difference: (awaiting testing)
	*/

	private ArrayList<T> arrayList = new ArrayList<T>();

	// Created a void method called add, which adds a parameter of type T to the arrayList.
	public void add(T comparableGiven)
	{
		arrayList.add(comparableGiven);
	}

	// Created a method of type T called largest which will return the largest value in the arrayList.
	public T largest()
	{
		// Called the useful get method in the ArrayList class, and set the index value at 0 equal to the new variable of type T, largest.
		T largest = arrayList.get(0);

		/*
			Remember, for regular arrays, the method used would be arrayName.length, whereas for ArrayLists, the way to get
			the current size would be arrayName.size(). 
		*/
		for(int i = 0; i < arrayList.size(); i++)
		{
			// If the toString() value of the arrayList at index (i) when compared to the toString value of largest is greater than 0...
			if(((Comparable<T>)arrayList.get(i)).compareTo(largest) > 0)
			{
				// Set largest equal to the new arrayList value.
				largest = arrayList.get(i);
			}
		}

		// Return the largest value. 
		return largest;
	}

	// Created a method of type T called smallest which will return the smallest value in the arrayList.
	public T smallest()
	{
		// Called the useful get method in the ArrayList class, and set the index value at 0 equal to the new variable of type T, smallest.
		T smallest = arrayList.get(0);

		/*
			Remember, for regular arrays, the method used would be arrayName.length, whereas for ArrayLists, the way to get
			the current size would be arrayName.size(). 
		*/
		for(int i = 0; i < arrayList.size(); i++)
		{
			// If the toString() value of the arrayList at index (i) when compared to the toString value of smallest is less than 0...
			if(arrayList.get(i).toString().compareTo(smallest.toString()) < 0)
			{
				// Set smallest equal to the new arrayList value.
				smallest = arrayList.get(i);
			}
		}

		// Return the smallest value.
		return smallest;
	}

	// Created a void method called display which displays the elements within the arrayList.
	public void display()
	{
		System.out.println(arrayList);
	}
}