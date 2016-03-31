package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import code.Board;

public class GameBoard {
	
	ImageIcon _tile1rotate0 = new ImageIcon("C:\\Users\\Joe\\Desktop\\Tiles\\Tile1\\Tile1Rotate0.png");

	JButton boardTile;

	public GameBoard(Board _board, int ButtonSize, int i, int j){

		boardTile = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
		boardTile.setIcon(_tile1rotate0);
		boardTile.setBounds((j+2)*ButtonSize, (i+2)*ButtonSize, ButtonSize, ButtonSize);

	}
	
	public JButton getButton(){
		return boardTile;
	}
}
