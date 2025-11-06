package ex04_array;

import java.util.Random;
import java.util.Scanner;

public class QuizEx4 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		// 2차원 배열에 임의적인 숫자 입력 받아서 합을 출력하기
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 2차원 배열 크기 입력
        System.out.print("행(row) 크기를 입력하세요: ");
        int row = sc.nextInt();
        System.out.print("열(col) 크기를 입력하세요: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int sum = 0;

        // 랜덤 숫자 넣기 (1~100 사이)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(100) + 1; 
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println("\n배열의 총합: " + sum);
	}

}
