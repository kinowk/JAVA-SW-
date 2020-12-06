package day1125;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Event ��<br>
 * ���̵� JTextField���� ���Ͱ� �������� JTextArea�� ����<br>
 * ��й�ȣ JPasswordField���� ���Ͱ� �������� TextArea�� ����
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component Inheritance, Implements Listener
public class EventCompare extends JFrame implements ActionListener {
	// 2. �̺�Ʈ ó���� �����ִ� ��ü ����
	private JTextField jtfId;
	private JPasswordField jpfPassword;
	private JTextArea jtaTemp;
	private TextArea taTemp;

	// 3. default constructor, Component ����
	public EventCompare() {
		super("Text Component");
//		Text Component - JTextField, JPasswordField, JTextArea

		JLabel jlblId = new JLabel("���̵�");
		jtfId = new JTextField(8);
		JLabel jlblPassword = new JLabel("��й�ȣ");
		jpfPassword = new JPasswordField(8);

//		setEchoChar - ���׹��� ����
//		jpfPassword.setEchoChar('*');

		jtaTemp = new JTextArea(); // ScrollBar ����
		taTemp = new TextArea(); // ScrollBar ����

//		setLineWrap(boolean) - �Էµ� ���ڿ��� TextArea�� ��(cols) ������ �Ѿ�� ���� ����
		jtaTemp.setLineWrap(true);

//		setWrapStyleWord(boolean) - �ܾ� ��ȣ(����)
		jtaTemp.setWrapStyleWord(true);
		// ScrollBar ��ü ����
		JScrollPane jsp = new JScrollPane(jtaTemp); // JScrollPane�� Component - has a ����

		// 4. Component���� �߻��� Event�� JVM���� ������ �� �ֵ��� Event�� ���
		jtfId.addActionListener(this);
		jpfPassword.addActionListener(this);

		// 5. ��ġ������ ����
		setLayout(new BorderLayout()); // JFrame�� ��ġ�����ڴ� BorderLayout

//		North�� ���� Component�� ��ġ�ϱ� ���� Container Component ����
		JPanel jpNorth = new JPanel();
		add(jpNorth, BorderLayout.NORTH);

//		Center�� ���� Component�� ��ġ�ϱ� ���� Container Component ����
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1, 2)); // FlowLayout -> GridLayout
		add(jpCenter, BorderLayout.CENTER);

		// 6. Component ��ġ
//		BorderLayout.NORTH - Container Component ��ġ
		jpNorth.add(jlblId);
		jpNorth.add(jtfId);
		jpNorth.add(jlblPassword);
		jpNorth.add(jpfPassword);

//		BorderLayout.CENTER - Container Component ��ġ
//		jpCenter.add(jtaTemp); // ScrollBar ����
		jpCenter.add(jsp);
		jpCenter.add(taTemp);

		// 7. Window Component ũ��, ��ġ ����
		setBounds(200, 100, 600, 400);

		// 8. User���� Window Component ����
		setVisible(true);

		// 9. Window Component �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseTextComponent

	// 10. Event�� �߻����� �� ������ �ڵ带 �����ϴ� method�� Override�Ѵ�.
	@Override
	public void actionPerformed(ActionEvent e) { // getSource() - Event �߻� ��ġ Ȯ��
		if (e.getSource() == jtfId) {
			// JTextField�� ���� ������
			String id = jtfId.getText();
			// JTexArea�� �߰�
			jtaTemp.append(id + "\n");
			// JTextField clear
			jtfId.setText("");
		}
		if (e.getSource() == jpfPassword) {
			// JPasswordField�� ���� �����ͼ�
			String password = String.valueOf(jpfPassword.getPassword()); // getPassword() - return char[]
			// TextArea�� �߰�
			taTemp.append(password + "\n");
			// JPasswordField clear
			jpfPassword.setText("");
		}
	}

	public static void main(String[] args) {
		new EventCompare();
	}// main

}// class
