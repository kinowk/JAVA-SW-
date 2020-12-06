package day1125;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseWindowAdapter extends JFrame {

	public UseWindowAdapter() {
		super("Adapter class ����ϴ� ����");

		// has a ���� ����
		EvtWindowHasA ewha = new EvtWindowHasA(this);
		// ������ �̺�Ʈ ó��
//		addWindowListener(ewha);

		// ����ó���� �ڵ尡 �ſ� ���� ������ �ܺ� class�� ���� �ʿ䰡 ����.
		// class�� ������ �ʰ� anonymous inner class�� �ۼ�
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		setBounds(100, 100, 200, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new UseWindowAdapter();
	}

}
