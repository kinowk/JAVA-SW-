package day1119;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Homework extends JFrame {

	public Homework() {
		super("주소록");

		JLabel labelName = new JLabel("이름");
		JLabel labelAge = new JLabel("나이");
		JLabel labelGender = new JLabel("성별");
		JLabel labelAddress = new JLabel("주소");
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JTextArea textArea = new JTextArea();
		JButton inputButton = new JButton("입력");
		JButton updateButton = new JButton("변경");
		JButton deleteButton = new JButton("삭제");
		JButton searchButton = new JButton("검색");
		JButton closeButton = new JButton("닫기");

		textArea.setLineWrap(true); // 자동 줄 바꿈
		textArea.setWrapStyleWord(true); // 단어 보호(띄어쓰기)
//		Sets the style of wrapping used if the text area is wrapping lines
		JScrollPane scrollPane = new JScrollPane(textArea); // ScrollBarr

		JRadioButton radioBtnM = new JRadioButton("남자");
		JRadioButton radioBtnW = new JRadioButton("여자");

		ButtonGroup bg = new ButtonGroup(); // 하나만 선택할 수 있게 ButtonGroup에 추가
		bg.add(radioBtnM);
		bg.add(radioBtnW);

		JPanel panel = new JPanel();
		panel.add(inputButton);
		panel.add(updateButton);
		panel.add(deleteButton);
		panel.add(searchButton);
		panel.add(closeButton);

		setLayout(null); // 수동배치

		// setBounds(int x, int y, int width, int height)
		labelName.setBounds(50, 30, 80, 25);
		labelAge.setBounds(50, 60, 80, 25);
		labelGender.setBounds(50, 90, 80, 25);
		labelAddress.setBounds(50, 120, 80, 25);
		textField1.setBounds(100, 30, 100, 25);
		textField2.setBounds(100, 60, 100, 25);
		radioBtnM.setBounds(100, 90, 50, 25); // JRadioButton - ButtonGroup이 아닌 JRadioButton 설정
		radioBtnW.setBounds(150, 90, 50, 25);
		textField3.setBounds(100, 120, 100, 25);
		scrollPane.setBounds(250, 30, 300, 150); // JScrollPane
		panel.setBounds(130, 200, 320, 30); // JPanel

		add(labelName);
		add(labelAge);
		add(labelGender);
		add(labelAddress);
		add(textField1);
		add(textField2);
		add(radioBtnM);
		add(radioBtnW);
		add(textField3);
		add(scrollPane);
		add(panel);

		setBounds(200, 200, 600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Homework();
	}

}
