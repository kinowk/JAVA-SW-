package day1119;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// 1. Window Component Inheritance
public class ManualLayout extends JFrame {
	// 2. default constructor
	public ManualLayout() {
		super("������ġ ���");

		// 3. Component ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(); // �÷��� ũ�⸦ �����ϴ��� setSize�� ���Ǹ� setSize�� �켱�ȴ�.
		JButton jbtnInput = new JButton("�Է�");

		// 4. Layout Manager ����
		setLayout(null); // �⺻ ���̾ƿ�(BorderLayout)�� �����ȴ�.

		// 5. Component ��ġ, ũ�� ����
		// Component�� setLocation�� JFrame�� Ÿ��Ʋ �� �Ʒ� ���� ����� ������
//		jlblName.setLocation(10, 30); 
//		jlblName.setSize(80, 25);
		jlblName.setBounds(10, 20, 80, 25); // setBounds(int x, int y, int width, int height);
		jtfName.setBounds(80, 100, 120, 30);
		jbtnInput.setBounds(250, 400, 90, 25);

		// 6. Component ��ġ
		add(jlblName);
		add(jtfName);
		add(jbtnInput);

		// 7. Window ũ��� ��ġ ���� - JFrame�� setLocation�� monitor�� ���� ����� ������
		setBounds(100, 100, 400, 500);

		// 8. User���� ����
		setVisible(true);

		// Windowũ�� ���� ����
		setResizable(false);

		// 9. ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ManualLayout();
	}

}
