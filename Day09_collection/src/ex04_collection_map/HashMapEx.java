package ex04_collection_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("감자", 50);
		map.put("고구마", 70);
		map.put("옥수수", 100);
		map.put("당근", new Integer(80));
		map.put("호박", new Integer(90));
		
		Set set =  map.entrySet(); // 
//		System.out.println(set); [고구마=70, 감자=50, 옥수수=100, 당근=80, 호박=90]
		Iterator it = set.iterator();
		System.out.println(it.next());
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		} // while end
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values =  map.values();
		System.out.println("점수 : " + values);
		it = values.iterator();
		System.out.println(it.next());
		
		int total = 0;
		while(it.hasNext()) {
			Integer num = (Integer)it.next();
			total += num.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최하점수 : " + Collections.min(values));
		
		
		
	}

}
