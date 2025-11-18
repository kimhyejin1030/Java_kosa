package ex02_lambda;

@FunctionalInterface
interface Message1 {
	void something(int x, int y);     // void, parameter O
//	int good(int x);
}
@FunctionalInterface
interface Talk {
	void something(String x, String y);
}

class Person1 {
	public void greeting(Message1 msg) {
		msg.something(3, 5);
	}
	public void greeting(Talk msg) {
		msg.something("Hello", "Java Developer");
	}
}

public class MainEntry5 {
	
	public static void main(String[] args) {
		Person1 p = new Person1();
		char ch = 'K';

//		public int sum( int x, int y ) {  return x + y; } 
//		 (x, y) -> {  x + y; }     //  () -> {}
		
//		p.greeting( (x, y) -> { // 에러발생, 타입에 대해서 애매해서 타입을 정확히 써줘야함
//		p.greeting( (int x, int y) -> { // 에러발생, 
		p.greeting( (String x, String y) -> { 
			System.out.println("안녕하세요.");
			System.out.println("한주간 화이팅 해봅시다!!");
			System.out.println("x = " +x + ", y = " + y);
			
//			ch = 'A'; // 값 변경 할 수 없다. 
			
			System.out.println(ch); // 
			num = 90; // static 변수값은 변경 가능함
			System.out.println(num);
		});
	}
	
	static int num = 50;
}








