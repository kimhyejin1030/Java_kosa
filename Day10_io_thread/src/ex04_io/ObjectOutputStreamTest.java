package ex04_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Grade vo = new Grade();
		vo.setSubject("전산");
		vo.setScore(99);
		
		System.out.println(vo);
		
		OutputStream os = new FileOutputStream("gread.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
		
	}

}
