package day1119;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. Window Component Inheritance
public class UseTextComponent extends JFrame {
	// 2. default constructor
	public UseTextComponent() {
		super("Text Component");
//		Text Component - JTextField, JPasswordField, JTextArea

		// 3. Component ����
		JLabel jlblId = new JLabel("���̵�");
		JTextField jtfId = new JTextField(8);
		JLabel jlblPassword = new JLabel("��й�ȣ");
		JPasswordField jtfPassword = new JPasswordField(8);

//		setEchoChar - ���׹��� ����
//		jtfPassword.setEchoChar('*');

		JTextArea jtaTemp = new JTextArea(); // ScrollBar ����
		TextArea taTemp = new TextArea(); // ScrollBar ����

//		setLineWrap(boolean) - �Էµ� ���ڿ��� TextArea�� ��(cols) ������ �Ѿ�� ���� ����
		jtaTemp.setLineWrap(true);

//		setWrapStyleWord(boolean) - �ܾ� ��ȣ(����)
		jtaTemp.setWrapStyleWord(true);
		// ScrollBar ��ü ����
		JScrollPane jsp = new JScrollPane(jtaTemp); // JScrollPane�� Component - has a ����

		// 4. ��ġ������ ����
		setLayout(new BorderLayout()); // JFrame�� ��ġ�����ڴ� BorderLayout

//		North�� ���� Component�� ��ġ�ϱ� ���� Container Component ����
		JPanel jpNorth = new JPanel();
		add(jpNorth, BorderLayout.NORTH);

//		Center�� ���� Component�� ��ġ�ϱ� ���� Container Component ����
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1, 2)); // FlowLayout -> GridLayout
		add(jpCenter, BorderLayout.CENTER);

		// 5. Component ��ġ
//		BorderLayout.NORTH - Container Component ��ġ
		jpNorth.add(jlblId);
		jpNorth.add(jtfId);
		jpNorth.add(jlblPassword);
		jpNorth.add(jtfPassword);

//		BorderLayout.CENTER - Container Component ��ġ
//		jpCenter.add(jtaTemp); // ScrollBar ����
		jpCenter.add(jsp);
		jpCenter.add(taTemp);

		// 6. Window Component ũ��, ��ġ ����
		setBounds(200, 100, 600, 400);

		// 7. User���� Window Component ����
		setVisible(true);

		// 8. Window Component �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseTextComponent

	public static void main(String[] args) {
		new UseTextComponent();
	}// main

}// class
