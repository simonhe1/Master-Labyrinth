package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class PawnLayer {

	JLabel pawn;

	public PawnLayer(int playerNO, int FontSize, int ButtonSize){
		switch(playerNO){
		case 1:
			pawn = new JLabel();
			pawn.setText("P1");
			pawn.setFont(new Font(pawn.getName(), Font.BOLD, FontSize));
			pawn.setForeground(Color.blue);
			pawn.setBounds((2+1)*ButtonSize+20, (2+1)*ButtonSize+20, ButtonSize/2, ButtonSize/2);
			break;
		case 2:
			pawn = new JLabel();
			pawn.setText("P2");
			pawn.setFont(new Font(pawn.getName(), Font.BOLD, FontSize));
			pawn.setForeground(Color.yellow);
			pawn.setBounds((2+1)*ButtonSize+20, (4+1)*ButtonSize+20, ButtonSize/2, ButtonSize/2);
			break;
		case 3:
			pawn = new JLabel();
			pawn.setText("P3");
			pawn.setFont(new Font(pawn.getName(), Font.BOLD, FontSize));
			pawn.setForeground(Color.red);
			pawn.setBounds((4+1)*ButtonSize+20, (2+1)*ButtonSize+20, ButtonSize/2, ButtonSize/2);
			break;
		case 4:
			pawn = new JLabel();
			pawn.setText("P4");
			pawn.setFont(new Font(pawn.getName(), Font.BOLD, FontSize));
			pawn.setForeground(Color.green);
			pawn.setBounds((4+1)*ButtonSize+20, (4+1)*ButtonSize+20, ButtonSize/2, ButtonSize/2);
			break;
		}
		
	}
	
	public JLabel getLabel(){
		return pawn;
	}
}
