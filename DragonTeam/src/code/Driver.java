package code;

import javax.swing.SwingUtilities;

import gui.GUI;
import gui.MultiLayers;
import gui.Play;


public class Driver {
public static void main(String[]args){

	String[] input = {"David","Simon","Joe", "Cameren"};
	MultiLayers ml = new MultiLayers(input);
	ml.setVisible(true);
}
}
