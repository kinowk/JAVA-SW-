package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
// 1. Window Component ���, Listener ����
public class UseActionEvent2 extends JFrame implements ActionListener {
	// 2. �̺�Ʈ ó���� �����ִ� Component ����(instance Variable)

	private JTextField jtfName;
	private JButton jbtnInput;
	private JTextArea jtaNameDisplay;

	// 3. default constructor
	public UseActionEvent2() {
		super("���� ���̾ƿ��� ���");
		// 3. Component ����, Component ����
		JLabel jlblName = new JLabel("�̸�");
		jtfName = new JTextField(20);
		jbtnInput = new JButton("�Է�");
		jtaNameDisplay = new JTextArea();

		// 4. Event���
		jbtnInput.addActionListener(this); // ��ư�� Ŭ���Ǹ� �̺�Ʈ ó�� �ڵ����
		jtfName.addActionListener(this); // JTextField���� EnterŰ�� ������ �̺�Ʈ ó�� �ڵ����

		// 5. Layout Manager ����
//		setLayout(new BorderLayout()); //JFrame �⺻ ���̾ƿ� - BorderLayout

		// 6. Component ��ġ
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

		// 7. Window Component�� JFrame size ����
		setLocation(500, 100); // ���� ��ġ
		setSize(400, 300);
		// 8. Window Component�� JFrame�� User���� �����ֱ�
		setVisible(true);
		// 9. Window Component �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 10. abstract method Override
	@Override
	public void actionPerformed(ActionEvent e) {
		// JTextField�� �Է°��� �����ͼ�
		String name = jtfName.getText();
//		System.out.println(name);
		// JTextArea�� �߰�
		jtaNameDisplay.append(name + "\n");
		// JTextField clear
		jtfName.setText(""); // �Է� �� TextField clear
		// JTextField�� cursor�� ��ġ
		jtfName.requestFocus();
	}

	public static void main(String[] args) {
		new UseActionEvent2();
	}

}
