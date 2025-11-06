package ex02_randomClass;

import java.util.Random;

public class Quiz02 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for(int i = 0; i < 7; i++) {
			System.out.print(rand.nextInt(45) + 1 + " ");
		}
	}

}
 