package ex02_abstract;

public class Rect extends Shape {

	int width = 5;
	int length = 6;
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	

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
