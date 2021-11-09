import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends JComponent{
	private double side1,side2,side3,base,height;
	public Triangle(double s1, double s2, double s3, double ba, double he){
		side1 = s1;
		side2 = s2;
		side3 = s3;
		base = ba;
		height = he;
	}

	public void  start()
	{
		double area= area();
		System.out.println("the area is "+ area);
		double cir=cir();
		System.out.println("the cir is" + cir);
	} 
	public double area(){
		double area= 1/2*height * base;
		return area;
	}
	public double cir(){
		double cir= side1 + side2 + side3;
		return cir;
	}
	public void draw(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
	}
	
}