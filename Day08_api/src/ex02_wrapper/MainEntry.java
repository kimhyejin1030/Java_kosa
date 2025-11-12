package ex02_wrapper;

class Point{}

public class MainEntry {
	public static void main(String[] args) {
		Integer la = new Integer(9); // heap memory
		Integer lb = new Integer(10);
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		
		System.out.println(la);
		System.out.println(la.toString());
		System.out.println(la.getClass().getName()+'@'+Integer.toHexString(la.hashCode()));
		
		
		int x = 77; // stack memory
		double y = 5.5;
		System.out.println(x + "," + y);
//		y = x; // 묵시적형변환
		x = (int)y; // 명시적형변환
		System.out.println(x + "," + y);
		
		
		// Boxing vs UnBoxing
		int c = la.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = lb; // jdk 5.x 이후부터 autoboxing, unboxing
		
		System.out.println(x + "," + y);
		int num = Integer.parseInt(su);
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(la.MAX_VALUE);
		System.out.println(la.MIN_VALUE);
		
		System.out.println("-------------------------");
		
		Double dd = new Double(12.34); // Double dd = 12.34;라고 해도 됨
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		
		c = (int)dd.doubleValue();
		System.out.println(c);
		
		System.out.println("-------------------------");

		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111",2);
		System.out.println(f);
		System.out.println(e + 20);
		
		
	}

}


/*
 *  Wrapper class : 기본 자료형에 대응되는 클래스형 자료형
 기본자료형		클래스형(레퍼런스 또는 참조형)자료형
  int				Integer
  float				Float
  double			Double

  char				Character  ....
  */
