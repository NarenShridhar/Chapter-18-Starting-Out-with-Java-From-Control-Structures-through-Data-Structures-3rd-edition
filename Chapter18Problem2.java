public class Chapter18Problem2
{
	public static void main (String[] args)
	{
		// Created an ArrayList object called arrayList1 of type Integer
		MyListModified<Integer> arrayList1 = new MyListModified<Integer>();

		// Created an ArrayList object called arrayList2 of type String
		MyListModified<String> arrayList2 = new MyListModified<String>();

		// Called the add method created in the MyListModified class to add values to arrayList1.
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(5);
		arrayList1.add(6);
		arrayList1.add(7);
		arrayList1.add(8);
		arrayList1.add(9);
		arrayList1.add(10);

		// Called the add method created in the MyListModified class to add values to arrayList2.
		arrayList2.add("Mike");
		arrayList2.add("Jake");
		arrayList2.add("Trevor");
		arrayList2.add("Yugi");
		arrayList2.add("Kaiba");

		// Print the numbers in the first array.
		System.out.println("The numbers in the first array list are: ");

		// Call the display method in the MyListModified class.
		arrayList1.display();

		// Print the Strings in the second array.
		System.out.println("The Strings in the second array list are: ");

		// Call the display method in the MyListModified class.
		arrayList2.display();

		// Print the largest number.
		System.out.println("The largest number in the array list is: " + arrayList1.largest());

		// Print the smallest number.
		System.out.println("The smallest number in the array list is: " + arrayList1.smallest());

		// Print the largest String.
		System.out.println("The largest String in the array list is: " + arrayList2.largest());

		// Print the smallest String.
		System.out.println("The smallest String in the array list is: " + arrayList2.smallest());
	}
}