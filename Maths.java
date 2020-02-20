import java.util.Scanner;
import java.lang.Math;
abstract class GeometricObject{
	String color;
	boolean filled;
	GeometricObject(String c, boolean f){
		color = c;
		filled = f;
		System.out.println("The color is: " + color + "and to be filled or not: " + filled);
	}
}
class Triangle extends GeometricObject{
	float side1, side2, side3;
	Triangle(float x, float y, float z, String c, boolean f){
		super(c, f);
		side1 = x;
		side2 = y;
		side3 = z;
	}
	public void getArea(){
		float s = (side1+side2+side3)/2;
		System.out.println(s);
		System.out.println("The area of triangle= " + (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))));
	}
	public void getPerimeter(){
		System.out.println("The perimeter of triangle= " + (side1+side2+side3));
	}
}
class Rectangle extends GeometricObject{
	float length, breadth;
	Rectangle(float x, float y, String c, boolean f){
		super(c,f);
		length = x;
		breadth = y;
	}
	public void getArea(){
		System.out.println("The area of rectangle= " + length*breadth);
	}
	public void getPerimeter(){
		System.out.println("The perimeter of rectangle= " + (length+breadth)*2);
	}
}
class Maths{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = 1;
		while(d == 1){
			int c;
			System.out.println("For Triangle ==> 1 ....  Rectangle ==> 2  ");
			System.out.println();
			c = sc.nextInt();
			if(c == 1){
				System.out.println("Enter the sides of the triangle, the color and whether to fill the color:  ");
				Triangle t = new Triangle(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.next(), sc.nextBoolean());
				t.getArea();
				t.getPerimeter();
			}
			else if(c == 2){
				System.out.println("Enter the two sides of the rectangle, the color and whether to fill the color: ");
				Rectangle r = new Rectangle(sc.nextFloat(), sc.nextFloat(), sc.next(), sc.nextBoolean());
				r.getArea();
				r.getPerimeter();
			}
			System.out.println("Enter 1 to continue else enter 0");
			d = sc.nextInt();
		}
	}
}
