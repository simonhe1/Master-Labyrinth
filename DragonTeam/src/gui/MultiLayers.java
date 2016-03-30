package gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import code.Board;
import code.InsertTileHandler;
import code.MovePawnHandler;
import code.RotateExtraTileHandler;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MultiLayers extends JFrame {
	protected Board _board;
	protected int ButtonSize = 150;
	protected int FontSize = 30;
	protected int windowSize = 2000; 
	protected String[] p;
	protected Play play;

	JLayeredPane lp = getLayeredPane();
	
	//constructor
  public MultiLayers(String[] players) {
	
    super("LayeredPane Demonstration");
    _board = new Board();
    p = players;
    play = new Play(p);
    setSize((int) windowSize, windowSize);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    initualize();

  }
 
  /*
   * This method makes the main gaming GUI
   * it uses classes ScoreTable, GameBoard, Extra, PawnLayer, and TokenLayer.
   */
  public void initualize(){
	  
	  lp.removeAll();
	  
	  //score table
	  for(int i=0; i<p.length; i++){
		  ScoreTable st = new ScoreTable(p[i], i, ButtonSize, FontSize);
		  lp.add(st.getLabel(), new Integer(0));
	  }
	  
	  //turnTable
	  TurnTable tt = new TurnTable(p, ButtonSize, FontSize, play);
	  lp.add(tt.getLabel(), new Integer(0));
	
	  //create board
	  for(int i=0;i<=6;i++){
		  for(int j=0;j<=6;j++){
			  GameBoard gb = new GameBoard(_board, ButtonSize,i, j);
			  int[] pos = {i,j};
			  MovePawnHandler mph = new MovePawnHandler(_board, pos.clone(), play, this);
			  gb.getButton().addMouseListener(mph);
			  lp.add(gb.getButton(), new Integer(0));
		  }
	  }
	  //create triangles
	  Triangle tri = new Triangle(_board, ButtonSize, play, this);
	  for(int i=0; i<12; i++){
		  lp.add(tri.getTri()[i]);
	  }
		  
	  //create extra
	  Extra ex = new Extra( _board, ButtonSize);
	  RotateExtraTileHandler reth = new RotateExtraTileHandler(_board.get_ExtraTile(), this);
	  ex.getButton().addMouseListener(reth);
	  lp.add(ex.getButton(), new Integer(0));

	  //creating pawns

	  for(int i=0; i<p.length; i++){
		  PawnLayer pl = new PawnLayer(i+1, _board, FontSize, ButtonSize);
		  lp.add(pl.getLabel(), new Integer(2));
	  }

	  //create tokens
	  for(int i=0; i<21; i++){
		  TokenLayer tl = new TokenLayer(i+1, _board, FontSize, ButtonSize);
		  lp.add(tl.getLabel(), new Integer(1));
	  }
  }
  

  
//  public static void main(String[] args) {
//	String[] input = {"David","Simon","Joe","Camerl"};
//    MultiLayers sl = new MultiLayers(input);
//    sl.setVisible(true);
//  }


	
}


