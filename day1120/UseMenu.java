package day1120;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseMenu extends JFrame {

	public UseMenu() {
		super("Use Menu");
		// 1. MenuBar 생성
		JMenuBar jmb = new JMenuBar();

		// 2. Menu 생성
		JMenu jmFile = new JMenu("파일");
		JMenu jmEdit = new JMenu("편집");

		// 3. MenuItem 생성
		// 파일메뉴에 배치될 메뉴아이템 생성
		JMenuItem jmiOpen = new JMenuItem("열기");
		JMenuItem jmiSave = new JMenuItem("저장");
		JMenuItem jmiEnd = new JMenuItem("종료");

		// 편집메뉴에 배치될 메뉴아이템 생성
		JMenuItem jmiCopy = new JMenuItem("복사");
		JMenuItem jmiCut = new JMenuItem("자르기");
		JMenuItem jmiPaste = new JMenuItem("붙이기");

		// 4. MenuItem을 Menu에 배치
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		// Menu에 구분선 설정
		jmFile.addSeparator();
		jmFile.add(jmiEnd);

		jmEdit.add(jmiCut);
		jmEdit.add(jmiCopy);
		jmEdit.add(jmiPaste);

		// 5. Menu를 MenuBar에 배치
		jmb.add(jmFile);
		jmb.add(jmEdit);

		// 6. MenuBar를 Window Component에 배치
		setJMenuBar(jmb);

		setBounds(100, 200, 400, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// UseMenu

	public static void main(String[] args) {
		new UseMenu();
	}// main

}// class
