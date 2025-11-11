package ex06_interface;

public class Plain implements Trans{

	@Override
	public void start() {
		System.out.println("비행기 운행");
		
	}

	@Override
	public void stop() {
		System.out.println("비행기 정지");
		
	}

}
