package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import code.Board;

public class PawnLayer {

	JLabel pawn;

	public PawnLayer(int playerNO,Board _board, int FontSize, int ButtonSize){
			
			int[] pos = _board.get_pawnPosition(playerNO);
			
			Color[] colors= {Color.blue, Color.yellow, Color.red, Color.green};
			pawn = new JLabel();
			pawn.setText("P"+playerNO);
			pawn.setFont(new Font(pawn.getName(), Font.BOLD, FontSize));
			pawn.setForeground(colors[playerNO-1]);
			int position = (int)Math.round(ButtonSize*0.1);
			switch(playerNO){
			case 1:
				pawn.setBounds((pos[1]+2)*ButtonSize+position, (pos[0]+2)*ButtonSize+position, ButtonSize/2, ButtonSize/2);
				break;
			case 2:
				pawn.setBounds((pos[1]+2)*ButtonSize+5*position, (pos[0]+2)*ButtonSize+position, ButtonSize/2, ButtonSize/2);
				break;
			case 3:
				pawn.setBounds((pos[1]+2)*ButtonSize+position, (pos[0]+2)*ButtonSize+5*position, ButtonSize/2, ButtonSize/2);
				break;
			case 4:
				pawn.setBounds((pos[1]+2)*ButtonSize+5*position, (pos[0]+2)*ButtonSize+5*position, ButtonSize/2, ButtonSize/2);
				break;
			}
			

	}
	
	public JLabel getLabel(){
		return pawn;
	}
}
