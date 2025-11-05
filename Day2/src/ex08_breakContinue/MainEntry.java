package ex08_breakContinue;

public class MainEntry {
	public static void main(String[] args) {

		boolean flag = true;
		
		first: {
			second: {
				third: {
					
					int k = 100;
					System.out.println("Before the break"); // 1
					
					if(flag) break second; // 식별자; 식별자 위치까지 탈출
					
					System.out.println("This won't execute"); // 2
				} // end third
				
				System.out.println("Java"); // 3
			}// end second
			
			System.out.println("This is after second break"); // 4
		} // end first
		
		System.out.println("123456789"); // 5
		

	}

}

/*
package ex08_breakContinue;

public class MainEntry {
	public static void main(String[] args) {
		for(int i = 1; i < 101; i++) {
			
			if(i % 2 != 0) continue; // 시작점으로 돌린다. for --> 증감식으로, while/do~while --> 조건식으로 이동한다.
			System.out.print(i + "\t");
		}
		

	}

}
*/



/*
package ex08_breakContinue;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("---continue---");
		for(int i = 1; i < 10; i++) {
			
			if(i == 7) continue; // 시작점으로 돌린다. for --> 증감식으로, while/do~while --> 조건식으로 이동한다.
			System.out.println("hello"+i);
		}
		
		
		System.out.println("---break---");
		for(int i = 1; i < 10; i++) {
			
			if(i == 7) break; // 구문탈출
			System.out.println("hello"+i);
		}
		
	}

}
*/