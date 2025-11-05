package ex06_for;

public class quiz04 {
	public static void main(String[] args) {
		
		// 1번
/*		
  		for(int i=1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
*/
		
		// 2번
		/*
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		// 3번
		for(int i=1; i < 5; i++) {
			for(int j = 5; j >0 ; j--) {
				if(i<j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}

}
