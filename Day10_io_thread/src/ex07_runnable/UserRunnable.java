package ex07_runnable;

public class UserRunnable implements Runnable {
	
	String name;

	public UserRunnable(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for(int i = 1; i < 11; i++) {
			
			if(i==3) {
				try {
					Thread.sleep(1000); // 1 / 1000 --> 1초, 예외발생 interrupted
				} catch (InterruptedException e) {

					e.printStackTrace();
				} 
				
				System.out.println(name);
			}
			System.out.println(i);
			
		} // for end
	}
	

}
