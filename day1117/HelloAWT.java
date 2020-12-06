package day1117;

import java.awt.Button;
import java.awt.Frame;

/**
 * 윈도우 프로그래밍(Component Programming)
 * 
 * @author owner
 */

//1. 윈도우 컴포넌트를 상속받는다.( 사용자에게 보여주기 위해)
@SuppressWarnings("serial")
public class HelloAWT extends Frame {
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
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT();
	}// main

}// class
