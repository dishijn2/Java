import mypack.Coordinate;
import java.util.*;
class MathsDemo {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Coordinates of point 1: ");
		Coordinate c1 = new Coordinate(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter the Coordinates of point 2: ");
		Coordinate c2 = new Coordinate(sc.nextDouble(),sc.nextDouble());
		c1.distance(c1,c2);
		c1.print(c1,c2);
	}
}