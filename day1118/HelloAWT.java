package day1118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 윈도우 프로그래밍(Component Programming)
 * 
 * @author owner
 */

//1. 윈도우 컴포넌트를 상속받는다.( 사용자에게 보여주기 위해)
@SuppressWarnings("serial")
public class HelloAWT extends Frame implements WindowListener {
	// 2. 생성자 작성
	public HelloAWT() {
		super("Hello! AWT"); // 부모클래스의 생성자 호출
		// 3. Component 생성
		Button btn = new Button("나는 버튼");
		// 4. Component 배치
		add(btn);
		// 5. 윈도우 크기 설정
		setSize(500, 400);
		// 6. 윈도우를 사용자에게 보여주기
		setVisible(true);

		// 윈도우 종료이벤트 처리
		addWindowListener(this);
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT();
	}// main

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose(); // 부모클래스가 Window인 경우에만 사용가능 // 현재 윈도우를 종료
//		System.exit(0); // 실행중인 JVM을 강제로 종료하는 일
		// 0 - false // 비정상종료 - 종료 이후의 작업을 수행하지 않고 바로 종료
		// 1 - true // 정상종료 - 종료 이후의 작업을 수행한 후 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}// class
