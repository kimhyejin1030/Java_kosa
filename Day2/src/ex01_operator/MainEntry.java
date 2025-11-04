package ex01_operator;

/*
 * (높← ) 최단산쉬관논삼대콤 (→낮)
 */
public class MainEntry {
	public static void main(String[] args) {
		// 정수(+, -, /, %,*....)  정수 = 정수
		System.out.println("7/3 = " + (7/3));
		System.out.println("7%3 = " + (7%3));
		
		System.out.println("7/3 = " + (7 / 3));
		System.out.println("7/3.0 = " + (7 / 3.0));
		System.out.println("7.0/3.0 = " + (7.0 / 3.0));
		
		int x = 3, y = 5;
		
		//x = x + y;
		// x += y;
		// x -= y;
		// x *= y;
		
		
		System.out.println("x = "+x+" y = " + y );
		
		//x = x + 1;
		//x += 1;
		x++ ;
		System.out.println(x);
	}

}
