//package ex02_lambda;
//
//interface Message {
//	int something(int x, int y);     // int return type, parameter O
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su  = msg.something(3, 5);
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		p.greeting(new Message() {  // 일반적인 형태
//			@Override
//			public int something(int x, int y) {
//				System.out.println("lambda return type int return type, parameter O. 4");
//				System.out.println("한주간 화이팅 해봅시다!!");
//				return x+y;
//			}
//		});  
//		
//		System.out.println("----------------------------------");
////		public int sum( int x, int y ) {  return x + y; } 
////		 (x, y) -> {  x + y; }     //  () -> {}
//		
//		p.greeting( (x, y) -> {  // lambda 형태
////		p.greeting( x, y -> {  // lambda 형태에서 자료형 안써도 되고, 매개변수가 2개 이상일때는 괄호 생략할 수 없다.
//			System.out.println("lambda return type parameter O 안녕하세요.");
//			System.out.println("한주간 화이팅 해봅시다!!");
//			System.out.println("x = " +x + ", y = " + y);
//			return x+y;
//		});
//
//	}
//}
//
//
//
//
//
//
//
//
