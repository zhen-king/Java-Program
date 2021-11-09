import java.util.Scanner;

public class Rectangle extends Shape{
	
	private double width = 0;
	private double height = 0;
	
	public Rectangle() {
		super("Rectanlge");
	}

	public Rectangle(double width, double height) {
		super("Rectangle");
		this.width = width;
		this.height= height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double computeArea() {
		return height*width;
	}
	
	@Override
	public double computePerimeter() {
		return 2 * (height + width);
	}
	
	@Override
	public void readShapeData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the width of the Rectangle");
		width = in.nextDouble();
		System.out.println("Enrer the heoght of the Rectangle");
		height = in .nextDouble();	
	}
	
	@Override
	public String toString() {
		return super.toString() + ": width is " + width + ", height is " + height;
	}
}
