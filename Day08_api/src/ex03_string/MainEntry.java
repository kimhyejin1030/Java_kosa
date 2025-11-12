package ex03_string;

class Point {}

public class MainEntry {
	public static void main(String[] args) {
		int x = 99;
		String str = "abc";
//		String str = new String("abc");
		System.out.println("str : " + str);
		
		Point pt = new Point();
		System.out.println(pt);  // 
		System.out.println(str); // 
		
		char data[] = {'a', 'b', 'c'};
	    str = new String(data);
	    System.out.println("str :" + str);
	    System.out.println("kbs");
	    
	    String msg = "cdefghij";
	    System.out.println("Korea " + msg);
	    System.out.println(msg);
	    
	    msg = msg.concat("kosa"); // 문자열 결합
	    System.out.println(msg);
	    
	    String str2 = "abcdef".substring(2);
	    System.out.println(str2); // cdef
	    
	    str2 = "abcdef".substring(2, 5); // 상한값 포함, 하한값 미포함
	    System.out.println(str2); // cde
	    
	}

}
