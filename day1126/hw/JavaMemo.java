package day1126.hw;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	private JMenuBar menuBar;
	private JMenu menuFile, menuTemplate, menuHelp;
	private JMenuItem fileNew, fileOpen, fileSave, fileSaveAs, fileClose, templateFont, templateLineWrap, helpInfo;
	private JTextArea textArea;

	public JavaMemo() {
		super("�ڹ� - �޸���");

		menuBar = new JMenuBar();

		menuFile = new JMenu("����");
		menuTemplate = new JMenu("����");
		menuHelp = new JMenu("����");

		fileNew = new JMenuItem("���� �����");
		fileOpen = new JMenuItem("����");
		fileSave = new JMenuItem("����");
		fileSaveAs = new JMenuItem("�� �̸�����");
		fileClose = new JMenuItem("�ݱ�");
		templateFont = new JMenuItem("�۲�");
		templateLineWrap = new JMenuItem("�ڵ� �� �ٲ�");
		helpInfo = new JMenuItem("�޸�������");

		textArea = new JTextArea();
		textArea.setText("");
		JScrollPane scroll = new JScrollPane(textArea);

		JavaMemoEvt mfe = new JavaMemoEvt(this);
		fileNew.addActionListener(mfe);
		fileOpen.addActionListener(mfe);
		fileSave.addActionListener(mfe);
		fileSaveAs.addActionListener(mfe);
		fileClose.addActionListener(mfe);
		templateFont.addActionListener(mfe);
		templateLineWrap.addActionListener(mfe);
		helpInfo.addActionListener(mfe);
		addWindowListener(mfe);

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

		setBounds(200, 200, 1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JMenuItem getFileNew() {
		return fileNew;
	}

	public JMenuItem getFileOpen() {
		return fileOpen;
	}

	public JMenuItem getFileSave() {
		return fileSave;
	}

	public JMenuItem getFileSaveAs() {
		return fileSaveAs;
	}

	public JMenuItem getFileClose() {
		return fileClose;
	}

	public JMenuItem getTemplateFont() {
		return templateFont;
	}

	public JMenuItem getTemplateLineWrap() {
		return templateLineWrap;
	}

	public JMenuItem getHelpInfo() {
		return helpInfo;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public static void main(String[] args) {
		new JavaMemo();
	}

}
