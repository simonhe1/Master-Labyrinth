package gui;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import code.Board;

public class TokenLayer {
	
	ImageIcon _token1 = new ImageIcon(getClass().getResource("/Images/Tokens/Token1.png"));
	ImageIcon _token2 = new ImageIcon(getClass().getResource("/Images/Tokens/Token2.png"));
	ImageIcon _token3 = new ImageIcon(getClass().getResource("/Images/Tokens/Token3.png"));
	ImageIcon _token4 = new ImageIcon(getClass().getResource("/Images/Tokens/Token4.png"));
	ImageIcon _token5 = new ImageIcon(getClass().getResource("/Images/Tokens/Token5.png"));
	ImageIcon _token6 = new ImageIcon(getClass().getResource("/Images/Tokens/Token6.png"));
	ImageIcon _token7 = new ImageIcon(getClass().getResource("/Images/Tokens/Token7.png"));
	ImageIcon _token8 = new ImageIcon(getClass().getResource("/Images/Tokens/Token8.png"));
	ImageIcon _token9 = new ImageIcon(getClass().getResource("/Images/Tokens/Token9.png"));
	ImageIcon _token10 = new ImageIcon(getClass().getResource("/Images/Tokens/Token10.png"));
	ImageIcon _token11 = new ImageIcon(getClass().getResource("/Images/Tokens/Token11.png"));
	ImageIcon _token12 = new ImageIcon(getClass().getResource("/Images/Tokens/Token12.png"));
	ImageIcon _token13 = new ImageIcon(getClass().getResource("/Images/Tokens/Token13.png"));
	ImageIcon _token14 = new ImageIcon(getClass().getResource("/Images/Tokens/Token14.png"));
	ImageIcon _token15 = new ImageIcon(getClass().getResource("/Images/Tokens/Token15.png"));
	ImageIcon _token16 = new ImageIcon(getClass().getResource("/Images/Tokens/Token16.png"));
	ImageIcon _token17 = new ImageIcon(getClass().getResource("/Images/Tokens/Token17.png"));
	ImageIcon _token18 = new ImageIcon(getClass().getResource("/Images/Tokens/Token18.png"));
	ImageIcon _token19 = new ImageIcon(getClass().getResource("/Images/Tokens/Token19.png"));
	ImageIcon _token20 = new ImageIcon(getClass().getResource("/Images/Tokens/Token20.png"));
	ImageIcon _token25 = new ImageIcon(getClass().getResource("/Images/Tokens/Token25.png"));


	JLabel token;
	public TokenLayer(int tokenNO, Board _board, int ButtonSize){
		token = new JLabel();

		  int[] pos =_board.get_tokenPosition(tokenNO);
		  int position = (int)Math.round(ButtonSize*0.3);
		  token.setBounds((pos[1]+2)*ButtonSize+position-6, (pos[0]+2)*ButtonSize+position-3, ButtonSize/2, ButtonSize/2);
		  switch(tokenNO){
		  case 1:
			  token.setIcon(_token1);
			  break;
		  case 2:
			  token.setIcon(_token2);
			  break;
		  case 3:
			  token.setIcon(_token3);
			  break;
		  case 4:
			  token.setIcon(_token4);
			  break;
		  case 5:
			  token.setIcon(_token5);
			  break;
		  case 6:
			  token.setIcon(_token6);
			  break;
		  case 7:
			  token.setIcon(_token7);
			  break;
		  case 8:
			  token.setIcon(_token8);
			  break;
		  case 9:
			  token.setIcon(_token9);
			  break;
		  case 10:
			  token.setIcon(_token10);
			  break;
		  case 11:
			  token.setIcon(_token11);
			  break;
		  case 12:
			  token.setIcon(_token12);
			  break;
		  case 13:
			  token.setIcon(_token13);
			  break;
		  case 14:
			  token.setIcon(_token14);
			  break;
		  case 15:
			  token.setIcon(_token15);
			  break;
		  case 16:
			  token.setIcon(_token16);
			  break;
		  case 17:
			  token.setIcon(_token17);
			  break;
		  case 18:
			  token.setIcon(_token18);
			  break;
		  case 19:
			  token.setIcon(_token19);
			  break;
		  case 20:
			  token.setIcon(_token20);
			  break;
		  case 21:
			  token.setIcon(_token25);
			  break;
		  }
	}
	public JLabel getLabel(){
		return token;
	}
}
