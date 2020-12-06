package day1120;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame {

	public UseJTable() {
		super("Use JTable");

		// 3. Component ����
		// �÷����� �����ϴ� �������迭 ����
		String[] columnName = { "��ȣ", "�̸�", "����", "�̸���", "���" };
		// ���ڵ� ���� �����ϴ� �������迭 ����
		String[][] rowData = { { "1", "������", "25", "nam@test.com", "" }, { "2", "������", "27", "kim@test.com", "" },
				{ "3", "���ϱ�", "27", "jang@test.com", "" }, { "4", "������", "26", "park@test.com", "" } };
		// �����͸� ������ Model ��ü ����
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnName);
		// DefaultTableModel�� method�� ����Ͽ� ������ �߰�
		// Object[] ���
		String[] data = { "5", "�κ���", "27", "min@naver.com", "" };
		// Model ��ü�� ������ �߰�
		dtm.addRow(data);
		// Vector ���
		Vector<String> vector = new Vector<String>();
		vector.add("6");
		vector.add("�ſ���");
		vector.add("25");
		vector.add("shin@nate.com");
		vector.add("");
		// Model ��ü�� ������ �߰�
		dtm.addRow(vector);

		// �����͸� ������ View ��ü ����
		JTable jta = new JTable(dtm);

		// column�� �� ����
		jta.getColumnModel().getColumn(0).setPreferredWidth(80);
		jta.getColumnModel().getColumn(1).setPreferredWidth(120);
		jta.getColumnModel().getColumn(2).setPreferredWidth(80);
		jta.getColumnModel().getColumn(3).setPreferredWidth(220);

		// row�� ũ�� ����
		jta.setRowHeight(25);

		// ScrollBar ����
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("�л�����"));
		// ��ġ������ ����
		setLayout(new BorderLayout());

		// ��ġ
		add(jsp);

		setBounds(100, 100, 700, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJTable

	public static void main(String[] args) {
		new UseJTable();
	}// main

}// class
