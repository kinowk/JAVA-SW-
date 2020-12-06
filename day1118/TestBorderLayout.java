package day1118;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * BorderLayout - ��� ���̾ƿ�<br>
 * Component�� ����ũ�Ⱑ ���õǰ� ��ġ�Ǵ� ��ġ�� ũ�⿡ �°� ����Ǵ� Layout<br>
 * �ϳ��� �������� �ϳ��� Component�� ��ġ ����<br>
 * Window Component�� �⺻ Layout
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component ���
public class TestBorderLayout extends JFrame {
	// 2. default constructor
	public TestBorderLayout() {
		super("BorderLayout�� ����");
		// 3.Component ����
		JButton jbtnNorth = new JButton("North");
		JButton jbtnEast = new JButton("East");
		JTextField jtfSouth = new JTextField("South");
		JLabel jlWest = new JLabel("West");
		JTextArea jtCenter = new JTextArea("Center");
		// 4. ��ġ������ ����
//		setLayout(new BorderLayout()); //JFrame �⺻ ���̾ƿ� - BorderLayout

		// 5. Component ��ġ
		// ���ڿ� ����� ������Ʈ�� ��ġ�Ǵ� ��ġ�� ������ �� �ִ�.
		add("Center", jtCenter); // add(jtCenter, BorderLayout.CENTER);
		add("North", jbtnNorth); // add(jbtnNorth, BorderLayout.NORTH); // add(jbtnNorth, "North");

		// BorderLayout�� constant�� component�� ��ġ�Ǵ� ��ġ�� ������ �� �ִ�.
		add(BorderLayout.WEST, jlWest);
		add(BorderLayout.SOUTH, jtfSouth);
		add(jbtnEast, BorderLayout.EAST);

		// 6. Window ũ�� ����
		setSize(500, 500);
		// 7. User����
		setVisible(true);
		// 8.Window ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestBorderLayout();
	}

}
