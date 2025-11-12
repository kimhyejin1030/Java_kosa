package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		// 문제1 ) String str = "AbcDEFGHeijwEIMPYmnqr";
		// 위의 str 문자여을 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램 작성
		String str = "AbcDEFGHeijwEIMPYmnqr";
		String result = "";
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				result += Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				result += Character.toUpperCase(ch);
			} else {
				result += ch;
			}
		}
		
		System.out.println(result);
		
		System.out.println("------------------------------------");
		
		// 문제 2 )임의의 문자열을 입력 받아서 대문자 -> 소문자로, 소문자 -> 대문자로 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		String str1 = sc.nextLine();
		String result1 = "";
		
		for(int i=0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			
			if(Character.isUpperCase(ch1)) {
				result1 += Character.toLowerCase(ch1);
			} else if (Character.isLowerCase(ch1)) {
				result1 += Character.toUpperCase(ch1);
			} else {
				result1 += ch1;
			}
		}
		
		System.out.println("대소문자 바꾼 값은 " + result1);
		
		System.out.println("------------------------------------");
		
		// 문제 3 ) str = "ABC def kbsmbc 123 BB"; 대문자의 개수와 소문자의 개수 찾기
		String str2 = "ABC def kbsmbc 123 BB";
		int up = 0;
		int low = 0;
		
		for(int i=0; i < str2.length(); i++) {
			char ch2 = str2.charAt(i);
			
			if(Character.isUpperCase(ch2)) {
				up++;
			} else if (Character.isLowerCase(ch2)) {
				low++;
			}
			
		}
		
		System.out.println("대문자의 개수 : " + up + ", 소문자의 개수 : " + low);
	}

}
