package ex05_network_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest { // Socket 1개 필요
	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			s = new Socket("192.168.2.36",9000); // server ip & port number
			
			// I / O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
//			String str = "나는야 서버";
			System.out.println("여기는 클라이언트!! 서버에게 보낼 문자 입력 : ");
			String str = new Scanner(System.in).nextLine();
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}// end try
	}

}
