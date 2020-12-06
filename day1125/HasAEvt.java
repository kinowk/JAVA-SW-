package day1125;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * 디자인 class와 has a 관계의 이벤트 처리 class를 생성
 * 
 * @author owner
 */
// 1. Listener 구현
public class HasAEvt implements ActionListener {

	// 2. 디자인 class 선언
	private EvtDesign ed;

	// 3. 디자인 객체를 받기 위한 생성자 작성
	public HasAEvt(EvtDesign ed) { // has a 관계
		this.ed = ed;
	}

	// 4. abstract method Override
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트를 JButton에서 발생했다면
		if (e.getSource() == ed.getJbtn()) {
			// JLabel의 글자를 변경
			JLabel jlblOutputJLabel = ed.getJlbl();
			// Font class 생성
			Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);
			// 생성된 font를 component에 적용
			jlblOutputJLabel.setFont(font);
//			jlblOutputJLabel.setForeground(Color.red); // Constant로 Foreground 설정
			jlblOutputJLabel.setForeground(new Color(0x8041D9)); // Color class를 생성하여 RGB값
			ed.getJbtn().setForeground(new Color(0x8041D9)); // Color class를 생성하여 RGB값

			ed.getJtf().setBackground(Color.GRAY); // Constant로 Background 설정
			// 투명도가 설정되지 않은 Component는 바로 적용
			jlblOutputJLabel.setOpaque(true); // 투명도를 해제하여 Color가 보이도록 설정
			jlblOutputJLabel.setBackground(Color.blue);
		}
	}

}
