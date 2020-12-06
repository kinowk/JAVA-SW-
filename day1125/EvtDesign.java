package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * ActionEvent를 ActionListener로 처리
 * 
 * @author owner
 */

//1. Window Component 상속
/**
 * @author owner
 *
 */
@SuppressWarnings("serial")
public class EvtDesign extends JFrame {
//2. 이벤트가 발생했을 때 처리될 Component를 instance variable로 선언
	private JButton jbtn;
	private JLabel jlbl;
	private JTextField jtf;

	// 3. default constructor, Component 생성
	public EvtDesign() {
		super("ActionEvent 처리");
		jlbl = new JLabel("출력 JLabel");
		jbtn = new JButton("Swing 버튼");
		jtf = new JTextField();

		// 4. 이벤트처리 객체와 has a 관계로 설정
		HasAEvt hasA = new HasAEvt(this);
		// 이벤트 처리 객체에서 이벤트를 처리할 수 있도록 등록
		jbtn.addActionListener(hasA); // HasAEvt에서 이벤트 처리

		// 5. 배치
		// 배치관리자(Layout Manager)를 사용하여 Component를 배치
		add(jbtn, BorderLayout.CENTER);
		add(jlbl, BorderLayout.NORTH);
		add(jtf, BorderLayout.SOUTH);
		// 5. Window의 크기 설정
		setSize(400, 200);

		// 6. Window Component를 User에게 보여주기
		setVisible(true);

		// 7. Window Component 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 8. 이벤트 처리 class에서 Component를 사용할 수 있도록 getter method 작성


	//	Alt + Shift + S
	public JButton getJbtn() {
		return jbtn;
	}// getJBtn

	public JLabel getJlbl() {
		return jlbl;
	}// getJlbl
	

	public JTextField getJtf() {
		return jtf;
	}

	public static void main(String[] args) {
		new EvtDesign();
	}

}
