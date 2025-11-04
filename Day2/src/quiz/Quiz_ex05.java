package quiz;

import java.util.Scanner;

public class Quiz_ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력해주세요 : ");
		int num3 = sc.nextInt();
		
		int min, mid, max;
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else {
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		}
		
		System.out.println(max + ", " + mid + ", " +  min);
		
	}
	


}
