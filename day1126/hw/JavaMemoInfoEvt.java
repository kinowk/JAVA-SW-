package day1126.hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaMemoInfoEvt extends WindowAdapter implements ActionListener {

	private JavaMemoInfo jmi;

	public JavaMemoInfoEvt(JavaMemoInfo jmi) {
		this.jmi = jmi;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		jmi.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jmi.getCloseButton()) {
			jmi.dispose();
		}
	}

}
