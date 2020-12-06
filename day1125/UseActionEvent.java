package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ActionEvent를 ActionListener로 처리
 * 
 * @author owner
 */

//1. Window Component 상속, Listener 구현
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener {
//2. 이벤트가 발생했을 때 처리될 Component를 instance variable로 선언
	private JButton jbtn;

	// 3. default constructor, Component 생성
	public UseActionEvent() {
		super("ActionEvent 처리");

		jbtn = new JButton("Swing 버튼");

		// 4. Component를 이벤트에 등록 - addListener
		jbtn.addActionListener(this);
//		is a 관계로 이벤트를 처리하는 구조이므로 내 객체안에서 이벤트를 처리하고자 할 때

		// 5. 배치
		// 배치관리자(Layout Manager)를 사용하여 Component를 배치
		add(jbtn, BorderLayout.CENTER); // 0행 1열

		// 5. Window의 크기 설정
		setSize(400, 200);

		// 6. Window Component를 User에게 보여주기
		setVisible(true);

		// 7. Window Component 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 8. abstract method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		// showConfirmDialog
//		int flag = JOptionPane.showConfirmDialog(this, "창을 닫으시겠습니까?");
//		switch (flag) {
//		case JOptionPane.OK_OPTION:
//			dispose();
//			break;
//		case JOptionPane.NO_OPTION:
//			System.out.println("아니오");
//			break;
//		case JOptionPane.CANCEL_OPTION:
//			System.out.println("취소");
//		}

//		 showMessageDialog
		JOptionPane.showMessageDialog(this, "오늘은 수요일");

		// showInputDialog
//		String message = JOptionPane.showInputDialog("하고싶은 말 입력");
//		System.out.println(message);

//		JOptionPane.showMessageDialog(this, "버튼이 클릭되었습니다.");
	}

	public static void main(String[] args) {
		new UseActionEvent();
	}

}
