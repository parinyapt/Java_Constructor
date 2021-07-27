package constructor;
import java.util.Scanner;
public class studentLoop {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	student std = new student();
	System.out.print("Enter student number =");
	int numStudent = input.nextInt();
	
for (int x = 0; x<=numStudent;x++){
	System.out.println("Enter name =");
	String nam = input.nextLine();
	std.setName(nam);
	
	std.setScore(x, 80);
	
	System.out.println();
	System.out.println(std.toString());
	System.out.println(std.getname()+ "High Score" + std.getHighScore());	
	
}
	}

}
