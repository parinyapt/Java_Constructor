package constructor;

public class constructorDemo {
	public String color;
	private int speed;
	
	public int speedUp(){
		speed += 5;
		return speed;
	}
	public int speedDown(){
	speed -= 5;
	return speed;
	}
	
	constructorDemo()
	{
		color = "black";
		speed = 0;
		System.out.println("Start Color = " + color);
		System.out.println("Start Speed = " + speed);
	}
	
}
