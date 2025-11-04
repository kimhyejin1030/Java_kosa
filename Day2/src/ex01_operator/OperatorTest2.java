/*
package ex01_operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : (조건) ? 참 : 거짓;
		int x = 3, y = 5, z = 7, result;
		
		// result = (x > y) ? x: y;
		
		result = (x > y)? x : (y > z) ? y : z;
		
		System.out.println("result ===> " + result);
		
	}

}
*/



package ex01_operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : (조건) ? 참 : 거짓;
		int a,b,c,d;
		a = b = c = d = 10;
		int su = -3;
		String str;
		
		str = ((su % 2 != 0) && (su < 0)) ? "홀수 & 음수":
						((su % 2 != 0) && ( su > 0 )) ? "홀수 & 양수" : "짝수 & 양수";
		
		System.out.println(su + "------>" + str);
	}
}
