package day1125;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

/**
 * WindowListener를 구현하면 abstract method를 Override 해야 한다.<br>
 * WindowAdapter를 구현하면 필요한 method만 Override하면 된다.
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
//		int closeFlag = JOptionPane.showConfirmDialog(uwa, "종료하시겠습니까?");
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
