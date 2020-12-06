package day1126.hw;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MemoFont extends JDialog {

	private static final int MIN_SIZE = 8;
	private static final int MAX_SIZE = 100;

//	public static final String basicFont = Font.DIALOG;
//	public static final int basicStyle = Font.PLAIN;
//	public static final int basicSize = 12;

	private JavaMemo javaMemo;

	private JLabel labelFont, labelStyle, labelSize, labelPreview, labelScript;
	private JTextField textField1, textField2, textField3;
	private DefaultListModel<String> fontListModel, styleListModel, sizeListModel;
	private JList<String> fontList, styleList, sizeList;
	private DefaultComboBoxModel<String> comboBoxModel;
	private JComboBox<String> comboBoxScript;
	private JButton applyButton, closeButton;

	public MemoFont(JavaMemo javaMemo) {
		super(javaMemo, "글꼴", true);
		this.javaMemo = javaMemo;
		labelFont = new JLabel("글꼴");
		textField1 = new JTextField();
		fontListModel = new DefaultListModel<String>();
		// Dialog, DialogInput, Serif, SansSerif, Monospaced
		fontListModel.addElement("Dialog");
		fontListModel.addElement("DialogInput");
		fontListModel.addElement("Serif");
		fontListModel.addElement("SansSerif");
		fontListModel.addElement("Monospaced");
		fontList = new JList<String>(fontListModel); // View객체 생성
		JScrollPane scrollFont = new JScrollPane(fontList); // ScrollBar

		labelStyle = new JLabel("스타일");
		textField2 = new JTextField();
		styleListModel = new DefaultListModel<String>(); // Model객체 생성
		// 보통, 굵게, 기울임꼴, 굵은기울임꼴
		styleListModel.addElement("보통"); // PLAIN
		styleListModel.addElement("굵게"); // BOLD
		styleListModel.addElement("기움일꼴"); // ITALIC
		styleListModel.addElement("굵은기울임꼴"); // BOLD+ITALIC
		styleList = new JList<String>(styleListModel); // View객체 생성
		JScrollPane scrollStyle = new JScrollPane(styleList); // ScrollBar

		labelSize = new JLabel("크기");
		textField3 = new JTextField();
		sizeListModel = new DefaultListModel<String>(); // Model객체 생성
		// 8, ., . 100
		for (int i = MIN_SIZE; i < MAX_SIZE + 1; i += 2) {
			sizeListModel.addElement(String.valueOf(i));
		}
		sizeList = new JList<String>(sizeListModel); // View객체 생성
		JScrollPane scrollSize = new JScrollPane(sizeList); // ScrollBar

		Font basicFont = javaMemo.getTextArea().getFont();
//		Font fontBasic = new Font(basicFont, basicStyle, basicSize);
		labelPreview = new JLabel("AaBbYyZz");
		labelPreview.setBorder(new TitledBorder("미리보기"));
		labelPreview.setFont(basicFont);
		labelPreview.setHorizontalAlignment(JLabel.CENTER);

		labelScript = new JLabel("스크립트");
		String[] language = { "영어", "한글" };
		comboBoxModel = new DefaultComboBoxModel<String>(language); // Model객체 생성
		// comboBoxModel.addElement("영어");
		// comboBoxModel.addElement("한글");
		comboBoxScript = new JComboBox<String>(comboBoxModel);

		applyButton = new JButton("적용");
		closeButton = new JButton("닫기");

		MemoFontEvt mfe = new MemoFontEvt(this);

		fontList.addMouseListener(mfe);
		styleList.addMouseListener(mfe);
		sizeList.addMouseListener(mfe);

		comboBoxScript.addMouseListener(mfe);

		applyButton.addMouseListener(mfe);
		closeButton.addMouseListener(mfe);

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
		labelPreview.setBounds(255, 250, 200, 50);

		// 스크립트
		labelScript.setBounds(260, 290, 200, 50);
		comboBoxScript.setBounds(260, 330, 80, 30);

		applyButton.setBounds(290, 400, 80, 30);
		closeButton.setBounds(380, 400, 80, 30);

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
		add(labelPreview);

		// 스크립트 배치
		add(labelScript);
		add(comboBoxScript);

		// 버튼 배치
		add(applyButton);
		add(closeButton);

		setBounds(javaMemo.getX() + 100, javaMemo.getY() + 75, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static int getMinSize() {
		return MIN_SIZE;
	}

	public static int getMaxSize() {
		return MAX_SIZE;
	}

	public JavaMemo getJavaMemo() {
		return javaMemo;
	}

	public JLabel getLabelFont() {
		return labelFont;
	}

	public JLabel getLabelStyle() {
		return labelStyle;
	}

	public JLabel getLabelPreview() {
		return labelPreview;
	}

	public JLabel getLabelSize() {
		return labelSize;
	}

	public JLabel getLabelScript() {
		return labelScript;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public JTextField getTextField3() {
		return textField3;
	}

	public DefaultListModel<String> getFontListModel() {
		return fontListModel;
	}

	public DefaultListModel<String> getStyleListModel() {
		return styleListModel;
	}

	public DefaultListModel<String> getSizeListModel() {
		return sizeListModel;
	}

	public DefaultComboBoxModel<String> getComboBoxModel() {
		return comboBoxModel;
	}

	public JButton getApplyButton() {
		return applyButton;
	}

	public JButton getCloseButton() {
		return closeButton;
	}

	public JList<String> getFontList() {
		return fontList;
	}

	public JList<String> getStyleList() {
		return styleList;
	}

	public JList<String> getSizeList() {
		return sizeList;
	}

	public JComboBox<String> getComboBoxScript() {
		return comboBoxScript;
	}

}
