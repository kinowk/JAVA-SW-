package day1120;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * JComboBox - java.awt ���� Chioce ��ü�� ����� �� �ִ�.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJCombo extends JFrame {

	public UseJCombo() {
		super();
		JLabel jlblEmail = new JLabel("�̸���");
		JTextField jtfEmail = new JTextField(15);
		JLabel jlblEmailAt = new JLabel("@");

		// Model ��ü ����
		String[] tempDomain = { "gmail.ocom", "daum.net", "naver.com", "nate.com" };
		DefaultComboBoxModel<String> dcbmDomain = new DefaultComboBoxModel<String>(tempDomain);// Model��ü�� �����ϸ鼭 �����͸� �߰�

		// Model�� �����͸� �߰�
		dcbmDomain.addElement("hotmail.com");

		// View ��ü ���� ��, Model ��ü�� ���� ���� - has a ����
		JComboBox<String> jcbDomain = new JComboBox<String>(dcbmDomain);

		// Layout Manager ����
		setLayout(new FlowLayout()); // BorderLayout -> FlowLayout

		add(jlblEmail);
		add(jtfEmail);
		add(jlblEmailAt);
		add(jcbDomain);

		// ũ�⼳��
		setBounds(200, 100, 400, 100);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJCombo

	public static void main(String[] args) {
		new UseJCombo();
	}// main

}// class
