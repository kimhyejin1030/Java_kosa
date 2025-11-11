package ex04_abstract;

public class Plain extends Trans {

	@Override
	public int price(int x) {
		result = x;
		return result;
	}

	@Override
	public void show(String name) {
		price(100000);
		System.out.println(name + "의 탑승 가격은 " + result + "원 입니다.");
		
	}


}
