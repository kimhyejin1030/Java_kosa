package ex02_lambda;

import ex02_lambda.Message;
import ex02_lambda.Person;

interface Message {
	void something(); // void, parameter X
}

class Person {
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {

			@Override
			public void something() {
				System.out.println("안녕하세요");
				System.out.println("뚱이에요~");
				
			}
			
		}); // 일반적인 형태
		
		
		System.out.println("============================");
//		람다 기본 형태
//		public int sum( int x, int y ) {  return x + y; } 
//		(x, y) -> {  x + y; }
		
		p.greeting(() -> {
			System.out.println("안녕하세요22");
			System.out.println("뚱이에여~~");
		});
		

	}

}
