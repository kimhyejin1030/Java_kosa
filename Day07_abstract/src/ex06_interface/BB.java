package ex06_interface;

public class BB implements IDraw {
	
	int x = 500;

	@Override
	public void draw() {
		System.out.println("BB클래스에서 인터페이스 IDraw call @@");

	}
	
	public void show() {
		
	}

}
