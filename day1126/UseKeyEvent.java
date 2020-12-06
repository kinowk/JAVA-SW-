package day1126;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * KeyEvent - Ű���尡 ������ �� �߻��ϴ� �̺�Ʈ ó��
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseKeyEvent extends JFrame implements KeyListener {
	private JTextField jtf;
	private JTextArea jta;

	public UseKeyEvent() {
		super("Ű���� �̺�Ʈ ó��");
		jtf = new JTextField();
		jta = new JTextArea();

		jtf.addKeyListener(this);

		JScrollPane jsp = new JScrollPane(jta);

		jtf.setBorder(new TitledBorder("�ƹ�Ű�� �����ּ���."));
		jsp.setBorder(new LineBorder(Color.red));

		add(jtf, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("2. KeyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("1. keyPressed");
		jta.append(e.getKeyCode() + " / " + e.getKeyChar() + "\n");

		int x = getX();
		int y = getY();

		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			x -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			x += 10;
			break;
		case KeyEvent.VK_UP:
			y -= 10;
			break;
		case KeyEvent.VK_DOWN:
			y += 10;
			break;
		case KeyEvent.VK_ESCAPE:
			switch (JOptionPane.showConfirmDialog(this, "�����׷��� �����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION:
				dispose();
			}

		}
		setLocation(x, y);

//		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) { // KeyEvent.VK_ESCAPE - KeyCode : 27
//			int flag = JOptionPane.showConfirmDialog(this, "â�� �����ðڽ��ϱ�?");
//			if (flag == JOptionPane.OK_OPTION) {
//				dispose();
//			}
//		}
//		if (e.getKeyCode() == 37) { // KeyEvent.VK_LEFT - KeyCode : 37
//			setBounds(this.getX() - 10, this.getY(), this.getWidth(), this.getHeight());
//		}
//		if (e.getKeyCode() == 38) { // KeyEvent.VK_UP- KeyCode : 38
//			setBounds(this.getX() + 10, this.getY() - 10, this.getWidth(), this.getHeight());
//		}
//		if (e.getKeyCode() == 39) { // KeyEvent.VK_RIGHT- KeyCode : 39
//			setBounds(this.getX() + 10, this.getY(), this.getWidth(), this.getHeight());
//		}
//		if (e.getKeyCode() == 40) { // KeyEvent.VK_DOWN- KeyCode : 40
//			setBounds(this.getX(), this.getY() + 10, this.getWidth(), this.getHeight());
//		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("3. keyReleased");
	}

//	KeyCode�� ASCII Code�� �ƴϰ� Ű������ Ű�� �ĺ��ϱ� ���� ������
	public static void main(String[] args) {
		new UseKeyEvent();
	}

}
