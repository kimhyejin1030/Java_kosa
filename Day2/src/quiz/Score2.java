package quiz;

import java.util.Scanner;

public class Score2 {
	public static void main(String[] args) {
		
		/*
		 문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
		 	  총점, 평균, 학점(if, siwtch)까지 구하는 프로그램 작성
		 	  국어,영어,전산 점수는 0~100점 사이값만 입력 받게끔 처리 
		 	  
		 	  이도연님의 성적표**************
		 	  국어 : 100, 영어 : 100, 전산 : 100
		 	  총점 : 300, 평균 : 100.0
		*/

		// 1차원, 2차원 배열 이용한 성적처리 프로그램 작성(3명)
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[3];
		
		int[][] scores = new int[3][3];
		
		for(int i=0; i<3; i++) {
			
			System.out.print((i+1) + "번째 학생 이름 : ");
			names[i] = sc.next();
			
			System.out.print("국어 점수를 입력해주세요 : ");
			scores[i][0] = sc.nextInt();
			
			System.out.print("영어 점수를 입력해주세요 : ");
			scores[i][1] = sc.nextInt();
			
			System.out.print("전산 점수를 입력해주세요 : ");
			scores[i][2] = sc.nextInt();
			
		}// for end
		
		for(int i = 0; i < 3; i++) {
			
			int kor = scores[i][0];
			int eng = scores[i][1];
			int com = scores[i][2];
			
			int sum = kor + eng + com;
			double avg = sum / 3.0;
			
			char grade;
			
			switch ((int)avg / 10) {
				case	 10:
				case 9: grade = 'A'; break;
				case 8: grade = 'B'; break;
				case 7: grade = 'C'; break;
				case 6: grade = 'D'; break;
				default: grade = 'F'; break;
			} // switch end
			
			
			// 합격,과락 여부
			if(avg >= 60) {
				if(kor >= 40 && eng >= 40 && com >= 40) {
					System.out.printf("\n%s 님은 모든 과목이 40점 이상이며, 총점은 %d이며, 평균은 %.1f로 [합격] 입니다.", names[i], sum, avg);
				} else {
					System.out.printf("\n%s 님은 평균은 %.1f이지만, [과락 과목 존재로 불합격] 입니다.", names[i], avg);
					System.out.print("\n과락 과목: ");
					if (kor < 40) System.out.print("국어 ");
					if (eng < 40) System.out.print("영어 ");
					if (com < 40) System.out.print("전산 ");
					System.out.println();
				}
			} else {
				System.out.printf("\n%s 님은 평균이 %.1f로 이지만 [평균 미달 불합격]입니다. ", names[i], avg);
				if(kor < 40) System.out.println("국어" + kor + "점");
				if(eng < 40) System.out.println("영어" + eng + "점");
				if(com < 40) System.out.println("전산" + com + "점");
				
			}
			
			
			// 성적표
			System.out.println("\n*********** " + names[i] +"님의 성적표 ***********");
			System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
			System.out.printf("총점 : %d, 평균 : %.1f, 학점 : %c\n", sum, avg, grade);
		
		} // for end
		
	}

}
