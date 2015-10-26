package bai1DiChuyenCacHinh;

public class MovableCircle extends MovablePoint implements MoveableOject{
	private int radius;
	private MovablePoint  center;
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}
	public String toString(){
		return "Circle: "+radius+" "+center;
	}
	public MovableCircle(int x,int y, int dx, int dy,int radius){
		super(x,y,dx,dy);
//		this.center = this;
		center=new MovablePoint(x, y, dx, dy);
		this.radius=radius;
	}
}
