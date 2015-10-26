package bai2ThayDoiKichCoHinh;

public class Circle implements ResizableObject {
	private double radius =3.0;
	public final double PI = 3.14;
	public Circle(int radius){
		this.radius=radius;
	}
	public double getPerimeter(){
		return 2*PI*radius;
	}
	public double getArea(){
		return PI*radius*radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
}
