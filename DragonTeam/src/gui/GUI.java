package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import code.Board;

public class GUI implements Runnable{
	private Board _board;
	private JFrame _window;
	public GUI(){
		_board = new Board();
	}
	public GUI(int n1,int n2,int n3,int n4,int n5){
		_board = new Board(n1,n2,n3,n4,n5);
	}
	
	@Override
	public void run() {
		_window = new JFrame("Master Labryinth Game");
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.getContentPane().setLayout(new FlowLayout());
		_window.setVisible(true);
		_window.setFocusable(true);
	}

}
