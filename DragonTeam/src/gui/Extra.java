package gui;

import javax.swing.JButton;

import code.Board;

public class Extra {
	
	protected JButton extra;
	
	public Extra(Board _board, int ButtonSize){
		  extra = new JButton();
		  extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		  extra.setBounds(9*ButtonSize, ButtonSize, ButtonSize, ButtonSize);

	}
	
	public JButton getButton(){
		return extra;
	}
}
