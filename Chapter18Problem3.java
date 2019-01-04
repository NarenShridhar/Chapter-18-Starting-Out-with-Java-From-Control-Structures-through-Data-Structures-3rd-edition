public class Chapter18Problem3
{
	public static void main (String[] args)
	{
		// Created various Point objects.
		Point<Integer> point1 = new Point<Integer>(7, 4);
		Point<Double> point2 = new Point<Double>(2.0, 5.0);
		Point<Long> point3 = new Point<Long>(1L, 9L);
		Point<Float> point4 = new Point<Float>(3.0f, 8.0f);
		Point<Number> point5 = new Point<Number>(11.1f, 11.1f);

		// Created various PointList objects using the Point objects that were just created. 
		PointList<Point<Integer>> pointList1 = new PointList<Point<Integer>>(point1);
		PointList<Point<Double>> pointList2 = new PointList<Point<Double>>(point2);
		PointList<Point<Long>> pointList3 = new PointList<Point<Long>>(point3);
		PointList<Point<Float>> pointList4 = new PointList<Point<Float>>(point4);
		PointList<Point<Number>> pointList5 = new PointList<Point<Number>>(point5);

		// Call to display method.
		System.out.println("The points in the array list are: ");

		pointList1.display();
		pointList2.display();
		pointList3.display();
		pointList4.display();
		pointList5.display();

		// Print extra line for spacing in terminal. 
		System.out.println();
	}
}