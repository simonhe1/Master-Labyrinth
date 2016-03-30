package gui;

import javax.swing.JButton;

import code.Board;

public class GameBoard {

	JButton boardTile;

	public GameBoard(Board _board, int ButtonSize, int i, int j){

		boardTile = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
		boardTile.setBounds((j+2)*ButtonSize, (i+2)*ButtonSize, ButtonSize, ButtonSize);

	}
	
	public JButton getButton(){
		return boardTile;
	}
}
