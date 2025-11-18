package ex02_lambda;

import java.util.ArrayList;

public class LambdaMain {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(82);
		numbers.add(92);
		numbers.add(12);
		
//		numbers.forEach( (n) -> {System.out.println(n);} );
		numbers.forEach( n -> {System.out.println(n);} ); // 괄호지워도됨
		
		
//		System.out.println(numbers);
		
//		for(int item : numbers) {
//			System.out.println(item);
//		}
		
		
		
	}

}
