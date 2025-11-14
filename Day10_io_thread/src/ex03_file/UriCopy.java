package ex03_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.gstatic.com/marketing-cms/assets/images/f5/d3/a7f9db7045429cb6dc6be56bdcbe/google-logo-about.svg");
	
		// 읽기 객체
		InputStream is = url.openStream();
		
		// 쓰기 객체
		OutputStream os = new FileOutputStream("google.jpg");
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			os.write(buffer,0,inputData);
		}
		
		os.close();
		is.close();
		System.out.println("웹에서 파일 복사 성공했습니다.");
		
	}
}
