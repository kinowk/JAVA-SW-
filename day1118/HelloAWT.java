package day1118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ������ ���α׷���(Component Programming)
 * 
 * @author owner
 */

//1. ������ ������Ʈ�� ��ӹ޴´�.( ����ڿ��� �����ֱ� ����)
@SuppressWarnings("serial")
public class HelloAWT extends Frame implements WindowListener {
	// 2. ������ �ۼ�
	public HelloAWT() {
		super("Hello! AWT"); // �θ�Ŭ������ ������ ȣ��
		// 3. Component ����
		Button btn = new Button("���� ��ư");
		// 4. Component ��ġ
		add(btn);
		// 5. ������ ũ�� ����
		setSize(500, 400);
		// 6. �����츦 ����ڿ��� �����ֱ�
		setVisible(true);

		// ������ �����̺�Ʈ ó��
		addWindowListener(this);
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT();
	}// main

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose(); // �θ�Ŭ������ Window�� ��쿡�� ��밡�� // ���� �����츦 ����
//		System.exit(0); // �������� JVM�� ������ �����ϴ� ��
		// 0 - false // ���������� - ���� ������ �۾��� �������� �ʰ� �ٷ� ����
		// 1 - true // �������� - ���� ������ �۾��� ������ �� ����
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}// class
