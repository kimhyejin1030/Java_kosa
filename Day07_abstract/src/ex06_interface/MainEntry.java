package ex06_interface;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		b.show();
		
		System.out.println("---------------------------");
		
		// 2.
		IDraw bb = new BB();
		bb.draw();
		System.out.println(bb.su);
		
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : (1. 버스 / 2. 지하철 / 3. 자전거 / 4. 비행기)");
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("버스");
				Bus bu = new Bus();
				bu.start();
				bu.stop();
				break;
			case 2:
				System.out.println("지하철");
				Subway sb = new Subway();
				sb.start();
				sb.stop();
				break;
			case 3:
				System.out.println("자전거");
				Bicycle bc = new Bicycle();
				bc.start();
				bc.stop();
				break;
			case 4:
				System.out.println("비행기");
				Plain pl = new Plain();
				pl.start();
				pl.stop();
				break;

		}

		
		
	}

}
