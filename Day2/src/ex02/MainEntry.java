package ex02;
// 자동임포트
// import java.lang.*;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// System.in : 표준입력
		Scanner sc = new Scanner(System.in);
		System.out.println("String data input: ");
		
		String str = sc.nextLine();
		System.out.println(str);
		
		int i = sc.nextInt();
		System.out.println(i);
	}

}
