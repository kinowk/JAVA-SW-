package day1126;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * UseParent의 이벤트 처리 class<br>
 * UseParent와 ParentEvt는 has a 관계
 * 
 * @author owner
 */
public class ParentEvt extends WindowAdapter implements ActionListener {

	private UseParent up;

	public ParentEvt(UseParent up) {
		this.up = up;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 눌려지면 JDialog를 생성
		if(e.getSource() == up.getJbtn()) {
			createDialog();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		up.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void createDialog() {
		new UseChild(up);
	}
}
