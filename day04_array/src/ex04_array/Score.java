package ex04_array;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		
		/*
		 * 문제) 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 총점,평균,학점까지 구하는 프로그램 작성
		 * 출력 예시 ) 
		 * 이도연님의 성적표
		 * 국어 : 100, 영어 : 100, 전산 : 100, 총점 300, 평균 : 100.0
		 * 1차원, 2차원 배열 이용한 성적처리 프로그램 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		//1. 변수선언
		int kor, eng , com,  tot;
		String name = null;
		double avg = 0;
		char grade = ' ';
		
		//2. 메세지 출력 및 입력받기
		System.out.print("name ? ");
		name = sc.nextLine();   // next()  vs nextLine()
		
//		do {
//			System.out.println("kor, eng, com = ? ");
//			kor = sc.nextInt();		eng = sc.nextInt();		com = sc.nextInt();
//		} while( ( kor < 0 || kor > 101 ) || ( eng < 0 || eng > 101 ) || ( com < 0 || com > 101 ) );  // 한꺼번에 처리
		
		do {
			System.out.println("당신의 Kor 점수 입력 요망: ");
			kor = sc.nextInt();
		} while( kor < 0 || kor > 101 );  // 각 과목별 처리 
		
		do {
			System.out.println("당신의 Eng 점수 입력 요망: ");
			eng = sc.nextInt();
		} while( eng < 0 || eng > 101 );
		
		do {
			System.out.println("당신의 Com 점수 입력 요망: ");
			com = sc.nextInt();
		} while( com < 0 || com > 101 );
	
		
		
	}

}
