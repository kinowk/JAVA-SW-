package day1120;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseMenu extends JFrame {

	public UseMenu() {
		super("Use Menu");
		// 1. MenuBar ����
		JMenuBar jmb = new JMenuBar();

		// 2. Menu ����
		JMenu jmFile = new JMenu("����");
		JMenu jmEdit = new JMenu("����");

		// 3. MenuItem ����
		// ���ϸ޴��� ��ġ�� �޴������� ����
		JMenuItem jmiOpen = new JMenuItem("����");
		JMenuItem jmiSave = new JMenuItem("����");
		JMenuItem jmiEnd = new JMenuItem("����");

		// �����޴��� ��ġ�� �޴������� ����
		JMenuItem jmiCopy = new JMenuItem("����");
		JMenuItem jmiCut = new JMenuItem("�ڸ���");
		JMenuItem jmiPaste = new JMenuItem("���̱�");

		// 4. MenuItem�� Menu�� ��ġ
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		// Menu�� ���м� ����
		jmFile.addSeparator();
		jmFile.add(jmiEnd);

		jmEdit.add(jmiCut);
		jmEdit.add(jmiCopy);
		jmEdit.add(jmiPaste);

		// 5. Menu�� MenuBar�� ��ġ
		jmb.add(jmFile);
		jmb.add(jmEdit);

		// 6. MenuBar�� Window Component�� ��ġ
		setJMenuBar(jmb);

		setBounds(100, 200, 400, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseMenu

	public static void main(String[] args) {
		new UseMenu();
	}// main

}// class
