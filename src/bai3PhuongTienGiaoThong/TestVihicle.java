package bai3PhuongTienGiaoThong;

public class TestVihicle {
	public static void main(String args[]){
		Jeep jeep1 =new Jeep("jeepblue",50,500,4);
		
		HoverCraff hoverCraff = new HoverCraff("hoverCraff", 4, 10, 4, 6);
		
		Frigate frogate = new Frigate("frogate", 40, 120, 4);
		
		PoliceCar policeCar = new PoliceCar();
		Object array []= new Object[4];
		array[0]=jeep1;
		array[1]=hoverCraff;
		array[2]=frogate;
		array[3]=policeCar;
		for(Object o:array){
			if(o instanceof PoliceCar){
				((PoliceCar) o).soundSiren();
			}
		}
	}
}
