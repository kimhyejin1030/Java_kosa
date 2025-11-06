package ex01_randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.random()); // 0.0 ~ 1.0
		System.out.println((int)Math.random());
		
		// Math.random() * n -> 0 ~ n-1 값 추출됨
		System.out.println(Math.random()*5); // 0 ~ 4
		System.out.println();
		System.out.println((Math.random() * 5) + 2); // 2 ~ 6

		System.out.println((int)(Math.random() * 100) + 1); // 2 ~ 6
	}

}
