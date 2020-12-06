package day1119;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. Window Component Inheritance
public class UseTextComponent extends JFrame {
	// 2. default constructor
	public UseTextComponent() {
		super("Text Component");
//		Text Component - JTextField, JPasswordField, JTextArea

		// 3. Component 생성
		JLabel jlblId = new JLabel("아이디");
		JTextField jtfId = new JTextField(8);
		JLabel jlblPassword = new JLabel("비밀번호");
		JPasswordField jtfPassword = new JPasswordField(8);

//		setEchoChar - 반항문자 설정
//		jtfPassword.setEchoChar('*');

		JTextArea jtaTemp = new JTextArea(); // ScrollBar 없음
		TextArea taTemp = new TextArea(); // ScrollBar 있음

//		setLineWrap(boolean) - 입력된 문자열이 TextArea의 열(cols) 범위를 넘어가면 줄을 변경
		jtaTemp.setLineWrap(true);

//		setWrapStyleWord(boolean) - 단어 보호(띄어쓰기)
		jtaTemp.setWrapStyleWord(true);
		// ScrollBar 객체 생성
		JScrollPane jsp = new JScrollPane(jtaTemp); // JScrollPane과 Component - has a 관계

		// 4. 배치관리자 설정
		setLayout(new BorderLayout()); // JFrame의 배치관리자는 BorderLayout

//		North에 여러 Component를 배치하기 위해 Container Component 생성
		JPanel jpNorth = new JPanel();
		add(jpNorth, BorderLayout.NORTH);

//		Center에 여러 Component를 배치하기 위해 Container Component 생성
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1, 2)); // FlowLayout -> GridLayout
		add(jpCenter, BorderLayout.CENTER);

		// 5. Component 배치
//		BorderLayout.NORTH - Container Component 배치
		jpNorth.add(jlblId);
		jpNorth.add(jtfId);
		jpNorth.add(jlblPassword);
		jpNorth.add(jtfPassword);

//		BorderLayout.CENTER - Container Component 배치
//		jpCenter.add(jtaTemp); // ScrollBar 없음
		jpCenter.add(jsp);
		jpCenter.add(taTemp);

		// 6. Window Component 크기, 위치 설정
		setBounds(200, 100, 600, 400);

		// 7. User에게 Window Component 제공
		setVisible(true);

		// 8. Window Component 종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseTextComponent

	public static void main(String[] args) {
		new UseTextComponent();
	}// main

}// class
