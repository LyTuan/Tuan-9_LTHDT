package bai1DiChuyenCacHinh;

public class TestMovable {
	public static void main(String args[]){
		MovablePoint movablePoint1= new MovablePoint(1, 1,1, 1);
		movablePoint1.moveUp();
		System.out.println(movablePoint1);
		
		MoveableRectangle moveableRectange = new MoveableRectangle(1, 1, 3, 3, 2, 4);
		moveableRectange.moveLeft();
		System.out.println(moveableRectange);
		MovableCircle movableCircle1 = new MovableCircle(1, 1, 2, 2, 1);
		movableCircle1.moveDown();
		System.out.println(movableCircle1);
	}
}
