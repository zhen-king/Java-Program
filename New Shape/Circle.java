import java.util.Scanner;

public class Circle extends Shape{

	private double radius = 0;

	public Circle() {
		super("Circle");
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double computeArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public double computePerimeter() {
		return 2 * Math.PI*radius;
	}
	
	@Override
	public void readShapeData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		radius = in.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString() + ": radius is " + radius;
	}
}