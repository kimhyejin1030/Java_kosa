package ex04_io;

public class MainEntry {
	public static void main(String[] args) {
		
		Grade dto = new Grade();
		dto.setScore(100);
		dto.setSubject("미술");
		
		System.out.println(dto);
		
	}
}
