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
	protected int windowSize = 1500; 
	protected String[] p;

	JLayeredPane lp = getLayeredPane();
	
	//constructor
  public MultiLayers(String[] players) {
	
    super("LayeredPane Demonstration");
    _board = new Board();
    p = players;
    setSize((int) (windowSize*(1.2)), windowSize);
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
	
	  //create board
	  
	  for(int i=0;i<=6;i++){
		  for(int j=0;j<=6;j++){
			  GameBoard gb = new GameBoard(_board, ButtonSize,i, j);
			  int[] pos = {i,j};
			  InsertTileHandler ith = new InsertTileHandler(_board, pos.clone(),0);
			  Update update = new Update();
			  gb.getButton().addMouseListener(ith);
			  gb.getButton().addMouseListener(update);
			  lp.add(gb.getButton(), new Integer(0));
		  }
	  }
		  
	  //create extra
	  Extra ex = new Extra( _board, ButtonSize);
	  Update update = new Update();
	  RotateExtraTileHandler reth = new RotateExtraTileHandler(_board.get_ExtraTile());
	  ex.getButton().addMouseListener(reth);
	  ex.getButton().addMouseListener(update);
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
  
  public class Update implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
		initualize();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	  
  }
  
  public static void main(String[] args) {
	String[] input = {"sa","dw","dwaw"};
    MultiLayers sl = new MultiLayers(input);
    sl.setVisible(true);
  }


	
}


