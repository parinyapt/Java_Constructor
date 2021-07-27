package constructor;

public class runStudent {

	public static void main(String[] args) {
		student s1,s2,s3;
		s1 = new student();
		s2 = new student();
		s3 = new student();
		
		s2.setName("Prin");
		s2.setScore(1, 80);
		s2.setScore(2, 50);
		s2.setScore(3, 90);
		
		s3.setName("Parinya");		
		s3.setScore(1, 45);
		s3.setScore(2, 55);
		s3.setScore(3, 65);
		
		System.out.println();
		System.out.println(s1.toString());
		System.out.println(s1.getname()+" High Score "+s1.getHighScore());
		
		System.out.println();
		System.out.println(s2.toString());
		System.out.println(s2.getname()+" High Score "+s2.getHighScore());
		
		System.out.println();
		System.out.println(s3.toString());
		System.out.println(s3.getname()+" High Score "+s3.getHighScore());


}
}
