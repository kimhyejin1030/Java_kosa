package ex03_string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happycat";
		String s2 = "BUSAN";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("BU", "UL")); // ULSAN
		System.out.println(s2);
		
		// 문자결합 방법(2가지)
		s1 = s1 + s2;
//		s1 = s1.concat(s2)
		System.out.println(s1);
		
		System.out.println("----------------------------------");
		
		String s3 = new String("  ab   cd   ");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열의 길이
		s3 = s3.trim(); // 공백제거
		System.out.println(s3.length());
		
		System.out.println("----------------------------------");
		
		String s4 = new String("ab cedf 1030 bebe 60669899");
		String[] s5 = s4.split(" ");
		for(int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번 문자열 : " + s5[i]);
		}
		
		System.out.println("----------------------------------");
		
		String s6 = new String("ab/cedf/1030/bebe/60669899");
		String[] s7 = s6.split("/");
		for(int i = 0; i < s7.length; i++) {
			System.out.println("분리된 " + i + "번 문자열 : " + s7[i]);
		}
		
		System.out.println("----------------------------------");
		
		String s8 = "123-456-789";
		String[] s9 = s8.split("-");
		for(int i = 0; i < s9.length; i++) {
			System.out.println(s9[i]);
		}
		
		System.out.println("----------------------------------");
		
		String s10 = "123456asdfqwer 789456 jkluio 0258 string";
		char ch = s10.charAt(8);
		System.out.println(ch);
		
		s10 = s10.substring(5,7);
		System.out.println(s8);
		
		System.out.println("----------------------------------");
		
		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		
		char [] ch2 = s1.toCharArray();
		for(int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i] + "\t");
		}
		
		System.out.println("----------------------------------");
		System.out.println(String.valueOf(ch));
		System.out.println(String.valueOf(ch).toUpperCase());
		
	}

}
