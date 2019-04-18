package interfacedemo02;

public class Bike implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		gear=a;
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		speed=speed+a;
	}

	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		speed=speed-a;
	}
	public void printStates(){
		System.out.println("speed "+speed+" gear : "+gear);
	}
}
