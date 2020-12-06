package day1126;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * JDialog - ����â���� ����ϴ� �ΰ����� ����� �����ϴ� â
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseChild extends JDialog {

	private JButton jbtn;
	private JLabel jlbl;

	public UseChild(UseParent up) {
		super(up, "JDialog �ΰ����� ���", true);
		jbtn = new JButton("��ư");
		jlbl = new JLabel("JDialog�� �θ�â���� �ʿ��� �ΰ����� ����� �����մϴ�.");

		jlbl.setBorder(new TitledBorder("�޼���"));

		// �̺�Ʈ ó�� ��ü�� �����ϰ� has a ���� ����
		ChildEvt ce = new ChildEvt(this);
		jbtn.addActionListener(ce);
		addWindowListener(ce);

		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);

		add(jlbl, BorderLayout.CENTER);
		add(jpSouth, BorderLayout.SOUTH);

		// Dialog ��ǥ�� �������� �θ�â�� �»���� �Ǿ���Ѵ�.
		setBounds(up.getX() + 300, up.getY() + 130, 300, 300);
		setVisible(true);

	}

	public JButton getJbtn() {
		return jbtn;
	}

	public JLabel getJlbl() {
		return jlbl;
	}

}
