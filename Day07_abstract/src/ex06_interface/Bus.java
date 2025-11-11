package ex06_interface;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("버스 운행");
		
	}

	@Override
	public void stop() {
		System.out.println("버스 정지");
		
	}

}
