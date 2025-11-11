package ex03_abstract;

public class Triangle extends Shape {
	
	int y = 100;

	@Override
	public double calc(double x) {
		result = (x * y) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result + " 크기의 " + name + " 이 그려졌습니다.");

	}

}
