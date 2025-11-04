package quiz;

public class Quiz_ex01 {
	public static void main(String[] args) {
		int pay = 567890; // / , %
		
		int man = pay / 10000; // 만원
		pay %= 10000;

        int chun = pay / 1000; // 천원
        pay %= 1000;

        int back = pay/ 100; // 백원
        pay %= 100;

        int sip = pay / 10; // 십원
        pay %= 10;

        System.out.println("만원 " + man + "장");
        System.out.println("천원 " + chun + "장");
        System.out.println("백원 " + back + "개");
        System.out.println("십원 " + sip + "개");
		
	}

}

/*
result > 
	만원 : 56장
	천원 : 7장
	백원 : 8개
	십원 : 9개
*/
