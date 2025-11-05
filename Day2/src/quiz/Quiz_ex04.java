package quiz;

import java.util.Scanner;

public class Quiz_ex04 {
	public static void main(String[] args) {
		/*
		 * 문제 ] 이름 입력 받고, 국어/영어/전산 점수 입력받아서
		 * 총점 평균까지 구하는 프로그램 작성
		 */
		// 평균 60점, 과락 40점 불합격 아니면 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1과목 점수를 입력해주세요 : ");
		int sub1 = sc.nextInt();
		System.out.println("2과목 점수를 입력해주세요 : ");
		int sub2 = sc.nextInt();
		System.out.println("3과목 점수를 입력해주세요 : ");
		int sub3 = sc.nextInt();
		System.out.println("4과목 점수를 입력해주세요 : ");
		int sub4 = sc.nextInt();
		System.out.println("5과목 점수를 입력해주세요 : ");
		int sub5 = sc.nextInt();
		
		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		
		if(sub1 == 40 || sub2 == 40 || sub3 == 40 || sub4 == 40 || sub4 == 40) {
			System.out.println("불합격 입니다.");
		} else if (sum / 5 >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

}
 
