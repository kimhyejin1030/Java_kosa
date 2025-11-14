package ex03_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 읽기 객체 - FileInputStream
//		InputStream is = new FileInputStream("C:\\Users\\kosa\\Pictures\\java.jpg"); // 절대경로
		InputStream is = new FileInputStream("C:/Users/kosa/Pictures/pic.jpg"); // 절대경로
		
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("java.jpg");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start); // 복사(작업)에 걸린 시간
		
		is.close();
		os.close();
		System.out.println("copy success!");
		
	}

}
