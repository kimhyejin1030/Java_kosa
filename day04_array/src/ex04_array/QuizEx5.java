package ex04_array;

public class QuizEx5 {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 3, 10, 2, 8 }, { 7, 15, 5, 3 }, { 0, 0, 0, 0 } };
		
		for(int i=0; i<arr[0].length; i++) {
			arr[2][i] = arr[0][i] + arr[1][i];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
