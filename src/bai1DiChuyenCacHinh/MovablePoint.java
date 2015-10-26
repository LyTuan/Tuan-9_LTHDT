package bai1DiChuyenCacHinh;

public class MovablePoint implements MoveableOject {
	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.y+=dx;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.y+=dy;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.x-=x;
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.x+=x;
	}
	public String toString(){
		return "Point: "+x+" "+y+" "+dx+" "+dy;
	}
	public MovablePoint(int x, int y, int dx, int dy){
		this.x=x;
		this.y=y;
		this.dx=dx;
		this.dy= dy;
	}

}
