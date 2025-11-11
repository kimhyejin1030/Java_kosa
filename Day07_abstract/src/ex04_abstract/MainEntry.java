package ex04_abstract;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Trans[] t = new Trans[4];
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Bicycle();
		t[3] = new Plain();
		
		String[] names = {"Subway","Bus","Bicycle","Plain"};
		
		for (int i = 0; i < names.length; i++) {
			t[i].show(names[i]);
		}
	}

}
