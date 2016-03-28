package code;

import javax.swing.SwingUtilities;

import gui.GUI;

public class Driver {
public static void main(String[]args){
	SwingUtilities.invokeLater(new GUI());
}
}
