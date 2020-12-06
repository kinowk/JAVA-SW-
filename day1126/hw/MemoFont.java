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
		super(javaMemo, "�۲�", true);
		this.javaMemo = javaMemo;
		labelFont = new JLabel("�۲�");
		textField1 = new JTextField();
		fontListModel = new DefaultListModel<String>();
		// Dialog, DialogInput, Serif, SansSerif, Monospaced
		fontListModel.addElement("Dialog");
		fontListModel.addElement("DialogInput");
		fontListModel.addElement("Serif");
		fontListModel.addElement("SansSerif");
		fontListModel.addElement("Monospaced");
		fontList = new JList<String>(fontListModel); // View��ü ����
		JScrollPane scrollFont = new JScrollPane(fontList); // ScrollBar

		labelStyle = new JLabel("��Ÿ��");
		textField2 = new JTextField();
		styleListModel = new DefaultListModel<String>(); // Model��ü ����
		// ����, ����, ����Ӳ�, ��������Ӳ�
		styleListModel.addElement("����"); // PLAIN
		styleListModel.addElement("����"); // BOLD
		styleListModel.addElement("����ϲ�"); // ITALIC
		styleListModel.addElement("��������Ӳ�"); // BOLD+ITALIC
		styleList = new JList<String>(styleListModel); // View��ü ����
		JScrollPane scrollStyle = new JScrollPane(styleList); // ScrollBar

		labelSize = new JLabel("ũ��");
		textField3 = new JTextField();
		sizeListModel = new DefaultListModel<String>(); // Model��ü ����
		// 8, ., . 100
		for (int i = MIN_SIZE; i < MAX_SIZE + 1; i += 2) {
			sizeListModel.addElement(String.valueOf(i));
		}
		sizeList = new JList<String>(sizeListModel); // View��ü ����
		JScrollPane scrollSize = new JScrollPane(sizeList); // ScrollBar

		Font basicFont = javaMemo.getTextArea().getFont();
//		Font fontBasic = new Font(basicFont, basicStyle, basicSize);
		labelPreview = new JLabel("AaBbYyZz");
		labelPreview.setBorder(new TitledBorder("�̸�����"));
		labelPreview.setFont(basicFont);
		labelPreview.setHorizontalAlignment(JLabel.CENTER);

		labelScript = new JLabel("��ũ��Ʈ");
		String[] language = { "����", "�ѱ�" };
		comboBoxModel = new DefaultComboBoxModel<String>(language); // Model��ü ����
		// comboBoxModel.addElement("����");
		// comboBoxModel.addElement("�ѱ�");
		comboBoxScript = new JComboBox<String>(comboBoxModel);

		applyButton = new JButton("����");
		closeButton = new JButton("�ݱ�");

		MemoFontEvt mfe = new MemoFontEvt(this);

		fontList.addMouseListener(mfe);
		styleList.addMouseListener(mfe);
		sizeList.addMouseListener(mfe);

		comboBoxScript.addMouseListener(mfe);

		applyButton.addMouseListener(mfe);
		closeButton.addMouseListener(mfe);

		setLayout(null); // ������ġ

		// �۲�
		labelFont.setBounds(60, 25, 80, 25);
		textField1.setBounds(60, 50, 95, 25);
		scrollFont.setBounds(60, 80, 95, 130);

		// �۲� ��Ÿ��
		labelStyle.setBounds(200, 25, 80, 25);
		textField2.setBounds(200, 50, 95, 25);
		scrollStyle.setBounds(200, 80, 95, 130);

		// ũ��
		labelSize.setBounds(350, 25, 80, 25);
		textField3.setBounds(350, 50, 95, 25);
		scrollSize.setBounds(350, 80, 95, 130);

		// ����
		labelPreview.setBounds(255, 250, 200, 50);

		// ��ũ��Ʈ
		labelScript.setBounds(260, 290, 200, 50);
		comboBoxScript.setBounds(260, 330, 80, 30);

		applyButton.setBounds(290, 400, 80, 30);
		closeButton.setBounds(380, 400, 80, 30);

		// �۲� ��ġ
		add(labelFont);
		add(textField1);
		add(scrollFont);

		// �۲� ��Ÿ�� ��ġ
		add(labelStyle);
		add(textField2);
		add(scrollStyle);

		// ũ�� ��ġ
		add(labelSize);
		add(textField3);
		add(scrollSize);

		// ���� ��ġ
		add(labelPreview);

		// ��ũ��Ʈ ��ġ
		add(labelScript);
		add(comboBoxScript);

		// ��ư ��ġ
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
