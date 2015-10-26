package bai3PhuongTienGiaoThong;

public class Jeep implements IsLandVihicle{
	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int numWheels;
	
	public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
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
		this.maxSpeed =maxSpeed;
	}

	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return numWheels;
	}

	@Override
	public void setNumWheels(int numWheels) {
		// TODO Auto-generated method stub
		this.numWheels= numWheels;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I'm driving");
	}
	public void SoundHorn(){
		System.out.println("Horn!Horn!Horn");
	}

}
