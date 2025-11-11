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
		double avg = sum / 3;
		
//		System.out.println();
//		System.out.println(name + " 님의 성적표 *******");
//		System.out.println("국어 : " + kor + ", 영어" + eng + ", 전산" + com);
//		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
		char grade = ' ';
		
//		if(avg=90) {
//			grade = 'A';
//		} else if (avg>= 80) {
//			grade = 'B';
//		} else if (avg >= 70) {
//			grade = 'C';
//		} else if (avg >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
		
		switch ((int)avg / 10) {
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F'; break;
		
		}
		
		if(avg>= 60) {
			if(kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("\n모든 과목이 40점 이상이며, 총점은 %d, 평균은 %.1f로 [합격]입니다.\n",sum,avg);
			} else {
				System.out.printf("평균이 %.1f이지만 ",avg);
				if(kor < 40) System.out.println("국어" + kor + "점");
				if(kor < 40) System.out.println("영어" + eng + "점");
				if(kor < 40) System.out.println("전산" + com + "점");
				System.out.println("으로 [과락]입니다.");
			}
		} else {
			System.out.printf("평균이 %.1f로 [평균 미달 탈락] 입니다.\n", avg);
		}
		
		System.out.println("\n******" + name+"님의 성적표******");
		System.out.println("국어 : " + kor + ", 영어 :" + eng + ", 전산 : " + com);
		System.out.println("총점 : " + sum + ", 평균 : " + avg + ", 학점 : " + grade);
	}

}
