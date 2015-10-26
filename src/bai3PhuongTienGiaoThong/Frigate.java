package bai3PhuongTienGiaoThong;

public class Frigate implements IsSeaVessel{
	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int disPlacements;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return maxPassengers;
	}

	@Override
	public void setMaxPassengers(int maxPassengers) {
		// TODO Auto-generated method stub
		this.maxPassengers=maxPassengers;
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		// TODO Auto-generated method stub
		this.maxSpeed=maxSpeed;
	}

	@Override
	public int getDisplacement() {
		// TODO Auto-generated method stub
		return disPlacements;
	}

	@Override
	public void setDisplacement(int displacement) {
		// TODO Auto-generated method stub
		this.disPlacements=displacement;
	}

	@Override
	public void luanch() {
		// TODO Auto-generated method stub
		System.out.println("luanch!luanch!");
	}

	public Frigate(String name, int maxPassengers, int maxSpeed, int disPlacements) {
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.disPlacements = disPlacements;
	}

}
