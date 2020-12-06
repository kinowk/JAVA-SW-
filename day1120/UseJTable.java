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

		// 3. Component 생성
		// 컬럼명을 저장하는 일차원배열 생성
		String[] columnName = { "번호", "이름", "나이", "이메일", "비고" };
		// 레코드 값을 저장하는 이차원배열 생성
		String[][] rowData = { { "1", "남혜진", "25", "nam@test.com", "" }, { "2", "김현규", "27", "kim@test.com", "" },
				{ "3", "장일규", "27", "jang@test.com", "" }, { "4", "박지원", "26", "park@test.com", "" } };
		// 데이터를 저장할 Model 객체 생성
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnName);
		// DefaultTableModel의 method를 사용하여 데이터 추가
		// Object[] 사용
		String[] data = { "5", "민병권", "27", "min@naver.com", "" };
		// Model 객체에 데이터 추가
		dtm.addRow(data);
		// Vector 사용
		Vector<String> vector = new Vector<String>();
		vector.add("6");
		vector.add("신용주");
		vector.add("25");
		vector.add("shin@nate.com");
		vector.add("");
		// Model 객체에 데이터 추가
		dtm.addRow(vector);

		// 데이터를 보여줄 View 객체 생성
		JTable jta = new JTable(dtm);

		// column의 폭 설정
		jta.getColumnModel().getColumn(0).setPreferredWidth(80);
		jta.getColumnModel().getColumn(1).setPreferredWidth(120);
		jta.getColumnModel().getColumn(2).setPreferredWidth(80);
		jta.getColumnModel().getColumn(3).setPreferredWidth(220);

		// row의 크기 설정
		jta.setRowHeight(25);

		// ScrollBar 설정
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("학생정보"));
		// 배치관리자 설정
		setLayout(new BorderLayout());

		// 배치
		add(jsp);

		setBounds(100, 100, 700, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJTable

	public static void main(String[] args) {
		new UseJTable();
	}// main

}// class
