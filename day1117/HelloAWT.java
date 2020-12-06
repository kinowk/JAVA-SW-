package day1117;

import java.awt.Button;
import java.awt.Frame;

/**
 * ������ ���α׷���(Component Programming)
 * 
 * @author owner
 */

//1. ������ ������Ʈ�� ��ӹ޴´�.( ����ڿ��� �����ֱ� ����)
@SuppressWarnings("serial")
public class HelloAWT extends Frame {
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
	} // HelloAWT

	public static void main(String[] args) {
		new HelloAWT();
	}// main

}// class
