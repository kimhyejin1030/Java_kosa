package ex07_whileDowhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1, b = 1; // 반드시 변수 초기화
		
		do {
			do {
				System.out.print(b + "\t");
				b++;
			} while (b <= 3);
			
			System.out.println();
			a++;
			
		} while(a <= 2);
	}

}

/*
package ex07_whileDowhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1; // 반드시 변수 초기화
		
		do {
			System.out.println(a + "\t");
			a++;
		} while(a <= 3);
	}

}
*/

/*
package ex07_whileDowhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 0; // 반드시 변수 초기화
		
		
		while( a <= 3 ) {
			a++; // 증감식
			System.out.print(a + "\t");
		}
		
		
		while(a++ <= 3) {
			System.out.print(a + "\t");
		}
	}

}
*/


