package bai3PhuongTienGiaoThong;

public class HoverCraff implements IsLandVihicle,IsSeaVessel{
	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int numWheels;
	private int disPlacements;
	
	
	public HoverCraff(String name, int maxPassengers, int maxSpeed, int numWheels, int disPlacements) {
	
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
		this.disPlacements = disPlacements;
	}

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
		this.maxPassengers= maxPassengers;
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return maxPassengers;
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
		System.out.println("Luanch!Luanch!");
	}

	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNumWheels(int numWheels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
