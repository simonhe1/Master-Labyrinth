package code;

import javax.swing.SwingUtilities;

import gui.MultiLayers;

public class Driver {
	public static void main(String[]args){	
		MultiLayers ml = new MultiLayers(args);
		ml.setVisible(true);
	}
}
