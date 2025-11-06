package ex03_array;

import java.util.Random;

public class QuizEx3 {
	public static void main(String[] args) {
		// 문제 3 ) 기상청 근무
		// 특정달(30일 기준) 강수량 평균 구하는 프로그램 작성
		double[] a = new double[30];
		
		double sum = 0.0;
		double average;
		
		Random random = new Random();
		for(int i=0; i<a.length; i++) {
			a[i] = random.nextDouble(100.0);
			sum += a[i];
			System.out.printf("%d 강수량 : ",i+1,a[i]);
		}
		
		average = sum / a.length;
		System.out.printf("이번 달의 평균 강수량은 %f입니다.",average);
	}

}
