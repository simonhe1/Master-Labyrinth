package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import code.Board;

public class TokenLayer {

	JLabel token;
	public TokenLayer(int tokenNO, Board _board, int FontSize, int ButtonSize){
		token = new JLabel();
		  token.setText("T"+tokenNO);
		  token.setFont(new Font(token.getName(), Font.PLAIN, FontSize));
		  token.setForeground(Color.gray);
		  int[] pos =_board.get_tokenPosition(tokenNO);
		  token.setBounds((pos[1]+2)*ButtonSize+20, (pos[0]+2)*ButtonSize+20, ButtonSize/2, ButtonSize/2);
	}
	public JLabel getLabel(){
		return token;
	}
}
