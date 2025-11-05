package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("전산 점수를 입력해주세요 : ");
		int com = sc.nextInt();
		
		int sum = kor + eng + com;
		double ave = sum / 3;
		
		System.out.println();
		System.out.println(name + " 님의 성적표 *******");
		System.out.println("국어 : " + kor + ", 영어" + eng + ", 전산" + com);
		System.out.println("총점 : " + sum + ", 평균 : " + ave);
		
		if(ave>=90) {
			System.out.println("A학점입니다.");
		} else if (ave>= 80) {
			System.out.println("B학점입니다.");
		} else if (ave >= 70) {
			System.out.println("C학점입니다.");
		} else if (ave >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		
		
		
	}

}
