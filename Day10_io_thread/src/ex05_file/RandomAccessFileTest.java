package ex05_file;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws Exception {
		
		// sawon.txt 파일이 없다면 생성하면서 기재하고, 있으면 기존 파일에 기재한다.
		RandomAccessFile raf = new RandomAccessFile("sawon.txt","rw"); 
		
		for(int i=0; i <= 100; i++) {
			raf.seek(i * 100);
			String str = "hello" + i;
			raf.writeUTF(str);
//			raf.writeInt(1000);
		}
		
		for(int i=0; i <= 100; i++) {
//			raf.seek(i * 100);
			raf.seek(10);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string input success");
		raf.close();
	}
}
