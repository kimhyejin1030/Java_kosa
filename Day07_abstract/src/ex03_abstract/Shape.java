package ex03_abstract;

public abstract class Shape { // 슈퍼클래스, abstract class
	
	protected double result = 0;
	
	public abstract double calc(double x);
	public abstract void show(String name);
	
	public void view() {
		System.out.println("super class Shape!!");
	}

}
