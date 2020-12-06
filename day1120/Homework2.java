package day1120;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Homework2 extends JFrame {

	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 100;

	public Homework2() {
		super("글꼴");

		JLabel labelFont = new JLabel("글꼴");
		JTextField textField1 = new JTextField();
		DefaultListModel<String> listModelFont = new DefaultListModel<String>();
		// Dialog, DialogInput, Serif, SansSerif, Monospaced
		listModelFont.addElement("Dialog");
		listModelFont.addElement("DialogInput");
		listModelFont.addElement("Serif");
		listModelFont.addElement("SansSerif");
		listModelFont.addElement("Monospaced");
		JList<String> font = new JList<String>(listModelFont); // View객체 생성
		JScrollPane scrollFont = new JScrollPane(font); // ScrollBar

		JLabel labelStyle = new JLabel("스타일");
		JTextField textField2 = new JTextField();
		DefaultListModel<String> listModelStyle = new DefaultListModel<String>(); // Model객체 생성
		// 보통, 굵게, 기울임꼴, 굵은기울임꼴
		listModelStyle.addElement("보통");
		listModelStyle.addElement("굵게");
		listModelStyle.addElement("기움일꼴");
		listModelStyle.addElement("굵은기울임꼴");
		JList<String> style = new JList<String>(listModelStyle); // View객체 생성
		JScrollPane scrollStyle = new JScrollPane(style); // ScrollBar

		JLabel labelSize = new JLabel("크기");
		JTextField textField3 = new JTextField();
		DefaultListModel<String> listModelSize = new DefaultListModel<String>(); // Model객체 생성
		// 8, ., . 100
		for (int i = MIN_SIZE; i < MAX_SIZE + 1; i += 2) {
			listModelSize.addElement(String.valueOf(i));
		}
		JList<String> size = new JList<String>(listModelSize); // View객체 생성
		JScrollPane scrollSize = new JScrollPane(size); // ScrollBar

		JLabel labelpreview = new JLabel("AaBbYyZz");
		labelpreview.setBorder(new TitledBorder("미리보기"));

		JLabel labelScript = new JLabel("스크립트");
		String[] language = { "영어", "한글" };
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>(language); // Model객체 생성
		// comboBoxModel.addElement("영어");
		// comboBoxModel.addElement("한글");
		JComboBox<String> comboBoxScript = new JComboBox<String>(comboBoxModel);

		JButton buttonApply = new JButton("적용");
		JButton buttonClose = new JButton("닫기");

		setLayout(null); // 수동배치

		// 글꼴
		labelFont.setBounds(60, 25, 80, 25);
		textField1.setBounds(60, 50, 95, 25);
		scrollFont.setBounds(60, 80, 95, 130);

		// 글꼴 스타일
		labelStyle.setBounds(200, 25, 80, 25);
		textField2.setBounds(200, 50, 95, 25);
		scrollStyle.setBounds(200, 80, 95, 130);

		// 크기
		labelSize.setBounds(350, 25, 80, 25);
		textField3.setBounds(350, 50, 95, 25);
		scrollSize.setBounds(350, 80, 95, 130);

		// 보기
		labelpreview.setBounds(255, 250, 200, 50);

		// 스크립트
		labelScript.setBounds(260, 290, 200, 50);
		comboBoxScript.setBounds(260, 330, 80, 30);

		buttonApply.setBounds(290, 400, 80, 30);
		buttonClose.setBounds(380, 400, 80, 30);

		// 글꼴 배치
		add(labelFont);
		add(textField1);
		add(scrollFont);

		// 글꼴 스타일 배치
		add(labelStyle);
		add(textField2);
		add(scrollStyle);

		// 크기 배치
		add(labelSize);
		add(textField3);
		add(scrollSize);

		// 보기 배치
		add(labelpreview);

		// 스크립트 배치
		add(labelScript);
		add(comboBoxScript);

		// 버튼 배치
		add(buttonApply);
		add(buttonClose);

		setBounds(200, 200, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Homework2();
	}

}
