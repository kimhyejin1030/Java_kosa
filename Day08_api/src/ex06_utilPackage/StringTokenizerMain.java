package ex06_utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("사과=1 | 초콜렛=3 | 샴페인 = 1","=|",true);
		
		while(token.hasMoreTokens()) {
			String str = token.nextToken();
			
			if(str.equals("=")) System.err.print("\t");
			else if(str.equals("|")) System.out.println("\n");
			else System.out.println(str);
			
		}
		
		
	}
}

/*
package ex06_utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("A / B / C / D / E / F / G");
		// new StringTokenizer("A B C D E F");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		//split() 메소드 이용해서 출력학;
		System.out.println("------------split() 메소드 이용 1-----------------");
		String str = "A / B / C /  D | E / F & G";
		
		String[] result = str.split("/");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i].trim());
		}
		
		// split() 메소드로 "|"와 "&" 기준으로 문자열 나누기
		System.out.println("------------split() 메소드 이용 2-----------------");
		String[] result2 = str.split("[|&]");
		for(int i = 0; i < result2.length; i++) {
			System.out.println(result2[i].trim());
		}
		
		System.out.println("------------split() 메소드 이용 3-----------------");
		String[] result3 = "A / B / C /  D - E - F - G".split("[-]");
		for(int i = 0; i < result3.length; i++) {
			System.out.println(result3[i].trim());
		}
		
	}

}
//*/