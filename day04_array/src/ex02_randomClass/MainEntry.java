package ex02_randomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		
		Random rand = new Random(); // 객체생성, 메모리에 할당, 생성자 수 자동호출
		
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		int num = rand.nextInt();
		System.out.println(num);
		
		System.out.println("=============================");
		
		// 원하는 영역의 안에 있는 숫자 출력
		// rand.nextInt(n); -> 0 ~ n-1 값 추출함
		System.out.println(rand.nextInt(5)); // 0 ~ 4
		System.out.println(rand.nextInt(5)+1); // 1 ~ 5
		
		
		System.out.println("=============================");
		// 1부터 45까지 숫자 중에서 5까지 숫자 뽑기 
		for(int i = 0; i<6; i++) {
			System.out.print(rand.nextInt(45) + 1 + " ");
		}
		
	}

}
