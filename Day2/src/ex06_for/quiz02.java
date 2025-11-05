package ex06_for;

public class quiz02 {
	public static void main(String[] args) {
		// 구구단 전체 출력하는 프로그램 작성
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println( i + " * " + j + " = " + i*j);
			}
		}
	}

}
