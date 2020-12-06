package day1125;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

/**
 * WindowListener�� �����ϸ� abstract method�� Override �ؾ� �Ѵ�.<br>
 * WindowAdapter�� �����ϸ� �ʿ��� method�� Override�ϸ� �ȴ�.
 * 
 * @author owner
 */
public class EvtWindowHasA extends WindowAdapter/* implements WindowListener */ {
	// has a
	UseWindowAdapter uwa;

	public EvtWindowHasA(UseWindowAdapter uwa) {
		this.uwa = uwa;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		uwa.dispose();
	}

//	@Override
//	public void windowOpened(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		int closeFlag = JOptionPane.showConfirmDialog(uwa, "�����Ͻðڽ��ϱ�?");
//		switch (closeFlag) {
//		case JOptionPane.OK_OPTION :
//			uwa.dispose();
//		}
////		uwa.dispose();
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
