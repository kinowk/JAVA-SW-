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
		super("�۲�");

		JLabel labelFont = new JLabel("�۲�");
		JTextField textField1 = new JTextField();
		DefaultListModel<String> listModelFont = new DefaultListModel<String>();
		// Dialog, DialogInput, Serif, SansSerif, Monospaced
		listModelFont.addElement("Dialog");
		listModelFont.addElement("DialogInput");
		listModelFont.addElement("Serif");
		listModelFont.addElement("SansSerif");
		listModelFont.addElement("Monospaced");
		JList<String> font = new JList<String>(listModelFont); // View��ü ����
		JScrollPane scrollFont = new JScrollPane(font); // ScrollBar

		JLabel labelStyle = new JLabel("��Ÿ��");
		JTextField textField2 = new JTextField();
		DefaultListModel<String> listModelStyle = new DefaultListModel<String>(); // Model��ü ����
		// ����, ����, ����Ӳ�, ��������Ӳ�
		listModelStyle.addElement("����");
		listModelStyle.addElement("����");
		listModelStyle.addElement("����ϲ�");
		listModelStyle.addElement("��������Ӳ�");
		JList<String> style = new JList<String>(listModelStyle); // View��ü ����
		JScrollPane scrollStyle = new JScrollPane(style); // ScrollBar

		JLabel labelSize = new JLabel("ũ��");
		JTextField textField3 = new JTextField();
		DefaultListModel<String> listModelSize = new DefaultListModel<String>(); // Model��ü ����
		// 8, ., . 100
		for (int i = MIN_SIZE; i < MAX_SIZE + 1; i += 2) {
			listModelSize.addElement(String.valueOf(i));
		}
		JList<String> size = new JList<String>(listModelSize); // View��ü ����
		JScrollPane scrollSize = new JScrollPane(size); // ScrollBar

		JLabel labelpreview = new JLabel("AaBbYyZz");
		labelpreview.setBorder(new TitledBorder("�̸�����"));

		JLabel labelScript = new JLabel("��ũ��Ʈ");
		String[] language = { "����", "�ѱ�" };
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>(language); // Model��ü ����
		// comboBoxModel.addElement("����");
		// comboBoxModel.addElement("�ѱ�");
		JComboBox<String> comboBoxScript = new JComboBox<String>(comboBoxModel);

		JButton buttonApply = new JButton("����");
		JButton buttonClose = new JButton("�ݱ�");

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
		labelpreview.setBounds(255, 250, 200, 50);

		// ��ũ��Ʈ
		labelScript.setBounds(260, 290, 200, 50);
		comboBoxScript.setBounds(260, 330, 80, 30);

		buttonApply.setBounds(290, 400, 80, 30);
		buttonClose.setBounds(380, 400, 80, 30);

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
		add(labelpreview);

		// ��ũ��Ʈ ��ġ
		add(labelScript);
		add(comboBoxScript);

		// ��ư ��ġ
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
