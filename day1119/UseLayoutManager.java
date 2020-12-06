package day1119;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component 상속
public class UseLayoutManager extends JFrame {
	// 2. default constructor
	public UseLayoutManager() {
		super("여러 레이아웃을 사용");
		// 3. Component 생성
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(20);
		JButton jbtnInput = new JButton("입력");
		JTextArea jtaNameDisplay = new JTextArea();

		// 4.Layout Manager 설정
//		setLayout(new BorderLayout()); //JFrame 기본 레이아웃 - BorderLayout

		// 5. Component 배치
		// BorderLayout은 하나의 영역에 하나의 Component만 배치할 수 있다.
//		North에는 여러 Component를 배치하기 위해 Container Component인 JPanel 사용

		JPanel jpNorth = new JPanel(); // FlowLayout
		// Container Component에 Layout 설정
//		jpNorth.setLayout(new FlowLayout()); // JPanel 기본 레이아웃 - FlowLayout
		// Container Layout에 Component 배치
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);

		add(jpNorth, BorderLayout.NORTH);
		add(jtaNameDisplay, BorderLayout.CENTER);

		// 6.Window Component인 JFrame size 설정
		setLocation(500, 100); // 실행 위치
		setSize(400, 300);
		// 7. Window Component인 JFrame을 User에게 보여주기
		setVisible(true);
		// 8.Window Component 종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UseLayoutManager();
	}

}
