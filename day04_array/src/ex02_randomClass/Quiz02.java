package ex02_randomClass;

import java.util.Random;

public class Quiz02 {
	public static void main(String[] args) {
		// 1 ~ 45까지 숫자 중 6개 추출
		
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++) {
			System.out.print(rand.nextInt(45) + 1 + " ");
		}
	}

}
 