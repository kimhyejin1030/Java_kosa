package ex03_abstract;

import java.util.Iterator;

public class MainEntry {
	
	public static void main(String[] args) {
		
		// 3.
		Shape[] s = new Shape[3]; // 배열 선언 및 생성
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		String[] names = {"Circle","Rectangle","Triangle"};
		
		for (int i = 0; i < names.length; i++) {
			s[i].show(names[i]);
		}
		
		// Shape ss = new Shape(); //  자체적으로 객체 생성할 수 없다.
		
		System.out.println("**********************************");
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원");
		
		sh = new Rectangle();
		sh.show("Rectangle");
		
		sh = new Triangle();
		sh.show("삼각형");
		
		
		System.out.println("**********************************");
		// 1. 각자의 클래스로 객체 생성한 형태
		Circle c = new Circle();
		c.show("Circle");
		
		new Rectangle().show("사각형");
		
		new Triangle().show("Triangle");
	}

}
