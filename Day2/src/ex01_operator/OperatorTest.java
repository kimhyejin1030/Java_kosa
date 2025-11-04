package ex01_operator;

public class OperatorTest {
	
	public static void main(String[] args) {
		// shift 연산자 : << , >>, <<<
		int x = 8, result;
		
		// result = x << 2; // left shift : 원래값 * 2 * bit 순 ===> 8 * 4 = 32
		result = x >> 3; // right shift :  원래값 / 2 / bit순 ===> 8 / 2^3 = 1
		System.out.println("left shift result = " + result);
		
		int a = 4, b= 7, c = 5;
		System.out.println(a + ',' + b);
		System.out.println(a & b); // 4
		System.out.println(a | b); // 7
		System.out.println(a ^ b); // 3

		System.out.println("\n---------------");
		boolean flag;
		
		// flag = a > b && c > b; // false  '&&' 앞에 것이 '거짓'이면 뒤는 수행하지 않는다.
		// flag = a < b && c < b; // true
		flag = a > b || c < b; // true // '||' 앞에 것이 '참'이면 뒤는 수행하지 않는다.
		
		System.out.println(flag);
		
		
		
	}

}
