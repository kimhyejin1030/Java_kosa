package ex02_io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) throws IOException  { // 예외처리 위임
			
			InputStream is = System.in; // 표준입력
			
			System.out.print("단일 문자 입력 : ");
			int su = is.read()-48; // 예외발생 '0' ~ '9' : ASCII code 48 ~ 57
//			System.out.println((char)su);
			
			is.read();
			is.read();
			
			int su2 = is.read()-48;
			
			System.out.println(su + su2); // ??
			
		
	}

}




/*
 package ex02_io;


import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		
		// is.read()에 48이 없다면 아스키코드값으로 연산됨
		
		try {
			
			InputStream is = System.in; // 표준입력
			
			System.out.print("단일 문자 입력 : ");
			int su = is.read()-48; // 예외발생 '0' ~ '9' : ASCII code 48 ~ 57
//			System.out.println((char)su);
			
			is.read();
			is.read();
			
			int su2 = is.read()-48;
			
			System.out.println(su + su2); // ??
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
*/