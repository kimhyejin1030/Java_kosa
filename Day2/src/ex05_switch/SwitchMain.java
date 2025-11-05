package ex05_switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("point = ?(1,2,3)");
		int point = new Scanner(System.in).nextInt();
		
		/*
		String str = switch (point) { // long형 제외한 정수형,문자형 올 수 있다.(실수형X)
			case 1 -> "포인트 점수 1점 입니다.";
			case 2 -> "포인트 점수 2점 입니다.";
			case 3 -> "포인트 점수 3점 입니다.";
			
			default -> "없는 포인트 넣으셨네요. 1,2,3 중에서 선택하세요." ;
			
		};  // switch end
		
		*/
		
		String str = switch(point) {
			case 1 -> {
				System.out.println("추가 처리중...");
				yield "포인트 점수 1점 입니다.";
			}
			
			default -> "기타 포인트입니다.";
		};
		
		System.out.println(str);

	}
}

/*
 package ex05_switch;


public class SwitchMain {
	
	enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

	public static void main(String[] args) {
		Day day = Day.MONDAY; // 반드시 초기화 해야함
		
		switch (day) {
	    case MONDAY:
	    case FRIDAY:
	    case SUNDAY:
	        System.out.println(6);
	        break;
	    case TUESDAY:
	        System.out.println(7);
	        break;
	    case THURSDAY:
	    case SATURDAY:
	        System.out.println(8);
	        break;
	    case WEDNESDAY:
	        System.out.println(9);
	        break;

		}
	}

}
*/

/*package ex05_switch;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		System.out.println("point = ?(1,2,3)");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {
		case 1:
			System.out.println("집 ");
			break;
		case 2:
			System.out.println("피아노 ");
			break;
		case 3:
			System.out.println("우산 ");
			break;

		}
			
		System.out.println("상품에 당첨 되셨습니다. 축하합니다");
	}

}
*/
