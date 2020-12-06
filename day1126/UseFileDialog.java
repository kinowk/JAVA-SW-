package day1126;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseFileDialog extends JFrame {

	private JButton jbtnFileOpen, jbtnFileSave;
	private JTextArea jtaFileList;

	public UseFileDialog() {
		super("FileDialog");

		jbtnFileOpen = new JButton("���Ͽ���");
		jbtnFileSave = new JButton("��������");
		jtaFileList = new JTextArea();

		JScrollPane jspCenter = new JScrollPane(jtaFileList);
		jspCenter.setBorder(new TitledBorder("���ϸ���Ʈ"));

		JPanel jpNorth = new JPanel();
		jpNorth.setBorder(new TitledBorder("���̾�α� ����"));
		jpNorth.add(jbtnFileOpen);
		jpNorth.add(jbtnFileSave);

		// �̺�Ʈ ó�� ��ü�� �����ϰ�
		FileDialogEvt fde = new FileDialogEvt(this);
		jbtnFileOpen.addActionListener(fde); // ActionEvent
		jbtnFileSave.addActionListener(fde); // ActionEvent
		addWindowListener(fde); // WindowEvent
		// ������Ʈ���� �߻��ϴ� �̺�Ʈ�� ó���� �� �ֵ��� ���

		add(jpNorth, BorderLayout.NORTH);
		add(jspCenter, BorderLayout.CENTER);

		setBounds(100, 100, 500, 600);
		setVisible(true);

	}

	public JButton getJbtnFileOpen() {
		return jbtnFileOpen;
	}

	public JButton getJbtnFileSave() {
		return jbtnFileSave;
	}

	public JTextArea getJtaFileList() {
		return jtaFileList;
	}

	public static void main(String[] args) {
		new UseFileDialog();
	}// main

}// class
