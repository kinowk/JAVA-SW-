package day1120;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * JComboBox - java.awt 에서 Chioce 객체로 사용할 수 있다.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJCombo extends JFrame {

	public UseJCombo() {
		super();
		JLabel jlblEmail = new JLabel("이메일");
		JTextField jtfEmail = new JTextField(15);
		JLabel jlblEmailAt = new JLabel("@");

		// Model 객체 생성
		String[] tempDomain = { "gmail.ocom", "daum.net", "naver.com", "nate.com" };
		DefaultComboBoxModel<String> dcbmDomain = new DefaultComboBoxModel<String>(tempDomain);// Model객체를 생성하면서 데이터를 추가

		// Model에 데이터를 추가
		dcbmDomain.addElement("hotmail.com");

		// View 객체 생성 후, Model 객체와 관계 설정 - has a 관계
		JComboBox<String> jcbDomain = new JComboBox<String>(dcbmDomain);

		// Layout Manager 설정
		setLayout(new FlowLayout()); // BorderLayout -> FlowLayout

		add(jlblEmail);
		add(jtfEmail);
		add(jlblEmailAt);
		add(jcbDomain);

		// 크기설정
		setBounds(200, 100, 400, 100);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseJCombo

	public static void main(String[] args) {
		new UseJCombo();
	}// main

}// class
