package quiz;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Video{
	private int no;
	private String title;
	private String category;
	private int lend;
	private String lendName;
	private String lendDate;
	
	public Video(int no, String title, String category, String lendName, String lendDate) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLend() {
		return lend;
	}

	public void setLend(int lend) {
		this.lend = lend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		return "Video [no=" + no + ", title=" + title + ", category=" + category + ", lend=" + lend + ", lendName="
				+ lendName + ", lendDate=" + lendDate + "]";
	}
	
	
	
}

public class VideoMain {
	
	static Map<Integer, Video> videoMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu;
		
		
		do {
			
			System.out.println("비디오 관리 프로그램");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 비디오 추가");
			System.out.println("2. 비디오 삭제");
			System.out.println("3. 리스트 출력");
			System.out.println("4. 리스트 수정");
			System.out.print("원하시는 기능을 선택해주세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: addVideo(); break;
				case 2: removeVideo(); break;
				case 3: printVideo(); break;
				case 4: updateVideo(); break;
				case 0: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 선택하셨습니다.");

			} // switch end
		
		} while(menu != 0);
	} // main end
	
	
	// 비디오 추가
	static void addVideo() {
		System.out.print("비디오 번호 입력 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		if(videoMap.containsKey(no)) {
			System.out.println("이미 존재하는 비디오입니다.");
			return;
		}
		
		System.out.print("비디오 제목 입력 : ");
		String title = sc.next();
		System.out.print("장르 입력 : ");
		String category = sc.next();
		System.out.print("대여자 이름 : ");
		String lendName = sc.next();
		System.out.print("대여일자 : ");
		String lendDate = sc.next();

		
		videoMap.put(no, new Video(no, title, category, lendName, lendDate));
		System.out.println("비디오가 추가되었습니다.");
		
	} // addVideo end
	
	
	// 비디오 삭제
	static void removeVideo() {
		System.out.print("삭제할 비디오 번호 입력 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		if(videoMap.remove(no) != null) { // 해당 번호가 null이 아니면
			System.out.println("비디오가 삭제되었습니다.");
		} else {
			System.out.println("해당 번호의 비디오가 없습니다.");
		}
		
	} // removeVideo end
	
	
	// 비디오 리스트 출력
	static void printVideo() {
		System.out.println("비디오 목록 출력");
		System.out.printf("%s, %s, %s, %s, %s, %s","비디오 번호","비디오 제목","장르","대여여부","고객명","대여일자");
		System.out.println();
		
		if(videoMap.isEmpty()) {
			System.out.println("등록된 비디오가 없습니다.");
		} else {
			for (Video v : videoMap.values()) {
				System.out.println(v);
			}
		}
		
	} // printVideo end
	
	// 비디오 리스트 수정
	static void updateVideo() {
		System.out.print("수정할 비디오 번호 입력 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		// 일치하는 번호의 비디오가 없을 경우
		if(!videoMap.containsKey(no)) {
			System.out.println("해당 번호의 비디오가 없습니다!");
			return;
		}
		
		Video oldVideo = videoMap.get(no);
		
		System.out.println("1. 제목 수정");
		System.out.println("2. 장르 수정");
		System.out.println("3. 대여 상태 수정");
		System.out.println("수정할 항목 선택");
		int choice = sc.nextInt();
		sc.nextLine();
		
		Video newVideo = new Video(
                oldVideo.getNo(),
                oldVideo.getTitle(),
                oldVideo.getCategory(),
                oldVideo.getLendName(),
                oldVideo.getLendDate()
        );
        newVideo.setLend(oldVideo.getLend());
        newVideo.setLendName(oldVideo.getLendName());
        newVideo.setLendDate(oldVideo.getLendDate());

        switch(choice) {
            case 1:
                System.out.print("새 제목 입력: ");
                newVideo.setTitle(sc.nextLine());
                break;
            case 2:
                System.out.print("새 장르 입력: ");
                newVideo.setCategory(sc.nextLine());
                break;
            case 3:
                System.out.print("대여 여부 입력 (0: 미대여, 1: 대여): ");
                int lend = sc.nextInt();
                sc.nextLine();
                newVideo.setLend(lend);

                if (lend == 1) {
                    System.out.print("대여자 이름 입력: ");
                    newVideo.setLendName(sc.nextLine());
                    newVideo.setLendDate(LocalDate.now().toString());
                } else {
                    newVideo.setLendName("");
                    newVideo.setLendDate("");
                }
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

		videoMap.replace(no, newVideo);
		System.out.println("비디오 정보가 수정되었습니다.");
		
	} // updateVideo end
	

}
