package day1125;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Design extends JFrame {
	private JTextField id;
	private JPasswordField pw;
	private JLabel label;

	public Design() {
		id = new JTextField();
		pw = new JPasswordField();
		label = new JLabel();
		id.setBorder(new TitledBorder("아이디"));
		pw.setBorder(new TitledBorder("비밀번호"));
		label.setBorder(new TitledBorder("출력"));

		Event e = new Event(this);
		id.addActionListener(e);
		pw.addActionListener(e);

		setLayout(null);
		id.setBounds(30, 40, 500, 50);
		pw.setBounds(30, 100, 500, 50);
		label.setBounds(30, 160, 500, 150);

		add(id);
		add(pw);
		add(label);


		setBounds(100, 100, 600, 500);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

		});
	}

	public JTextField getId() {
		return id;
	}

	public JPasswordField getPw() {
		return pw;
	}

	public JLabel getLabel() {
		return label;
	}

	public static void main(String[] args) {
		new Design();
	}
}
