package day1118;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing - AWT���� ���� Window Application�� ������ �� �ִ�.
 * 
 * @author owner
 */

//1. javax.swing.JFrame ���
@SuppressWarnings("serial")
public class UseSwing extends JFrame {

	// 2. default constructor
	public UseSwing() {
		super("JFrame�� ����Ͽ� Window Applicaiont ����");
		// 3. Component ����
		Button button = new Button("AWT ��ư");
		JButton jbutton = new JButton("Swing ��ư");

		// 4. ��ġ(Component�� ����)
		// ��ġ������(Layout Manager)�� ����Ͽ� Component�� ��ġ
		setLayout(new GridLayout(1, 2)); // GridLayout(int rows, int cols) - 1�� 2��
		add(button); // 0�� 0��
		add(jbutton); // 0�� 1��

		// 5. Window�� ũ�� ����
		setSize(400, 200);

		// 6. Window Component�� User���� �����ֱ�
		setVisible(true);

		// 7. Window Component ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
	}

	public static void main(String[] args) {
		new UseSwing();
	}

}
