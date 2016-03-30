package gui;

import javax.swing.JButton;

import code.Board;

public class GameBoard {

	JButton boardTile;

	public GameBoard(Board _board, int ButtonSize, int i, int j){

		boardTile = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
		boardTile.setBounds((i+1)*ButtonSize, (j+1)*ButtonSize, ButtonSize, ButtonSize);

	}
	
	public JButton getButton(){
		return boardTile;
	}
}
