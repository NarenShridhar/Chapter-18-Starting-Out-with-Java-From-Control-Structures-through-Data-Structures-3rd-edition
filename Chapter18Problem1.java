public class Chapter18Problem1
{
	public static void main (String[] args)
	{
		// Created an ArrayList object called arrayList1.
		MyList<Number> arrayList1 = new MyList<Number>();

		// Called the add method created in the MyList class to add values to arrayList1.
		arrayList1.add(1.1);
		arrayList1.add(2.2);
		arrayList1.add(3.3);
		arrayList1.add(4);
		arrayList1.add(5.5);
		arrayList1.add(6.6);
		arrayList1.add(7);
		arrayList1.add(8.8);
		arrayList1.add(9.9);
		arrayList1.add(10);

		// Called the display method in the MyList class to display the elements of arrayList1 with their respective values. 
		arrayList1.display();

		// Called the largest method in the MyList class to find the largest value. 
		//arrayList1.largest();

		// Called the smallest method in the MyList class to find the smallest value. 
		//arrayList1.smallest();

		// Displayed the results
		System.out.println("The largest value in the array list was: " +  arrayList1.largest() 
			+ " and the smallest value was: " + arrayList1.smallest());
	}
}