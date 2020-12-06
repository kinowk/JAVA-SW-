package day1119;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class UseCheckComponent extends JFrame {

	public UseCheckComponent() {
		super("Check Component");

		JLabel jlblHobby = new JLabel("취미");
		JCheckBox jcb1 = new JCheckBox("등산");
		JCheckBox jcb2 = new JCheckBox("낚시");
		JCheckBox jcb3 = new JCheckBox("요리", true);
		JCheckBox jcb4 = new JCheckBox("음악감상");
		JCheckBox jcb5 = new JCheckBox("자바", true);

		JLabel jlblGender = new JLabel("성별");
		JRadioButton jrbtn1 = new JRadioButton("남자", true);
		JRadioButton jrbtn2 = new JRadioButton("여자");
//		JRadioButton은 여러 Button중 하나만 선택되여야 하므로 ButtonGroup으로 묶는다.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbtn1);
		bg.add(jrbtn2);

		// Layout Manager 설정
		setLayout(new GridLayout(2, 1));

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		// 배치
		jp1.add(jlblHobby);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		jp1.add(jcb5);

		jp2.add(jlblGender);
		jp2.add(jrbtn1);
		jp2.add(jrbtn2);

		// Window Component에 배치
		add(jp1);
		add(jp2);

		setBounds(100, 100, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseCheckComponent

	public static void main(String[] args) {
		new UseCheckComponent();
	}// main

}// class
