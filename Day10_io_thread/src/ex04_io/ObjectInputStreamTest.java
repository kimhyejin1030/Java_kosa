package ex04_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("gread.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Grade dto = (Grade)ois.readObject();
		System.out.println("result output : " + dto);
		ois.close();
		
	}

}
