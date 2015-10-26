package bai2ThayDoiKichCoHinh;

public class ResizableCircle extends Circle implements Resizable{
	public  ResizableCircle(int radius) {
		// TODO Auto-generated constructor stub
		super(radius);
	}
	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		this.setRadius(this.getRadius()+this.getRadius()*percent/100);
	}
	
}
