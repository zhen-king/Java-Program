import java.util.Scanner;

public class ComputeAreaAndPerimeter {

	public static void main(String[] args) {
		Shape myShape;
		double perimeter;
		double area;
		myShape = getShape();
		myShape.readShapeData();
		perimeter = myShape.computePerimeter();
		area = myShape.computeArea();
		displayResult(myShape, area, perimeter);
		System.exit(0);
	}
	
	public static Shape getShape() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Right Triangle");
		
		String figType= in.next();
		if (figType.equalsIgnoreCase("C")) {
			return new Circle();
		}
		else if (figType.equalsIgnoreCase("R")) {
			return new Rectangle();
		}
		else if (figType.equalsIgnoreCase("T")) {
			return new RtTriangle();
		}
		else {
			return null;
		}
	}
	
	private static void displayResult(Shape myShape, double area, double perimeter) {
		System.out.println(myShape);
		System.out.printf("The area is %.2f%nThe perimeter is %.2f%n" , area, perimeter);
	}

}
