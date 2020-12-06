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
		super("Image�� ���� JButton");

//		Component ����
		// ��δ�'/'�� '\' ��� ��� ���� but linux������ '/' ���
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_1.png");
		// '\'�� ����� �� Ư�������� ���۱�ȣ�� ó���Ǿ� '\\'�� �ۼ��� �ʿ���
		ImageIcon ii2 = new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1119\\img\\img_2.png");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_3.png");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_4.png");

		
		JButton jbtn1 = new JButton("���̾�", ii1);
		JButton jbtn2 = new JButton("����ġ", ii2);
		JButton jbtn3 = new JButton("����", ii3);

		// border ����
		jbtn1.setBorder(new TitledBorder("īī��������"));
		jbtn2.setBorder(new TitledBorder("īī��������"));
		jbtn3.setBorder(new TitledBorder("īī��������"));
//		setToolTipText - ǳ������
		jbtn1.setToolTipText("����� ��");
		jbtn2.setToolTipText("�������� ��");
		jbtn3.setToolTipText("�ܹ����� ��");

//		setRollOver ���콺 �����Ͱ� �ö󰡰ų� Ŭ���Ǹ� �̹�����  ����
		jbtn3.setRolloverIcon(ii4);

//		setVerticalTextPosition(int textPosition); - TOP, CENTER, BOTTOM - ����
//		setHorizontalTextPosition(int textPosition); - LEFT, CENTER, RIGHT - ����

		// jbtn1�� text ������ġ �̵� (LEFT, CENTER, RIGHT)
		jbtn1.setHorizontalTextPosition(JButton.RIGHT);

		// jbtn2�� text ������ġ �̵� (TOP, CENTER, BOTTOM)
		jbtn2.setVerticalTextPosition(JButton.BOTTOM);

		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
//		Layout Manager ����
		setLayout(new GridLayout(1, 3));

//		��ġ
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
//		ũ�� ����
		setBounds(100, 200, 600, 300); // int x, int y, int width, int height

//		User���� ����
		setVisible(true);

//		exit		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJButton

	public static void main(String[] args) {
		new UseJButton();

	}// main

}// class
