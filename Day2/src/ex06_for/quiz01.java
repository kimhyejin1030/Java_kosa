package ex06_for;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		// 문제 1 ) 원하는 단 입력 받아서 구구단 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i ++) {
			System.out.println(dan +" * " + i + " = " + i*dan);
		}
	}

}
