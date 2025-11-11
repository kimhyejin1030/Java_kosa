package ex02_abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		// 원의 넓이 구하기(Circle)
		Shape s = new Circle();
		s.draw();
		s.show();
		
		System.out.println("=================================");
		
		// 사각형의 넓이 구하기(Rect)
		s = new Rect();
		s.draw();
		
		Rect r = new Rect();
		r.setLength(30);
		r.setWidth(500);
		r.draw();
		
		System.out.println("=================================");
		
		// 삼각형의 넓이 구하기(Triangle)
		Triangle t = new Triangle();
		t.setHeight(40);
		t.setWidth(80);
		t.draw();
		
	}

}
