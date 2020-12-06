package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ActionEvent�� ActionListener�� ó��
 * 
 * @author owner
 */

//1. Window Component ���, Listener ����
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener {
//2. �̺�Ʈ�� �߻����� �� ó���� Component�� instance variable�� ����
	private JButton jbtn;

	// 3. default constructor, Component ����
	public UseActionEvent() {
		super("ActionEvent ó��");

		jbtn = new JButton("Swing ��ư");

		// 4. Component�� �̺�Ʈ�� ��� - addListener
		jbtn.addActionListener(this);
//		is a ����� �̺�Ʈ�� ó���ϴ� �����̹Ƿ� �� ��ü�ȿ��� �̺�Ʈ�� ó���ϰ��� �� ��

		// 5. ��ġ
		// ��ġ������(Layout Manager)�� ����Ͽ� Component�� ��ġ
		add(jbtn, BorderLayout.CENTER); // 0�� 1��

		// 5. Window�� ũ�� ����
		setSize(400, 200);

		// 6. Window Component�� User���� �����ֱ�
		setVisible(true);

		// 7. Window Component ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 8. abstract method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		// showConfirmDialog
//		int flag = JOptionPane.showConfirmDialog(this, "â�� �����ðڽ��ϱ�?");
//		switch (flag) {
//		case JOptionPane.OK_OPTION:
//			dispose();
//			break;
//		case JOptionPane.NO_OPTION:
//			System.out.println("�ƴϿ�");
//			break;
//		case JOptionPane.CANCEL_OPTION:
//			System.out.println("���");
//		}

//		 showMessageDialog
		JOptionPane.showMessageDialog(this, "������ ������");

		// showInputDialog
//		String message = JOptionPane.showInputDialog("�ϰ���� �� �Է�");
//		System.out.println(message);

//		JOptionPane.showMessageDialog(this, "��ư�� Ŭ���Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		new UseActionEvent();
	}

}
