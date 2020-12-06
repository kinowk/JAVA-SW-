package day1118;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ������ ���α׷���(Component Programming)
 * 
 * @author owner
 */

//1. ������ ������Ʈ�� ��ӹ޴´�.( ����ڿ��� �����ֱ� ����)
@SuppressWarnings("serial")
public class HelloAWT2 extends Frame {
	// 2. ������ �ۼ�
	public HelloAWT2() {
		super("Hello! AWT"); // �θ�Ŭ������ ������ ȣ��
		// 3. Component ����
		Button btn = new Button("���� ��ư");
		// 4. Component ��ġ
		add(btn);
		// 5. ������ ũ�� ����
		setSize(500, 400);
		// 6. �����츦 ����ڿ��� �����ֱ�
		setVisible(true);

//		������ �����̺�Ʈ ó��

//		addWindowListener(this); // WindowListener�� is a ���谡 �ƴϹǷ� this ����� �� ����. -> implements �� ���

//		anonymous inner class
//		WindowListener interface�� �̸� ������ class�� WindowAdapter class�� ����
//		WindowAdapter class�� WindowListener interface�� abstract method�� �Ϲ� method�� �����߱� ������ �ʿ��� method�� Override�ϸ� �ȴ�.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT2();
	}// main

}// class
