package ex06_thread;

public class UserThread extends Thread {
	
	String name;
	
	public UserThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
//		System.out.println("UserThread run() call" + name);
		for(int i = 1; i < 11; i++) {
			
			if(i==3) {
				try {
					sleep(1000); // 1 / 1000 --> 1초, 예외발생 interrupted
				} catch (InterruptedException e) {

					e.printStackTrace();
				} 
				
				System.out.println(name);
			}
			System.out.println(i);
			
		} // for end
	}
	
	
	
}
