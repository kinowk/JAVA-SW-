package day1126;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseListSelectioknEvt extends JFrame implements ListSelectionListener {

	private DefaultListModel<String> dlmFriends;
	private DefaultListModel<String> dlmBlockFriends;
	private JList<String> jlFriends;
	private JList<String> jlBlockFriends;

	public UseListSelectioknEvt() {
		super("Use JList");
		// Component ����
		// �����͸� ���� Model Class�� ��ü ����
		dlmFriends = new DefaultListModel<String>();
		dlmBlockFriends = new DefaultListModel<String>();

		// �� ����
		dlmFriends.addElement("���̾�");
		dlmFriends.addElement("����");
		dlmFriends.addElement("����ġ");
		dlmFriends.addElement("������");

		dlmBlockFriends.addElement("����");
		dlmBlockFriends.addElement("�ڴ�");

		// �����͸� ������ �� �ִ� View ��ü ����
		jlFriends = new JList<String>(dlmFriends);
		jlBlockFriends = new JList<String>(dlmBlockFriends);

		// JList���� �߻��Ǵ� �̺�Ʈ�� ó���ϱ����ؼ� �̺�Ʈ�� ����ϰ�, �̺�Ʈ�� ó���� ��ü�� �־��ش�
		jlFriends.addListSelectionListener(this);
		jlBlockFriends.addListSelectionListener(this);

		// ScrollBar ����
		JScrollPane jspFriends = new JScrollPane(jlFriends);
		JScrollPane jspBlockFriends = new JScrollPane(jlBlockFriends);

		// setBorder(Border border) - Component�� TitledBorder ����
		jspFriends.setBorder(new TitledBorder("ģ�����"));
		jspBlockFriends.setBorder(new TitledBorder("���ܸ��"));
		// ��ġ
		setLayout(new GridLayout(1, 2));

		add(jspFriends);
		add(jspBlockFriends);
//		add(jlFriends); // JList�� ScrollBar�� ����.
//		add(jlBlockFriends);

		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseList

	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// method�� �� �� ȣ������� ����� �� �� �� ����� �� �ֵ���
		if(flag) {
		System.out.println(dlmFriends.get(jlFriends.getSelectedIndex()));
		}
		flag = !flag;
	}

	public static void main(String[] args) {
		new UseListSelectioknEvt();
	}// main

}// class
