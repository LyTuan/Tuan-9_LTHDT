package bai2ThayDoiKichCoHinh;

public class TestResizable {
	public static void main(String args[]){
		ResizableCircle resizableCircle1 = new ResizableCircle(50);
		resizableCircle1.resize(25);
		System.out.println(resizableCircle1.getPerimeter());
		System.out.println(resizableCircle1.getArea());
	}
}
