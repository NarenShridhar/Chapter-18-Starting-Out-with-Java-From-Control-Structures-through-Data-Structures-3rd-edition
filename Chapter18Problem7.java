public class Chapter18Problem7
{
	public static void main (String[] args)
	{
		// Created a Number array with values to uses with the hale1 object. 
		Number[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		// Created a NumberAnalyzer object and assigned the integerArray to it. 
		NumberAnalyzer<Number> na1 = new NumberAnalyzer<Number>(numberArray);

		// Call the toString method.
		System.out.println(na1);
	}
}