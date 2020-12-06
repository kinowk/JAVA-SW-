package day1125;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * ActionEvent�� ActionListener�� ó��
 * 
 * @author owner
 */

//1. Window Component ���
/**
 * @author owner
 *
 */
@SuppressWarnings("serial")
public class EvtDesign extends JFrame {
//2. �̺�Ʈ�� �߻����� �� ó���� Component�� instance variable�� ����
	private JButton jbtn;
	private JLabel jlbl;
	private JTextField jtf;

	// 3. default constructor, Component ����
	public EvtDesign() {
		super("ActionEvent ó��");
		jlbl = new JLabel("��� JLabel");
		jbtn = new JButton("Swing ��ư");
		jtf = new JTextField();

		// 4. �̺�Ʈó�� ��ü�� has a ����� ����
		HasAEvt hasA = new HasAEvt(this);
		// �̺�Ʈ ó�� ��ü���� �̺�Ʈ�� ó���� �� �ֵ��� ���
		jbtn.addActionListener(hasA); // HasAEvt���� �̺�Ʈ ó��

		// 5. ��ġ
		// ��ġ������(Layout Manager)�� ����Ͽ� Component�� ��ġ
		add(jbtn, BorderLayout.CENTER);
		add(jlbl, BorderLayout.NORTH);
		add(jtf, BorderLayout.SOUTH);
		// 5. Window�� ũ�� ����
		setSize(400, 200);

		// 6. Window Component�� User���� �����ֱ�
		setVisible(true);

		// 7. Window Component ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 8. �̺�Ʈ ó�� class���� Component�� ����� �� �ֵ��� getter method �ۼ�


	//	Alt + Shift + S
	public JButton getJbtn() {
		return jbtn;
	}// getJBtn

	public JLabel getJlbl() {
		return jlbl;
	}// getJlbl
	

	public JTextField getJtf() {
		return jtf;
	}

	public static void main(String[] args) {
		new EvtDesign();
	}

}
