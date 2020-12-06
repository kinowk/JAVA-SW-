package day1119;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component ���
public class UseLayoutManager extends JFrame {
	// 2. default constructor
	public UseLayoutManager() {
		super("���� ���̾ƿ��� ���");
		// 3. Component ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(20);
		JButton jbtnInput = new JButton("�Է�");
		JTextArea jtaNameDisplay = new JTextArea();

		// 4.Layout Manager ����
//		setLayout(new BorderLayout()); //JFrame �⺻ ���̾ƿ� - BorderLayout

		// 5. Component ��ġ
		// BorderLayout�� �ϳ��� ������ �ϳ��� Component�� ��ġ�� �� �ִ�.
//		North���� ���� Component�� ��ġ�ϱ� ���� Container Component�� JPanel ���

		JPanel jpNorth = new JPanel(); // FlowLayout
		// Container Component�� Layout ����
//		jpNorth.setLayout(new FlowLayout()); // JPanel �⺻ ���̾ƿ� - FlowLayout
		// Container Layout�� Component ��ġ
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);

		add(jpNorth, BorderLayout.NORTH);
		add(jtaNameDisplay, BorderLayout.CENTER);

		// 6.Window Component�� JFrame size ����
		setLocation(500, 100); // ���� ��ġ
		setSize(400, 300);
		// 7. Window Component�� JFrame�� User���� �����ֱ�
		setVisible(true);
		// 8.Window Component �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UseLayoutManager();
	}

}
