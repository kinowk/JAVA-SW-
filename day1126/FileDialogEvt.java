package day1126;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogEvt extends WindowAdapter implements ActionListener {
	private UseFileDialog ufd;

	/**
	 * 디자인class와 이벤트처리class를 has a 관계로 설정하는 생성자
	 * 
	 * @param ufd
	 */
	public FileDialogEvt(UseFileDialog ufd) {
		this.ufd = ufd;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		ufd.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생 했을 때 비교할 목적의 코드만 정의
		if (e.getSource() == ufd.getJbtnFileOpen()) {
			openFileDialog();
		}

		if (e.getSource() == ufd.getJbtnFileSave()) {
			saveFileDialog();
		}
	}

	private void openFileDialog() {
		// 1. Dialog 생성
		FileDialog fdOpen = new FileDialog(ufd, "파일열기", FileDialog.LOAD);
		// 2. User에게 보여주기
		fdOpen.setVisible(true);

		String dir = fdOpen.getDirectory();
		String fileName = fdOpen.getFile();

		if (dir != null) {
			// 선택한 파일명을 JTextArea에 추가
			StringBuilder sb = new StringBuilder("열기 : ");
			sb.append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			// JFrame의 Title 변경
			ufd.setTitle("FileDialog - LOAD");
		}
	}

	private void saveFileDialog() {
		// 1. Dialog 생성
		FileDialog fdSave = new FileDialog(ufd, "파일저장", FileDialog.SAVE);
		// 2. User에게 보여주기
		fdSave.setVisible(true);
		
		String dir = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if (dir != null) {
			// 선택한 파일명을 JTextArea에 추가
			StringBuilder sb = new StringBuilder("저장 : ");
			sb.append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			// JFrame의 Title 변경
			ufd.setTitle("FileDialog - SAVE");
		}
	}
}
