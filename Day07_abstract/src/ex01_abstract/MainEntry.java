package ex01_abstract;


abstract class Shape { // abstract class, Super class
	
	double result = 0;
	
	int width, length;
	
	public abstract double calc(); // abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape@@@@@@");
	}
	
} // Shape end


class Circle extends Shape { // Sub class
	
	double r = 10.0;

	@Override
	public double calc() {
		result = r * r * Math.PI; // 부모클래스에 result라는 변수가 있기때문에 사용 가능
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");
		
	}
	
} // Circle end


// Rect class (일반클래스) ---> Shape 상속
// 사각형 넓이 구하기

class Rect extends Shape {
	
	int width = 5;
	int length = 6;
	

	@Override
	public double calc() {
		result = width * length;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + " 입니다.");
		
	}
	
}


public class MainEntry {
	
	public static void main(String[] args) {
		
		Shape r = new Rect();
		r.draw();
		r.calc();
		
		// Circle c = new Circle(); // 자신으로 객체 생성
		 Shape c = new Circle(); // 부모로 객체 생성
		c.draw();
		c.calc();
		
		c.show();
		
// 	Shape sh = new Shape(); 추상클래스는 추상메소드를 가지고 있기 때문에 자체적으로 객체 생성 X
	}

}
