package day1126;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �� ����� ������ �ִ� ���� â(�θ� â)
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseParent extends JFrame {
	private JButton jbtn;

	public UseParent() {
		super("�θ�â");

		jbtn = new JButton("�ΰ����� ��� ���");

		// �̺�Ʈ��ü ���� ���輳��
		ParentEvt pe = new ParentEvt(this);
		// Component���� �̺�Ʈ�� �߻���Ű�� �̺�Ʈ�� ó���� �� ���
		jbtn.addActionListener(pe);
		addWindowListener(pe);

		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);

		add(jpSouth, BorderLayout.SOUTH);
		setBounds(100, 100, 1000, 700);
		setVisible(true);

	}

	public JButton getJbtn() {
		return jbtn;
	}

	public static void main(String[] args) {
		new UseParent();
	}// main

}// class
