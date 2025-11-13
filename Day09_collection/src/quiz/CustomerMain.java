package quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
	private int no;
	private String name;
	private String address;
	private String tel;
	
	
	public Customer(int no, String name, String address, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}


	// getter,setter
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
} // Customer end

public class CustomerMain {
	
	static ArrayList<Customer> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu;
		
		
		do {
			System.out.println("고객관리프로그램");
			System.out.println("1. 고객 추가");
			System.out.println("2. 고객 삭제");
			System.out.println("3. 고객 리스트 출력");
			System.out.println("4. 고객 수정");
			System.out.println("5. 프로그램 종료");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: addCustomer(); break;
				case 2: deleteCustomer(); break;
				case 3: listCustomer(); break;
				case 4: updateCustomer(); break;
				case 5: System.out.println("프로그램을 종료합니다!"); break;
				default: System.out.println("잘못입력하셨습니다."); break;
				
			} // switch end
			
		} while(menu != 5);
		
	} // main end

	
	// 1. 고객 추가
	private static void addCustomer() {
		System.out.println("고객 번호 입력 : ");
		int no = sc.nextInt();
		System.out.println("이릅 : ");
		String name = sc.nextLine();
		System.out.println("주소 : ");
		String address = sc.nextLine();
		System.out.println("전화번호 : ");
		String tel = sc.nextLine();
		
		list.add(new Customer(no, name, address, tel));
		System.out.println("고객이 추가되었습니다");
	}
	
	// 2. 고객 삭제
	private static void deleteCustomer() {
		System.out.println("삭제할 고객 번호 입력 : ");
		int no = sc.nextInt();
		
		for (Customer c : list) {
			if(c.getNo() == no) {
				list.remove(c);
				System.out.println("고객이 삭제되었습니다");
			} // if end
		}
		
	} // deleteCustomer end
	
	// 3. 고객 리스트 출력
	private static void listCustomer() {
		// TODO Auto-generated method stub
		
	}
	
	// 4. 고객 수정
	private static void updateCustomer() {
		// TODO Auto-generated method stub
		
	}





	


} // CustomerMain end
