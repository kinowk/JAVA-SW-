package day1126;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseEvt extends JFrame {

	private DefaultListModel<String> dlmFriends;
	private DefaultListModel<String> dlmBlockFriends;
	private JList<String> jlFriends;
	private JList<String> jlBlockFriends;

	public UseMouseEvt() {
		super("Use JList");
		// Component 생성
		// 데이터를 가진 Model Class로 객체 생성
		dlmFriends = new DefaultListModel<String>();
		dlmBlockFriends = new DefaultListModel<String>();

		// 값 설정
		dlmFriends.addElement("라이언");
		dlmFriends.addElement("무지");
		dlmFriends.addElement("어피치");
		dlmFriends.addElement("제이지");

		dlmBlockFriends.addElement("브라운");
		dlmBlockFriends.addElement("코니");

		// 데이터를 보여줄 수 있는 View 객체 생성
		jlFriends = new JList<String>(dlmFriends);
		jlBlockFriends = new JList<String>(dlmBlockFriends);

		// Mouse에서 발생되는 이벤트를 처리하기위해서 이벤트에 등록하고, 이벤트에 처리할 객체를 넣어준다
		jlFriends.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println(dlmFriends.get(jlFriends.getSelectedIndex()));
				}
			}

		});
		// ScrollBar 설정
		JScrollPane jspFriends = new JScrollPane(jlFriends);
		JScrollPane jspBlockFriends = new JScrollPane(jlBlockFriends);

		// setBorder(Border border) - Component에 TitledBorder 설정
		jspFriends.setBorder(new TitledBorder("친구목록"));
		jspBlockFriends.setBorder(new TitledBorder("차단목록"));
		// 배치
		setLayout(new GridLayout(1, 2));

		add(jspFriends);
		add(jspBlockFriends);
//		add(jlFriends); // JList는 ScrollBar가 없다.
//		add(jlBlockFriends);

		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseList

	public static void main(String[] args) {
		new UseMouseEvt();
	}// main

}// class
