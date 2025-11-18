package ex01_inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain { // outer class
	
	
	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 : 이너클래스");
		Button btn = new Button("Button-Start");
		
		// 2.
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionListener 발생했습니다.");
				System.out.println(e.getActionCommand()); // Console : Button-Start
				System.out.println(e.getSource());
				
			}
		});
		
		// 3.  
		f.addWindowListener(new WindowAdapter() { // 익명(무명) 클래스

			@Override
			public void windowClosing(WindowEvent e) { // 닫기
				System.exit(0);
			} 
		});
		
		f.add(btn); // 프레임(윈도우)에 버튼 컴포넌트 추가
		f.setVisible(true);
		f.setSize(300, 200);
		f.setLocation(300, 150);
		
	}

/*
 * 
 * package inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain { // outer class
	
	class EventHandler implements ActionListener { // inner class

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("ActionListener 발생했습니다.");
			System.out.println(e.getActionCommand()); // Console : Button-Start
			System.out.println(e.getSource());
			
		}
		
	}
	
	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 : 이너클래스");
		Button btn = new Button("Button-Start");
		
		// 1.
		EventHandler handler = new InnerEventMain().new EventHandler();
		btn.addActionListener(handler); // 버튼에 액션이벤트 추가
		
		f.add(btn);
		f.setVisible(true);
		f.setSize(300, 200);
		f.setLocation(300, 150);
		
	}
*/
	

}
