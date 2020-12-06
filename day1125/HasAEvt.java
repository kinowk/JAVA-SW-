package day1125;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * ������ class�� has a ������ �̺�Ʈ ó�� class�� ����
 * 
 * @author owner
 */
// 1. Listener ����
public class HasAEvt implements ActionListener {

	// 2. ������ class ����
	private EvtDesign ed;

	// 3. ������ ��ü�� �ޱ� ���� ������ �ۼ�
	public HasAEvt(EvtDesign ed) { // has a ����
		this.ed = ed;
	}

	// 4. abstract method Override
	@Override
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ�� JButton���� �߻��ߴٸ�
		if (e.getSource() == ed.getJbtn()) {
			// JLabel�� ���ڸ� ����
			JLabel jlblOutputJLabel = ed.getJlbl();
			// Font class ����
			Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);
			// ������ font�� component�� ����
			jlblOutputJLabel.setFont(font);
//			jlblOutputJLabel.setForeground(Color.red); // Constant�� Foreground ����
			jlblOutputJLabel.setForeground(new Color(0x8041D9)); // Color class�� �����Ͽ� RGB��
			ed.getJbtn().setForeground(new Color(0x8041D9)); // Color class�� �����Ͽ� RGB��

			ed.getJtf().setBackground(Color.GRAY); // Constant�� Background ����
			// ������ �������� ���� Component�� �ٷ� ����
			jlblOutputJLabel.setOpaque(true); // ������ �����Ͽ� Color�� ���̵��� ����
			jlblOutputJLabel.setBackground(Color.blue);
		}
	}

}
