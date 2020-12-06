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

		jbtnFileOpen = new JButton("파일열기");
		jbtnFileSave = new JButton("파일저장");
		jtaFileList = new JTextArea();

		JScrollPane jspCenter = new JScrollPane(jtaFileList);
		jspCenter.setBorder(new TitledBorder("파일리스트"));

		JPanel jpNorth = new JPanel();
		jpNorth.setBorder(new TitledBorder("다이얼로그 선택"));
		jpNorth.add(jbtnFileOpen);
		jpNorth.add(jbtnFileSave);

		// 이벤트 처리 객체를 생성하고
		FileDialogEvt fde = new FileDialogEvt(this);
		jbtnFileOpen.addActionListener(fde); // ActionEvent
		jbtnFileSave.addActionListener(fde); // ActionEvent
		addWindowListener(fde); // WindowEvent
		// 컴포넌트에서 발생하는 이벤트를 처리할 수 있도록 등록

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
