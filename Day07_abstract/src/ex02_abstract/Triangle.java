package ex02_abstract;

public class Triangle extends Shape {
	
	int width = 5;
	int height = 6;

	@Override
	public double calc() {
		result = width * height / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "입니다.");

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
