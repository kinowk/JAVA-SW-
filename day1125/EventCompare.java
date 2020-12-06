package day1125;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Event 비교<br>
 * 아이디 JTextField에서 엔터가 눌려지면 JTextArea에 설정<br>
 * 비밀번호 JPasswordField에서 엔터가 눌려지면 TextArea에 설정
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component Inheritance, Implements Listener
public class EventCompare extends JFrame implements ActionListener {
	// 2. 이벤트 처리에 관련있는 객체 선언
	private JTextField jtfId;
	private JPasswordField jpfPassword;
	private JTextArea jtaTemp;
	private TextArea taTemp;

	// 3. default constructor, Component 생성
	public EventCompare() {
		super("Text Component");
//		Text Component - JTextField, JPasswordField, JTextArea

		JLabel jlblId = new JLabel("아이디");
		jtfId = new JTextField(8);
		JLabel jlblPassword = new JLabel("비밀번호");
		jpfPassword = new JPasswordField(8);

//		setEchoChar - 반항문자 설정
//		jpfPassword.setEchoChar('*');

		jtaTemp = new JTextArea(); // ScrollBar 없음
		taTemp = new TextArea(); // ScrollBar 있음

//		setLineWrap(boolean) - 입력된 문자열이 TextArea의 열(cols) 범위를 넘어가면 줄을 변경
		jtaTemp.setLineWrap(true);

//		setWrapStyleWord(boolean) - 단어 보호(띄어쓰기)
		jtaTemp.setWrapStyleWord(true);
		// ScrollBar 객체 생성
		JScrollPane jsp = new JScrollPane(jtaTemp); // JScrollPane과 Component - has a 관계

		// 4. Component에서 발생한 Event를 JVM에서 감지할 수 있도록 Event에 등록
		jtfId.addActionListener(this);
		jpfPassword.addActionListener(this);

		// 5. 배치관리자 설정
		setLayout(new BorderLayout()); // JFrame의 배치관리자는 BorderLayout

//		North에 여러 Component를 배치하기 위해 Container Component 생성
		JPanel jpNorth = new JPanel();
		add(jpNorth, BorderLayout.NORTH);

//		Center에 여러 Component를 배치하기 위해 Container Component 생성
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1, 2)); // FlowLayout -> GridLayout
		add(jpCenter, BorderLayout.CENTER);

		// 6. Component 배치
//		BorderLayout.NORTH - Container Component 배치
		jpNorth.add(jlblId);
		jpNorth.add(jtfId);
		jpNorth.add(jlblPassword);
		jpNorth.add(jpfPassword);

//		BorderLayout.CENTER - Container Component 배치
//		jpCenter.add(jtaTemp); // ScrollBar 없음
		jpCenter.add(jsp);
		jpCenter.add(taTemp);

		// 7. Window Component 크기, 위치 설정
		setBounds(200, 100, 600, 400);

		// 8. User에게 Window Component 제공
		setVisible(true);

		// 9. Window Component 종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseTextComponent

	// 10. Event가 발생했을 때 제공할 코드를 정의하는 method를 Override한다.
	@Override
	public void actionPerformed(ActionEvent e) { // getSource() - Event 발생 위치 확인
		if (e.getSource() == jtfId) {
			// JTextField의 값을 가져옴
			String id = jtfId.getText();
			// JTexArea에 추가
			jtaTemp.append(id + "\n");
			// JTextField clear
			jtfId.setText("");
		}
		if (e.getSource() == jpfPassword) {
			// JPasswordField의 값을 가져와서
			String password = String.valueOf(jpfPassword.getPassword()); // getPassword() - return char[]
			// TextArea에 추가
			taTemp.append(password + "\n");
			// JPasswordField clear
			jpfPassword.setText("");
		}
	}

	public static void main(String[] args) {
		new EventCompare();
	}// main

}// class
