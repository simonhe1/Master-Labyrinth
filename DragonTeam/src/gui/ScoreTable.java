package gui;

import java.awt.Font;

import javax.swing.JLabel;

public class ScoreTable {
	protected JLabel name = new JLabel();
	protected int score = 0;
	public ScoreTable(String p, int playerNO, int ButtonSize, int FontSize){
		
		    	name = new JLabel();
		    	score = 0;
		    	name.setText(p+"     "+score);
		    	name.setFont(new Font(name.getName(), Font.BOLD, FontSize));
		    	name.setBounds(9*ButtonSize, playerNO*ButtonSize+4*ButtonSize, ButtonSize, ButtonSize);
		    
	}
	
	public JLabel getLabel(){
		return name;
	}
}
