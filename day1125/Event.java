package day1125;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Event implements ActionListener {
	private Design d;

	public Event(Design d) {
		this.d = d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == d.getId()) {
			if (d.getId().getText().equals("")) {
				JOptionPane.showMessageDialog(d, "���̵� �ʼ� �Է�");
			} else {
				d.getPw().requestFocus();
			}
		}
		if (e.getSource() == d.getPw()) {
			if (d.getId().getText().equals("")) {
				JOptionPane.showMessageDialog(d, "���̵� �ʼ� �Է�");
			} else if (String.copyValueOf(d.getPw().getPassword()).equals("")) {
				JOptionPane.showMessageDialog(d, "��й�ȣ �ʼ� �Է�");
			} else {
				String id = d.getId().getText();
				String pw = String.valueOf(d.getPw().getPassword());
				Font font = new Font(Font.SERIF, Font.BOLD, 25);
				d.getLabel().setFont(font);
				d.getLabel().setForeground(new Color(0x8041D9));
				d.getLabel().setText("ID : " + id + "  " + "Password : " + pw);

			}
		}
	}

}
