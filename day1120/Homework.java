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
		super("자바 - 메모장");

		JMenuBar menuBar = new JMenuBar();

		JMenu menuFile = new JMenu("파일");
		JMenu menuTemplate = new JMenu("서식");
		JMenu menuHelp = new JMenu("도움말");

		JMenuItem fileNew = new JMenuItem("새 글");
		JMenuItem fileOpen = new JMenuItem("열기");
		JMenuItem fileSave = new JMenuItem("저장");
		JMenuItem fileSaveAs = new JMenuItem("새 이름으로");
		JMenuItem fileClose = new JMenuItem("닫기");
		JMenuItem templateFont = new JMenuItem("글꼴");
		JMenuItem templateLineWrap = new JMenuItem("자동 줄 바꿈");
		JMenuItem helpInfo = new JMenuItem("메모장정보");

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
