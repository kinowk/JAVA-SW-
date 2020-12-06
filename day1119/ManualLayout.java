package day1119;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. Window Component Inheritance
public class ManualLayout extends JFrame {
	// 2. default constructor
	public ManualLayout() {
		super("수동배치 사용");

		// 3. Component 생성
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(); // 컬럼의 크기를 설정하더라도 setSize가 사용되면 setSize가 우선된다.
		JButton jbtnInput = new JButton("입력");

		// 4. Layout Manager 설정
		setLayout(null); // 기본 레이아웃(BorderLayout)이 해제된다.

		// 5. Component 위치, 크기 설정
		// Component의 setLocation은 JFrame의 타이틀 바 아래 왼쪽 상단이 시작점
//		jlblName.setLocation(10, 30); 
//		jlblName.setSize(80, 25);
		jlblName.setBounds(10, 20, 80, 25); // setBounds(int x, int y, int width, int height);
		jtfName.setBounds(80, 100, 120, 30);
		jbtnInput.setBounds(250, 400, 90, 25);

		// 6. Component 배치
		add(jlblName);
		add(jtfName);
		add(jbtnInput);

		// 7. Window 크기와 위치 설정 - JFrame의 setLocation은 monitor의 왼쪽 상단이 시작점
		setBounds(100, 100, 400, 500);

		// 8. User에게 제공
		setVisible(true);

		// Window크기 조절 막기
		setResizable(false);

		// 9. 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ManualLayout();
	}

}
