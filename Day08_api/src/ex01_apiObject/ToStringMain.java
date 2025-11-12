package ex01_apiObject;

class Rectangle{ // extends Object
	int x, y;
	
	
	
	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Rectangle() {
		super();
		x = y = 100;
	}
	
	



	public void disp() { // 출력함수 따로 만들었음
		System.out.println(x + "," + y);
	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
	}

}
