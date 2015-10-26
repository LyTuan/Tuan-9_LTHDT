package bai1DiChuyenCacHinh;

public class MoveableRectangle extends MovablePoint implements MoveableOject{

	private MovablePoint topLeft;
	private MovablePoint  bottomRight;
	private int y1;
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		topLeft.moveRight();
		bottomRight.moveRight();
	}
	public String toString(){
		return "Rectangle: "+ topLeft+" "+bottomRight;
	}
	public MoveableRectangle(int x1, int y1, int x2, int y2, int dx, int dy){
		super(x1,y1,dx,dy);
		this.topLeft = new MovablePoint(x1, y1, dx, dy);
		 this.bottomRight=new MovablePoint(x2, y2, dx, dy);
	}

}
