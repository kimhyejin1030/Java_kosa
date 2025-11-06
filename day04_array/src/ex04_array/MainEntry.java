package ex04_array;

// 2차원 배열
public class MainEntry {
	public static void main(String[] args) {
		// 1.
		int[][] a = new int[2][3]; // 행크기,열크기
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		// 2.
		int[][] a2 = new int[][]{{1,2,3},{4,5,6}}; // 초기화
		
		// 3. 
		int[][] a3 = {{1,2,3},{4,5,6}}; // 초기화
		
		// 배열값 출력
		System.out.println("a3[0][2] = " + a3[0][2]); // 3
		System.out.println("a3[0][2] = " + a3[1][1]); // 5
		System.out.println("------------------------------");
		
		for(int i=0; i < 2; i++) {
			
			for(int j=0; j < 3; j++) {
				System.out.println("a3[" + i + "]["+j+"] = "+a[i][j]);
			}// j end
		} // i end
		
		System.out.println("------------------------------");
		System.out.println("배열의 행크기 : " + a3.length);
		System.out.println("배열의 행크기 : " + a3[0].length);
		System.out.println("배열의 행크기 : " + a3[1].length);
		
		for(int i = 0; i <a3.length; i++) {
			
		}
	}


}
