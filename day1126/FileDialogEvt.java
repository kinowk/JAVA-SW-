package day1126;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogEvt extends WindowAdapter implements ActionListener {
	private UseFileDialog ufd;

	/**
	 * ������class�� �̺�Ʈó��class�� has a ����� �����ϴ� ������
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
		// �̺�Ʈ�� �߻� ���� �� ���� ������ �ڵ常 ����
		if (e.getSource() == ufd.getJbtnFileOpen()) {
			openFileDialog();
		}

		if (e.getSource() == ufd.getJbtnFileSave()) {
			saveFileDialog();
		}
	}

	private void openFileDialog() {
		// 1. Dialog ����
		FileDialog fdOpen = new FileDialog(ufd, "���Ͽ���", FileDialog.LOAD);
		// 2. User���� �����ֱ�
		fdOpen.setVisible(true);

		String dir = fdOpen.getDirectory();
		String fileName = fdOpen.getFile();

		if (dir != null) {
			// ������ ���ϸ��� JTextArea�� �߰�
			StringBuilder sb = new StringBuilder("���� : ");
			sb.append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			// JFrame�� Title ����
			ufd.setTitle("FileDialog - LOAD");
		}
	}

	private void saveFileDialog() {
		// 1. Dialog ����
		FileDialog fdSave = new FileDialog(ufd, "��������", FileDialog.SAVE);
		// 2. User���� �����ֱ�
		fdSave.setVisible(true);
		
		String dir = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if (dir != null) {
			// ������ ���ϸ��� JTextArea�� �߰�
			StringBuilder sb = new StringBuilder("���� : ");
			sb.append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			// JFrame�� Title ����
			ufd.setTitle("FileDialog - SAVE");
		}
	}
}
