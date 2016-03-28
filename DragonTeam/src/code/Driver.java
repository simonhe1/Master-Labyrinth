package code;

import javax.swing.SwingUtilities;

import gui.GUI;

public class Driver {
public static void main(String[]args){
	if(args.length==0||args.length==1){System.out.println("Too little players, add more please!");}
	if(args.length==2){
		System.out.println("Starting Game...");
		SwingUtilities.invokeLater(new GUI(args[0],args[1]));
		}
	if(args.length==3){
		System.out.println("Starting Game...");
		SwingUtilities.invokeLater(new GUI(args[0],args[1],args[2]));
		}
	if(args.length==4){
		System.out.println("Starting Game...");
		SwingUtilities.invokeLater(new GUI(args[0],args[1],args[2],args[3]));
		}
	if(args.length>4){System.out.println("Woah there buddy, too many players!");}
}
}
