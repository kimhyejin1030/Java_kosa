package ex02_abstract;

public class Circle extends Shape {
	
	double r = 5.0;

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

}
