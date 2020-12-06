package day1118;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing - AWT보다 향상된 Window Application을 제작할 수 있다.
 * 
 * @author owner
 */

//1. javax.swing.JFrame 상속
@SuppressWarnings("serial")
public class UseSwing extends JFrame {

	// 2. default constructor
	public UseSwing() {
		super("JFrame을 사용하여 Window Applicaiont 제공");
		// 3. Component 생성
		Button button = new Button("AWT 버튼");
		JButton jbutton = new JButton("Swing 버튼");

		// 4. 배치(Component를 붙임)
		// 배치관리자(Layout Manager)를 사용하여 Component를 배치
		setLayout(new GridLayout(1, 2)); // GridLayout(int rows, int cols) - 1행 2열
		add(button); // 0행 0열
		add(jbutton); // 0행 1열

		// 5. Window의 크기 설정
		setSize(400, 200);

		// 6. Window Component를 User에게 보여주기
		setVisible(true);

		// 7. Window Component 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
	}

	public static void main(String[] args) {
		new UseSwing();
	}

}
