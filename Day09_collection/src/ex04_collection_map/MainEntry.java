package ex04_collection_map;

import java.util.HashMap;
import java.util.Scanner;

// Map : key / value 한쌍으로 처리 (set+list)
public class MainEntry {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("kosa", "1234"); // id, pwd
		map.put("sbs", "1111");
		map.put("kbs", "1234");
//		map.put("kbs", "1004");
		
//		System.out.println(map);
//		System.out.println("요소 개수 : " + map.size()); // key 중복허용 X
//		map.put("id", "pwd");
//		System.out.println(map.get("sbs")); // key --> value 추출
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id/pwd 입력하세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pwd : ");
			String pwd = sc.nextLine().trim();
			
			System.out.println();
			
			if( !map.containsKey(id) ) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if( !(map.get(id)).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				} else {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
			
		} // end while
		
	}

}
