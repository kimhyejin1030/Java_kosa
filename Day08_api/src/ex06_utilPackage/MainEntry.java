package ex06_utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get((Calendar.MONTH)) + 1 + "월"); // 월은 0부터 시작함
		System.out.println(c.get(Calendar.DATE)+"일");
		System.out.println("-----------------------------------------");
		
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + ":" + m + ":"+s);
	}
}
