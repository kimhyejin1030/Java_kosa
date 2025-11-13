package ex04_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구","뚱이","010-1111-1111");
		addPhoneNo("친구","스폰지밥","010-2222-2222");
		addPhoneNo("회사","징징이","010-3333-3333");
		addPhoneNo("친구","다람이","010-4444-4444");
		addPhoneNo("회사","게살사장","010-5555-5555");
		addPhoneNo("회사","플랑크톤","010-6666-6666");
		addPhoneNo("회사","고래소녀","010-7777-7777");
		addPhoneNo("회사","망둥어","010-8888-8888");
		addPhoneNo("세탁","010-1111-1111");
		
		printList();

	} // main end
	
	
	// 그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
		
	}
	
	// 그룹에 전화번호를 추가하는 메서드
	public static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		
		HashMap group = (HashMap)phoneBook.get(groupName); // get은 Object 타입이라서 형변환 필요(큰 곳이 작은 곳으로)
		group.put(tel, name); // 이름은 중복 될 수 있으니, 전화번호를 key 값으로 저장한다.
	}
	
	
	private static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타",name,tel);
		
	}
	
	// 전화번호부 전체를 출력하는 메소드
	public static void printList() {
		Set set = phoneBook.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
//			System.out.println(e);
			
			Set subSet = ((HashMap)(e.getValue())).entrySet();
			Iterator subit = subSet.iterator();
			
			System.out.println(" * " + e.getKey()+"["+subSet.size()+"]");
			
			while(subit.hasNext()) {
				Map.Entry subE = (Map.Entry)subit.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+" " +telNo);
				
			} // in while end
			
			System.out.println();
			
		} // out while end
	}


}
