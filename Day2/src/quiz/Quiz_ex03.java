package quiz;

import java.util.Scanner;

public class Quiz_ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "년은 윤년입니다.");
            } else {
                System.out.println(year + "년은 평년입니다.");
            }
        } else {
            System.out.println(year + "년은 평년입니다.");
        }

        sc.close();
	}
}
