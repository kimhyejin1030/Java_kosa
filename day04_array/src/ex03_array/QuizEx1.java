package ex03_array;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		// 임의의 데이터 5개 입력 받아서 출력하는 프로그램 작성
		int[] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		int x = sc.nextInt();
		
		System.out.println("array a = ");
		for(int i=0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
