import java.util.ArrayList;

/*
	The PointList class extends the Point class, and uses a wildcard type parameter. It is important to remember
	that a parameter that is type wildcard can have ANY type argument used in its place. That versatility can make
	it much easier to design a class. 
*/

public class PointList<T extends Point<?>>
{
	// Created a field called xCoordinate of type Number to hold the x coordinate.
	private Number xCoordinate;

	// Created a field called yCoordinate of type Number to hold the y coordinate.
	private Number yCoordinate;

	// Created an ArrayList object to store the Point objects.
	ArrayList<T> arrayList = new ArrayList<T>();

	// Constructor to assign values, accepts a point object.
	public PointList(T pointGiven)
	{
		// Set the values of the x and y coordinates using the getX() and getY() methods in the Point class. 
		xCoordinate = pointGiven.getX();
		yCoordinate = pointGiven.getY();

		// Add the newly set values to the PointList Array Object using the addPoint method. 
		addPoint(xCoordinate, yCoordinate);
	}

	// Created the void addPoint method to add a point to the array list. 
	public void addPoint(Number xCoordinateGiven, Number yCoordinateGiven)
	{
		arrayList.add((T) new Point (xCoordinateGiven, yCoordinateGiven));
	}

	// Created the display method to display the points in the arrayList.
	public void display()
	{
		System.out.print(" (" + ((Point<?>) arrayList.get(0)).getX() + ", " + ((Point<?>) arrayList.get(0)).getY() + ") ");
	}
}