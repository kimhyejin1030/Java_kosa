package ex06_interface;

public class Subway implements Trans {

	@Override
	public void start() {
		System.out.println("지하철 운행");
		
	}

	@Override
	public void stop() {
		System.out.println("지하철 정지");
		
	}

}
