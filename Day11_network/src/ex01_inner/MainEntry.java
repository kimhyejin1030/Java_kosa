package ex01_inner;

class OuterClass {
	static int no;
	String message = "hello @@@@@@";
	
	public void outerMethod() {
		System.out.println("outer method call @@@@@");
		// System.out.println(su); //(에러) 외부클래스는 내부클래스 접근 불가능
	}
	
	class InnerClass {
		int su = 99;
		
		public void show() { 
			System.out.println(su); // 자기자신것 접근 가능
			System.out.println(message); // 외부접근 가능
		}
		
		public void disp() {
			System.out.println(no); // 외부
		}
		
	}// inner class end
	
} // outer class end

public class MainEntry {
	public static void main(String[] args) {
		// 1. 첫 번째 방법
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.disp();
		ic.show();
		System.out.println("------------------------------------");
		
		// 2. 두 번째 방법
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.show();
		
	} // main end

}
