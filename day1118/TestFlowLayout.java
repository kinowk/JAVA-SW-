package day1118;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FlowLayout - �帧���̾ƿ�<br>
 * ������Ʈ�� ����ũ�⸦ �����ϰ�, ������� ��ġ�ȴ�.<br>
 * Window�� ũ�Ⱑ �ٰų� �þ�� Component�� ��ġ�� �˸°� �̵��Ѵ�.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
//1. Window Component ���
public class TestFlowLayout extends JFrame {

	// 2.default constructor
	public TestFlowLayout() {
		super("FlowLayout");

		// 3. Component ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(10);
		JLabel jlblAge = new JLabel("����");

		Integer[] arrAge = new Integer[100];
		for (int i = 0; i < arrAge.length; i++) {
			arrAge[i] = i + 1;
		}
		JComboBox<Integer> jcbAge = new JComboBox<Integer>(arrAge);
		
		JButton jbtn = new JButton("�Է�");
		
		// 4. ��ġ������ ���� - BorderLayout -> FlowLayout
		setLayout(new FlowLayout());

		// 5.Component ��ġ
		add(jlblName);
		add(jtfName);
		add(jlblAge);
		add(jcbAge);
		add(jbtn);

//		add(new JLabel("�̸�"));
//		add(new JTextField(10));
//		add(new JLabel("����"));
//		add(new JComboBox<Integer>(arrAge));
//		add(new JButton("�Է�"));
		
		// 6.Window ũ�� ����
		setSize(600, 400);
		// 7. User ����
		setVisible(true);
		// 8. Window �����̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestFlowLayout();
	}

}
