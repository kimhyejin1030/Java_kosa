package ex06_for;

import java.util.Iterator;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1, b;
		for( ; ; ) { // 무한루프 - 탈출구문
			System.out.print(a + "\t");
			a++;
			
			// 탈출구문
			if(a==7) break;
		}
	
	}

}

/*
package ex06_for;

import java.util.Iterator;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
				// System.out.println(i + "*" + j + "=" + j*i);
				System.out.printf("%2d *%2d = %2d\t",i,j,i*j);
			
			}// j end
			System.out.println();
		} // i end
		
	}

}
*/

/*
package ex06_for;

import java.util.Iterator;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("dan = ");
		int dan = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
	}

}
*/
