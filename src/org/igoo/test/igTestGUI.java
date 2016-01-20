package org.igoo.test;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import org.igoo.gui.igDefaultGUI;

public class igTestGUI extends igDefaultGUI {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5771568214354530651L;

	public igTestGUI(String[] args, String programName) throws HeadlessException {
		super(args, programName);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformedExtra(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Thread(new igTestGUI(args, "igTestGUI")).start();;
	}

}
