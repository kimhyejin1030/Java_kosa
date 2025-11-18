package ex03_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

public class MainEntry {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address = ");
		try {
			strUrl = br.readLine(); // 예외발생
			address = Inet4Address.getAllByName(strUrl); // 예외발생
			
			for(int i=0; i < address.length; i++) {
				System.out.println(address[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
package ex03_network;

import java.net.Inet4Address;
import java.net.InetAddress;

public class MainEntry {
	
	public static void main(String[] args) {
		
		
		String host = "127.0.0.1";  // 192.168.2.36
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item : address) {
				System.out.println(item.getCanonicalHostName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
*/