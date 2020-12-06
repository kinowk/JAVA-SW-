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

		JLabel jlblHobby = new JLabel("���");
		JCheckBox jcb1 = new JCheckBox("���");
		JCheckBox jcb2 = new JCheckBox("����");
		JCheckBox jcb3 = new JCheckBox("�丮", true);
		JCheckBox jcb4 = new JCheckBox("���ǰ���");
		JCheckBox jcb5 = new JCheckBox("�ڹ�", true);

		JLabel jlblGender = new JLabel("����");
		JRadioButton jrbtn1 = new JRadioButton("����", true);
		JRadioButton jrbtn2 = new JRadioButton("����");
//		JRadioButton�� ���� Button�� �ϳ��� ���õǿ��� �ϹǷ� ButtonGroup���� ���´�.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbtn1);
		bg.add(jrbtn2);

		// Layout Manager ����
		setLayout(new GridLayout(2, 1));

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		// ��ġ
		jp1.add(jlblHobby);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		jp1.add(jcb5);

		jp2.add(jlblGender);
		jp2.add(jrbtn1);
		jp2.add(jrbtn2);

		// Window Component�� ��ġ
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
