package quiz;

import java.util.Scanner;

public class Quiz_ex02 {
	public static void main(String[] args) {
		// Scanner, if
		// 정수 입력 받아서 홀짝 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 :");
		int i = sc.nextInt();
		
		if(i % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (i % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
	

}
