package ex03_array;

public class QuizEx2 {
	public static void main(String[] args) {
		// 배열 여러개 데이터 중에서 7의 개수를 찾기
		int[] arr = new int[] {7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7};
		
		int count = 0;
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == 7) {
				count++;
				sum += arr[i];
			} // if end
		}// for end
		
		System.out.println("7의 개수 : " + count + ", 합은 : " + sum);
	}

}
