package ex04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) 
			throws ArithmeticException, InputMismatchException, Exception { // 제일 큰 예외는 제일 뒤로 적기
		System.out.println("x, y = ");
		int x, y, result;
	
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y; // 예외발생 소지 있음
		
		System.out.println(result);
		
		System.out.println("0으로 나눌 수 없습니다");
			
	}

} // catch문이 여러 개일 때

/*
package ex04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 예외발생 소지 있음
			
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			
		} catch(Exception e) {
			// System.out.println("0으로 나눌 수 없습니다."); // user message
			// System.out.println(e.getMessage()); // 출력 겨로가 : / by zero
			// e.printStackTrace();
			System.out.println("Exception");
			
		}
	}

} // catch문이 여러 개일 때
*/



/* finally를 입력했을 때
package ex04_exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 예외발생 소지 있음
			
			System.out.println(result);
		} catch (Exception e) {
			// System.out.println("0으로 나눌 수 없습니다."); // user message
			// System.out.println(e.getMessage()); // 출력 겨로가 : / by zero
			e.printStackTrace();
		} finally {
			System.out.println("finally 무조건 처리됨!");
		}
	}

}
*/

/* try-catch문으로 예외처리할 때(e.getMessage()와 e.printStackTrace() 차이)
package ex04_exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 예외발생 소지 있음
			
			System.out.println(result);
		} catch (Exception e) {
			//System.out.println("0으로 나눌 수 없습니다."); // user message
			//System.out.println(e.getMessage()); // 출력 결과 : / by zero
			e.printStackTrace();
		}
	}

}
*/



/* if문으로 예외 처리 했을 때
package ex04_exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0); // 강제 탈출
		}
		
		result = x / y; // 예외발생 소지 있음
		
		System.out.println(result);
		
	}

}
*/


/*
package ex04_exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		int x, y, result;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y; // 예외발생 소지 있음
		
		System.out.println(result);
	}

}
*/