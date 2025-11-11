package ex03_abstract;

public class Rectangle extends Shape {
	
	int x = 5;
	int y = 6;

	@Override
	public double calc(double x) {
		result = x * y;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result + " 크기의 " + name + " 이 그려졌습니다.");

	}

}
