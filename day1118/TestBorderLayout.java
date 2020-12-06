package day1118;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * BorderLayout - 경계 레이아웃<br>
 * Component의 고유크기가 무시되고 배치되는 위치의 크기에 맞게 변경되는 Layout<br>
 * 하나의 영역에는 하나의 Component만 배치 가능<br>
 * Window Component의 기본 Layout
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component 상속
public class TestBorderLayout extends JFrame {
	// 2. default constructor
	public TestBorderLayout() {
		super("BorderLayout의 연습");
		// 3.Component 생성
		JButton jbtnNorth = new JButton("North");
		JButton jbtnEast = new JButton("East");
		JTextField jtfSouth = new JTextField("South");
		JLabel jlWest = new JLabel("West");
		JTextArea jtCenter = new JTextArea("Center");
		// 4. 배치관리자 설정
//		setLayout(new BorderLayout()); //JFrame 기본 레이아웃 - BorderLayout

		// 5. Component 배치
		// 문자열 상수로 컴포넌트가 배치되는 위치를 설정할 수 있다.
		add("Center", jtCenter); // add(jtCenter, BorderLayout.CENTER);
		add("North", jbtnNorth); // add(jbtnNorth, BorderLayout.NORTH); // add(jbtnNorth, "North");

		// BorderLayout의 constant로 component가 배치되는 위치를 설정할 수 있다.
		add(BorderLayout.WEST, jlWest);
		add(BorderLayout.SOUTH, jtfSouth);
		add(jbtnEast, BorderLayout.EAST);

		// 6. Window 크기 설정
		setSize(500, 500);
		// 7. User제공
		setVisible(true);
		// 8.Window 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestBorderLayout();
	}

}
