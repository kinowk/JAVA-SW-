package day1126.hw;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo javaMemo;
	
	public JavaMemoEvt(JavaMemo javaMemo) {
		this.javaMemo = javaMemo;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		javaMemo.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == javaMemo.getFileNew()) {
			resetTextArea();
		}

		if (e.getSource() == javaMemo.getFileOpen()) {
			openFileDialog();
		}

		if (e.getSource() == javaMemo.getFileSave()) {
			saveFileDialog();
		}

		if (e.getSource() == javaMemo.getFileSaveAs()) {
			saveAsFileDialog();
		}

		if (e.getSource() == javaMemo.getFileClose()) {
			closeMemo();
		}

		if (e.getSource() == javaMemo.getTemplateFont()) {
			openFontDialog();
		}
		if (e.getSource() == javaMemo.getHelpInfo()) {
			openInfo();
		}
	}

	private void resetTextArea() {
		javaMemo.getTextArea().setText("");
	}

	private void openFileDialog() {
		FileDialog fdOpen = new FileDialog(javaMemo, "자바-메모장[열기 : 파일명]", FileDialog.LOAD);
		fdOpen.setVisible(true);
	}

	private void saveFileDialog() {
		FileDialog fdSave = new FileDialog(javaMemo, "자바-메모장[저장 : 파일명]", FileDialog.SAVE);
		fdSave.setVisible(true);
	}

	private void saveAsFileDialog() {
		FileDialog fdSaveAs = new FileDialog(javaMemo, "자바-메모장[저장 : 파일명]", FileDialog.SAVE);
		fdSaveAs.setVisible(true);
	}

	private void closeMemo() {
		javaMemo.dispose();
	}

	private void openFontDialog() {
		new MemoFont(javaMemo);
	}

	private void openInfo() {
		new JavaMemoInfo(javaMemo);
	}

}
