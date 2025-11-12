package ex02_collection;

import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		int[] score = {100, 50, 85, 95, 90, 35, 65, 45, 10, 65, 100 };
		
		for(int i = 0; i < score.length; i++) {
//			set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
	}

}
