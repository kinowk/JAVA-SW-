package day1126.hw;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MemoFontEvt extends MouseAdapter implements WindowListener {
	private MemoFont memoFont;
	public static final int ENGLISH = 0;
	public static final int KOREAN = 1;
	private String tempFont = ""; // 선택한 글꼴 저장
	private int tempStyle = 0, tempSize = 0; // 선택한 스타일, 크기 저장
	private Font basicFont;
	private Font font;
	// PLAIN, BOLD, ITALIC, BOLD+ITALIC

	public MemoFontEvt(MemoFont memoFont) {
		this.memoFont = memoFont;
		basicFont = memoFont.getJavaMemo().getTextArea().getFont();
		tempFont = basicFont.getFamily(); // JTextArea에 설정된 Font 저장
		tempStyle = basicFont.getStyle(); // JTextArea에 설정된 Style 저장
		tempSize = basicFont.getSize(); // JTextArea에 설정된 Size 저장
		memoFont.getTextField1().setText(tempFont);
		memoFont.getTextField2().setText(memoFont.getStyleListModel().elementAt(tempStyle));
		memoFont.getTextField3().setText(String.valueOf(tempSize));
		memoFont.getFontList().setSelectedValue(tempFont, true);
		memoFont.getStyleList().setSelectedValue(memoFont.getStyleListModel().elementAt(tempStyle), true);
		memoFont.getSizeList().setSelectedValue(String.valueOf(tempSize), true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == memoFont.getFontList()) {
			setFont();
			setPreview();
		}
		if (e.getSource() == memoFont.getStyleList()) {
			setStyle();
			setPreview();
		}
		if (e.getSource() == memoFont.getSizeList()) {
			setSize();
			setPreview();
		}

		if (e.getSource() == memoFont.getComboBoxScript()) {
			setScript();
		}
		if(e.getSource() == memoFont.getApplyButton()) {
			fontApply();
		}
		if (e.getSource() == memoFont.getCloseButton()) {
			closeMemoFont();
		}
	}

	private void setFont() {
		String font = memoFont.getFontListModel().get(memoFont.getFontList().getSelectedIndex());
		memoFont.getTextField1().setText(font);
	}// setFont

	private void setStyle() {
		String style = memoFont.getStyleListModel().get(memoFont.getStyleList().getSelectedIndex());
		memoFont.getTextField2().setText(style);
	}// setStyle

	private void setSize() {
		String size = memoFont.getSizeListModel().get(memoFont.getSizeList().getSelectedIndex());
		memoFont.getTextField3().setText(size);
	}// setSize

	private void setPreview() {
		if(memoFont.getFontListModel().get(memoFont.getFontList().getSelectedIndex())!=null) {
			tempFont = memoFont.getFontList().getSelectedValue();
		} 
		if(memoFont.getStyleListModel().get(memoFont.getStyleList().getSelectedIndex())!=null) {
			tempStyle = memoFont.getStyleList().getSelectedIndex();
		}
		if(memoFont.getSizeListModel().get(memoFont.getSizeList().getSelectedIndex())!=null) {
			tempSize = Integer.parseInt(memoFont.getSizeList().getSelectedValue());
		}
		font = new Font(tempFont, tempStyle, tempSize);
		memoFont.getLabelPreview().setFont(font);
	}// setPreview
	

	private void setScript() {
		memoFont.getComboBoxScript().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = (String) memoFont.getComboBoxScript().getSelectedItem(); // 선택된 item을 String으로 Casting
				if (memoFont.getComboBoxScript().getItemAt(ENGLISH).toString().equals(s)) { // 선택된 item과 ComboBoxScript의
																							// item이
					// 같은 경우
					memoFont.getLabelPreview().setText("AaBbYyZz");
				}
				if (memoFont.getComboBoxScript().getItemAt(KOREAN).toString().equals(s)) {
					memoFont.getLabelPreview().setText("가나다");
				}
			}
		});
	}// setScript

	private void fontApply() {
		memoFont.getJavaMemo().getTextArea().setFont(font);
		memoFont.dispose();
	}// fontApply

	private void closeMemoFont() {
		memoFont.dispose();
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		memoFont.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
