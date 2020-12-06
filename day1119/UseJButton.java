package day1119;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJButton extends JFrame {

	public UseJButton() {
		super("Image를 가진 JButton");

//		Component 생성
		// 경로는'/'나 '\' 모두 사용 가능 but linux에서는 '/' 사용
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_1.png");
		// '\'를 사용할 때 특수문자의 시작기호로 처리되어 '\\'로 작성이 필요함
		ImageIcon ii2 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1119\\img\\img_2.png");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_3.png");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_4.png");

		
		JButton jbtn1 = new JButton("라이언", ii1);
		JButton jbtn2 = new JButton("어피치", ii2);
		JButton jbtn3 = new JButton("무지", ii3);

		// border 설정
		jbtn1.setBorder(new TitledBorder("카카오프렌즈"));
		jbtn2.setBorder(new TitledBorder("카카오프렌즈"));
		jbtn3.setBorder(new TitledBorder("카카오프렌즈"));
//		setToolTipText - 풍선도움말
		jbtn1.setToolTipText("백수의 왕");
		jbtn2.setToolTipText("복숭아의 왕");
		jbtn3.setToolTipText("단무지의 왕");

//		setRollOver 마우스 포인터가 올라가거나 클릭되면 이미지를  변경
		jbtn3.setRolloverIcon(ii4);

//		setVerticalTextPosition(int textPosition); - TOP, CENTER, BOTTOM - 수직
//		setHorizontalTextPosition(int textPosition); - LEFT, CENTER, RIGHT - 수평

		// jbtn1의 text 수평위치 이동 (LEFT, CENTER, RIGHT)
		jbtn1.setHorizontalTextPosition(JButton.RIGHT);

		// jbtn2의 text 수직위치 이동 (TOP, CENTER, BOTTOM)
		jbtn2.setVerticalTextPosition(JButton.BOTTOM);

		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
//		Layout Manager 생성
		setLayout(new GridLayout(1, 3));

//		배치
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
//		크기 설정
		setBounds(100, 200, 600, 300); // int x, int y, int width, int height

//		User에게 제공
		setVisible(true);

//		exit		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJButton

	public static void main(String[] args) {
		new UseJButton();

	}// main

}// class
