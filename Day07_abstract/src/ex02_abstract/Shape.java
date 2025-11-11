package ex02_abstract;

public abstract class Shape {
	
	protected double result = 0;
	
	public abstract double calc(); // abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape@@@@@@");
	}
	
}
