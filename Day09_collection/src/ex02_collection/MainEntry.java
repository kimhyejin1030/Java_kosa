package ex02_collection;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복허용하지 않음
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("컵");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); // 중복허용 Xs
		System.out.println(hs); // 순서 X
		
		HashSet<Integer> hs2 = new HashSet<>(); // 타입 파라미터 안에는 primitive 넣으면 안됨
		hs2.add(100);
		hs2.add(20);
//		hs2.add("string"); 에러뜸
//		hs2.add(12.14); 에러뜸
		
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet();
		hs3.add(12.34);
		hs3.add(300);
		hs3.add("string");
		System.out.println(hs3);
		
		Iterator it =  hs3.iterator();
		while(it.hasNext()) { // 다음 요소가 있다면...
			System.out.println(it.next());
		}
		
	}

}
