package ex06_for;

public class quiz03 {
	public static void main(String[] args) {
		// 1 ~ 100까지 중에서 3의 배수의 개수, 합 구하는 프로그램 작성
		int cnt = 0;
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				cnt++;
				sum += i;
			} // if
		} // for
		
		System.out.println("배수의 개수 : " + cnt);
		System.out.println("배수의 합 : " + sum);
	}

}
