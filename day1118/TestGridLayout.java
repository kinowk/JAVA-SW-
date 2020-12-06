package day1118;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout - ���ڷ��̾ƿ�<br>
 * rows, columns�� component size�� �����ϰ� �����Ǵ� layout<br>
 * rows, columns�� component�� ������ �ٸ� ��� rows�� ���� �ڵ� ��ġ
 * 
 * @author owner
 */
@SuppressWarnings("serial")
// 1. Window Component ���
public class TestGridLayout extends JFrame {

	// 2. default constructor
	public TestGridLayout() {
		super("GridLayout");

		// 3. Layout Manager
		setLayout(new GridLayout(3, 3)); // GridLayout(int rows, int cols)

		// 4.add - Component ��ġ
//		add(new JButton("1"));
//		add(new JButton("2"));
//		add(new JButton("3"));
//		add(new JButton("4"));
//		add(new JButton("5"));
//		add(new JButton("6"));
//		add(new JButton("7"));
//		add(new JButton("8"));
//		add(new JButton("9"));
//		add(new JButton("10"));

//		JButton[] arrJButton = new JButton[9];
//		for (int i = 0; i < arrJButton.length; i++) {
//			arrJButton[i] = new JButton(String.valueOf(i + 1));
////			arrJButton[i] = new JButton(Integer.toString(i + 1));
//			add(arrJButton[i]);
//		}
		
		List<JButton> list = new ArrayList<JButton>();
		for(int i = 1; i<10; i++) {
			list.add(new JButton(String.valueOf(i)));
		}
		for(int i = 0; i<list.size(); i++) {
			add(list.get(i));
		}
		
//		int jButtonNum = 9;
//		for (int i = 0; i < jButtonNum; i++) {
//			add(new JButton(Integer.toString(i + 1)));
//
//		}

		// 5. setSize - Window Component ũ�� ����
		setSize(400, 400);

		// 6. setVisible
		setVisible(true);

		// 7. setDefaultCloseOperation - Window Component �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestGridLayout();
	}

}
