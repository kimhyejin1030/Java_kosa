package ex04_abstract;

public class Subway extends Trans {

	@Override
	public int price(int x) {
		result = x;
		return result;
		
	}
	
	@Override
	public void show(String name) {
		price(1650);
		System.out.println(name + "의 탑승 가격은 " + result + "원 입니다.");
		
	}



}
