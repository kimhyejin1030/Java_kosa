package ex05_StringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length            /        capacity");
		System.out.println(sb.length()+"     /         " +sb.capacity());
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len+"      /        " + size);
		
		sb.append("java developer");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+"      /        " + size);
		
		sb.append("happyvirus");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+"      /        " + size);
		
		sb.append("12345678 7899");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+"      /        " + size);

		sb.trimToSize(); // 옹량 크기 조절
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+"      /        " + size);
		
		System.out.println(sb.hashCode());
		
	}

}
