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
			pawn.setBounds((pos[1]+2)*ButtonSize+20, (pos[0]+2)*ButtonSize+20, ButtonSize/2, ButtonSize/2);

	}
	
	public JLabel getLabel(){
		return pawn;
	}
}
