package day1118;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FlowLayout - 흐름레이아웃<br>
 * 컴포넌트는 고유크기를 유지하고, 순서대로 배치된다.<br>
 * Window의 크기가 줄거나 늘어나면 Component의 위치가 알맞게 이동한다.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1. Window Component 상속
public class TestFlowLayout extends JFrame {

	// 2.default constructor
	public TestFlowLayout() {
		super("FlowLayout");

		// 3. Component 생성
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JLabel jlblAge = new JLabel("나이");

		Integer[] arrAge = new Integer[100];
		for (int i = 0; i < arrAge.length; i++) {
			arrAge[i] = i + 1;
		}
		JComboBox<Integer> jcbAge = new JComboBox<Integer>(arrAge);
		
		JButton jbtn = new JButton("입력");
		
		// 4. 배치관리자 설정 - BorderLayout -> FlowLayout
		setLayout(new FlowLayout());

		// 5.Component 배치
		add(jlblName);
		add(jtfName);
		add(jlblAge);
		add(jcbAge);
		add(jbtn);

//		add(new JLabel("이름"));
//		add(new JTextField(10));
//		add(new JLabel("나이"));
//		add(new JComboBox<Integer>(arrAge));
//		add(new JButton("입력"));
		
		// 6.Window 크기 설정
		setSize(600, 400);
		// 7. User 제공
		setVisible(true);
		// 8. Window 종료이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestFlowLayout();
	}

}
