package day1120;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Homework extends JFrame {

	public Homework() {
		super("�ڹ� - �޸���");

		JMenuBar menuBar = new JMenuBar();

		JMenu menuFile = new JMenu("����");
		JMenu menuTemplate = new JMenu("����");
		JMenu menuHelp = new JMenu("����");

		JMenuItem fileNew = new JMenuItem("�� ��");
		JMenuItem fileOpen = new JMenuItem("����");
		JMenuItem fileSave = new JMenuItem("����");
		JMenuItem fileSaveAs = new JMenuItem("�� �̸�����");
		JMenuItem fileClose = new JMenuItem("�ݱ�");
		JMenuItem templateFont = new JMenuItem("�۲�");
		JMenuItem templateLineWrap = new JMenuItem("�ڵ� �� �ٲ�");
		JMenuItem helpInfo = new JMenuItem("�޸�������");

		JTextArea textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);

		menuFile.add(fileNew);
		menuFile.addSeparator();
		menuFile.add(fileOpen);
		menuFile.add(fileSave);
		menuFile.add(fileSaveAs);
		menuFile.addSeparator();
		menuFile.add(fileClose);

		menuTemplate.add(templateFont);
		menuTemplate.addSeparator();
		menuTemplate.add(templateLineWrap);

		menuHelp.add(helpInfo);

		menuBar.add(menuFile);
		menuBar.add(menuTemplate);
		menuBar.add(menuHelp);

		setJMenuBar(menuBar);

		add(scroll);

		setBounds(200, 200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Homework();
	}

}
