package day1126.hw;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JavaMemoInfo extends JDialog {

	private JavaMemo f;

	private JLabel fileName, version, developer, license, info, icon;
	private JButton closeButton;
	private ImageIcon image;

	public JavaMemoInfo(JavaMemo f) {
		super(f, "메모장 정보", true);
		this.f = f;
		fileName = new JLabel("자바메모장");
		version = new JLabel("Version 1.0");
		developer = new JLabel("제작자 : 박권익");
		license = new JLabel("License : PKI");
		info = new JLabel("<html>이 메모장은 자바로<br>만들어진 메모장으로<br>아무나 가져다 자유롭게<br>사용가능합니다.<html>");
		image = new ImageIcon("C:/dev/workspace/javase_prj/src/day1126/hw/206317274A5B3230B5.png");
		icon = new JLabel(image);
		closeButton = new JButton("닫기");

		setResizable(false);

		JavaMemoInfoEvt jmie = new JavaMemoInfoEvt(this);
		addWindowListener(jmie);
		closeButton.addActionListener(jmie);

		fileName.setBounds(getX() + 170, getY() + 25, 100, 30);
		version.setBounds(getX() + 170, getY() + 45, 100, 30);
		developer.setBounds(getX() + 170, getY() + 65, 100, 30);
		license.setBounds(getX() + 170, getY() + 85, 100, 30);
		info.setBounds(getX() + 170, getY() + 100, 150, 100);
		closeButton.setBounds(getX() + 125, getY() + 215, 80, 30);
		icon.setBounds(getX() + 25, getY() + 25, 100, 100);

		setLayout(null);

		add(fileName);
		add(version);
		add(developer);
		add(license);
		add(info);
		add(closeButton);
		add(icon);

		setBounds(f.getX() + 150, f.getY() + 100, 350, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public JavaMemo getF() {
		return f;
	}

	public JLabel getFileName() {
		return fileName;
	}

	public JLabel getVersion() {
		return version;
	}

	public JLabel getDeveloper() {
		return developer;
	}

	public JLabel getLicense() {
		return license;
	}

	public JLabel getInfo() {
		return info;
	}

	public JLabel getIcon() {
		return icon;
	}

	public JButton getCloseButton() {
		return closeButton;
	}

	public ImageIcon getImage() {
		return image;
	}

}
