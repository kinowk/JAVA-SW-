package day1118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 윈도우 프로그래밍(Component Programming)
 * 
 * @author owner
 */

//1. 윈도우 컴포넌트를 상속받는다.( 사용자에게 보여주기 위해)
@SuppressWarnings("serial")
public class HelloAWT2 extends Frame {
	// 2. 생성자 작성
	public HelloAWT2() {
		super("Hello! AWT"); // 부모클래스의 생성자 호출
		// 3. Component 생성
		Button btn = new Button("나는 버튼");
		// 4. Component 배치
		add(btn);
		// 5. 윈도우 크기 설정
		setSize(500, 400);
		// 6. 윈도우를 사용자에게 보여주기
		setVisible(true);

//		윈도우 종료이벤트 처리

//		addWindowListener(this); // WindowListener와 is a 관계가 아니므로 this 사용할 수 없다. -> implements 후 사용

//		anonymous inner class
//		WindowListener interface를 미리 구현한 class인 WindowAdapter class를 제공
//		WindowAdapter class는 WindowListener interface의 abstract method를 일반 method로 구현했기 때문에 필요한 method만 Override하면 된다.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT2();
	}// main

}// class
