package ex01_apiObject;

class Circle {
	int x = 5, y = 5;
}

public class EqualsMain {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 == c2) System.out.println("same");
		else System.out.println("not same"); // not same

		System.out.println("--------------------");
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if( x == y ) System.out.println("same");
		else System.out.println("not same"); // same
		
		System.out.println("--------------------");
		
		System.out.println("참조 자료형 비교");
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("--------------------");
		
		System.out.println("equals() method 비교");
		if(s1.equals(s2)) System.out.println("same");
		else System.out.println("not same");
		// Korea, korea 비교하면 not same이 나온다.
		// 각 글자의 아스키코드를 비교하기 때문에...
		// equals 대소문자 구분
		
		System.out.println("equalsIgnoreCase() 사용");
		if(s1.equalsIgnoreCase(s2)) System.out.println("same"); // equalsIgnoreCase : 대소문자 구분하지 않음
		else System.out.println("not same");
		
	}

}
