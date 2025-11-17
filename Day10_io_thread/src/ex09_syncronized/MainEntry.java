package ex09_syncronized;



public class MainEntry {
	public static void main(String[] args) {
		
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "소금빵");
		UserAtm user2 = new UserAtm(at, "크루아상");
		UserAtm user3 = new UserAtm(at, "모찌빵");
		
		user1.start();
		user2.start();
		user3.start();
		
	}

}


/*
package ex09_syncronized;

public class MainEntry {
	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		long id = Thread.currentThread().getId();
		System.out.println(id);
		
		// priority : 1, 5, 10
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 10
		
		Thread.State state = Thread.currentThread().getState();
		System.out.println(state);
		
		int priority = Thread.currentThread().getPriority();
		System.out.println(priority);
	}

}
*/
