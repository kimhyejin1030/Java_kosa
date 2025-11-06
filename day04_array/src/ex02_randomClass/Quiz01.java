package ex02_randomClass;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
	
		for(int i=4; i>=0; i--) {
			System.out.println("숫자를 입력해주세요");
			int num = sc.nextInt();
			
			if(num == random) {
				System.out.println("정답입니다.");
			} else if (num > random) { 
				System.out.println("업");
			} else if (num < random){
				System.out.println("다운");
			} else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		
		System.out.println("정답은 " + random + "입니다.");
	}

}
