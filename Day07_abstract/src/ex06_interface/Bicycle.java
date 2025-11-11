package ex06_interface;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("자전거 운행");
		
	}

	@Override
	public void stop() {
		System.out.println("자전거 정지");
		
	}

}
