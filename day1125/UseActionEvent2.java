package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
// 1. Window Component 상속, Listener 구현
public class UseActionEvent2 extends JFrame implements ActionListener {
	// 2. 이벤트 처리에 관련있는 Component 선언(instance Variable)

	private JTextField jtfName;
	private JButton jbtnInput;
	private JTextArea jtaNameDisplay;

	// 3. default constructor
	public UseActionEvent2() {
		super("여러 레이아웃을 사용");
		// 3. Component 생성, Component 생성
		JLabel jlblName = new JLabel("이름");
		jtfName = new JTextField(20);
		jbtnInput = new JButton("입력");
		jtaNameDisplay = new JTextArea();

		// 4. Event등록
		jbtnInput.addActionListener(this); // 버튼이 클리되면 이벤트 처리 코드실행
		jtfName.addActionListener(this); // JTextField에서 Enter키가 눌리면 이벤트 처리 코드실행

		// 5. Layout Manager 설정
//		setLayout(new BorderLayout()); //JFrame 기본 레이아웃 - BorderLayout

		// 6. Component 배치
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

		// 7. Window Component인 JFrame size 설정
		setLocation(500, 100); // 실행 위치
		setSize(400, 300);
		// 8. Window Component인 JFrame을 User에게 보여주기
		setVisible(true);
		// 9. Window Component 종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 10. abstract method Override
	@Override
	public void actionPerformed(ActionEvent e) {
		// JTextField의 입력값을 가져와서
		String name = jtfName.getText();
//		System.out.println(name);
		// JTextArea에 추가
		jtaNameDisplay.append(name + "\n");
		// JTextField clear
		jtfName.setText(""); // 입력 후 TextField clear
		// JTextField에 cursor를 위치
		jtfName.requestFocus();
	}

	public static void main(String[] args) {
		new UseActionEvent2();
	}

}
