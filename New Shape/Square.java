import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends JComponent{
	private double length;
	public Square(double l){
		length=l;
	}

	public void  start()
	{
		double area= area();
		System.out.println("the area is "+ area);
		double cir=cir();
		System.out.println("the cir is" + cir);
	} 
	public double area(){
		double area= length* length;
		return area;
	}
	public double cir(){
		double cir= 4*length;
		return cir;
	}
	public void draw(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

	}
}
