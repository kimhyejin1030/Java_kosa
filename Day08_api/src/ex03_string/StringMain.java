package ex03_string;

public class StringMain {
	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = " + x + ", y = " + y);
		x = y;
		System.out.println("x = " + x + ", y = " + y);
		x = 9;
		x = 888;
		
		String s1 = "korea";
		String s2 = "happy";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode = " + s1.hashCode() + "\t hashcode s2 = " + s2.hashCode());

		line();
		
		s1 = s2;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode = " + s1.hashCode() + "\t hashcode s2 = " + s2.hashCode());

		line();
		
		s2 = "seoul";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode = " + s1.hashCode() + "\t hashcode s2 = " + s2.hashCode());
		
		
		line();
		
		s1 = s2;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode = " + s1.hashCode() + "\t hashcode s2 = " + s2.hashCode());

		
	}

	public static void line() {
		System.out.println("===================================================");
	}
}
