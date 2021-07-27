package constructor;

public class testConductor {

	public static void main(String[] args) {
		constructorDemo con = new constructorDemo();
		con.color = "Pink";
		System.out.println("Current Color : " + con.color);
		int cSpeed = con.speedUp();
		System.out.println(cSpeed);
		cSpeed = con.speedUp();
		System.out.println(cSpeed);
		
	}

}
