package ex03_collection_list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("자바"); // string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); // object
		
		System.out.println("---------- 3개 객체 추가 ----------");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		
		for(i=0; i < 10; i++) {
			v.addElement(new Integer(i));
//			v.addElement(i);
		}
		
		System.out.println("---------- 3개 객체 추가 ----------");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		System.out.println("---------- Vector 내용 출력 ----------");
		Enumeration enu =  v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		System.out.println("\n---------- 객체 내용 포함 확인 ----------");
		if(v.contains("자바")) System.out.println("자바 문자열 포함 되어 있음");
		else System.out.println("자바 미포함");
		
		System.out.println("10.2 객체 위치는? " + v.indexOf(10.2));
		System.out.println("입력 시간 : " + date);
		System.out.println();
		System.out.println(v.get(v.indexOf(date)));
		System.out.println(v.get(2));
		
		// date object delete
		v.removeElementAt(v.indexOf(date));
		System.out.println("*******************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		for(i=0; i < v.size(); i++) {
//			v.removeElementAt(i); // 출력결과 : [10.2, 1, 3, 5, 7, 9]
//			v.remove(i); // 인덱스 번호 , 출력결과 : [10.2, 1, 3, 5, 7, 9]
			v.remove(0);
//			v.remove("자바");  // 해당 요소 이름 데이터 삭제, 출력결과 : [10.2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//			v.removeAllElements();
			
		}
		
		System.out.println("*******************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		System.out.println("++++++++++++++++++++++++++++++");
		v.setElementAt("java", 2);
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		System.out.println();
		v.trimToSize();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		v.setSize(2); // 크기를 강제로 2로 조정
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		
	}

}
