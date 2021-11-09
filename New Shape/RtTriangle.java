import java.util.Scanner;

public class RtTriangle extends Shape{


	private double base = 0;
	private double height = 0;
	
	public RtTriangle() {
		super("RtTrianlge");
	}

	public RtTriangle(double base, double height) {
		super("RtTriangle");
		this.base = base;
		this.height= height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double computeArea() {
		return height*base/2;
	}
	
	@Override
	public double computePerimeter() {
		double otherSide = Math.sqrt(height*height+base*base);
		return height+base+otherSide;
	}
	
	@Override
	public void readShapeData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the base of the RtTriangle");
		base = in.nextDouble();
		System.out.println("Enrer the height of the RtTriangle");
		height = in .nextDouble();	
	}
	
	@Override
	public String toString() {
		return super.toString() + ": base is " + base + ", height is " + height;
	}
}
