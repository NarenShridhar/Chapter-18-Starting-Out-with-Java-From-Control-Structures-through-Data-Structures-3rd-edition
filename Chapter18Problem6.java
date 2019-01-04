public class Chapter18Problem6
{
	public static void main (String[] args)
	{
		// Created an Integer array with values to uses with the hale1 object. 
		Integer[] integerArray = {1, 2, 3, 10, 4, 5, 6, 7, 8, 9, 100};

		// Created a HALE object and assigned the integerArray to it. 
		HighestAndLowestElements<Integer> hale1 = new HighestAndLowestElements<Integer>(integerArray);

		// Call the toString method.
		System.out.println(hale1);
	}
}