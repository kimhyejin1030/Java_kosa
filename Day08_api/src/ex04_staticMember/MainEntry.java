package ex04_staticMember;

class Atm {
	int count; // instance member
	static int total; // static member - 초기화 1회만.... 있던 값을 가져온다.
	
	public Atm(int amount) { // 생성자함수(constructor method)는 static 있으면 안되고 클래스랑 이름이 같아야 한다.
		count += amount;
		total += amount;
	}
	
	// static method에서 일반 멤버변수는 사용할 수 없다.
	public static void view() {
		total = total + 100;
//		count = count + 100; 에러뜸!
	}
	
	public void display() {
		count += 50;
		total += 50;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
} // Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display(); // c: 1000, total : 1000
		
		Atm at2 = new Atm(1000);
		at2.display();
		Atm at3 = new Atm(1000);
		at3.display();

		
	}

}
