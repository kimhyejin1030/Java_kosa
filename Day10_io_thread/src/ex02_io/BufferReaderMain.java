package ex02_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderMain {
	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		
		// 위에 3줄을 아래와 같이 1줄로 변경 가능
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input = ");
//		String str = br.readLine(); // 예외발생, 여러개의 데이터 입력 받기
//		String str2 = br.readLine();
		
		int str = Integer.parseInt(br.readLine());
		int str2 = Integer.parseInt(br.readLine());
		
		System.out.println(str + str2);
		
	}

}
