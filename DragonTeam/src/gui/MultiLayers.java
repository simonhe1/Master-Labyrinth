package gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import code.Board;
import code.InsertTileHandler;
import code.MovePawnHandler;
import code.RotateExtraTileHandler;
import gui.Console.DeleteConsole;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MultiLayers extends JFrame {
	protected Board _board;
	protected int size =1;
	protected int ButtonSize = 60;
	protected int FontSize = 14;
	protected int windowSizeX = 900;
	protected int windowSizeY = 750;
	protected String[] p;
	protected Play play;
	JLayeredPane lp;
	
	//constructor
  public MultiLayers(String[] players) {
	
    super("LayeredPane Demonstration");
    _board = new Board();
    p = players;
    play = new Play(p);
    setSize((int) windowSizeX, windowSizeY);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    initualize();

  }
 
  /*
   * This method makes the main gaming GUI
   * it uses classes ScoreTable, GameBoard, Extra, PawnLayer, and TokenLayer.
   */
  public void initualize(){
	  
	  lp = getLayeredPane();
	  lp.removeAll();
	  
	  //score table
	  for(int i=0; i<p.length; i++){
		  ScoreTable st = new ScoreTable(p[i], i, ButtonSize, FontSize);
		  lp.add(st.getLabel(), new Integer(0));
	  }
	  
	  //turnTable
	  TurnTable tt = new TurnTable(p, ButtonSize, FontSize, play);
	  lp.add(tt.getLabel(), 0);
	
	  //Console
	  updateConsole("");
	  
	  //create board
	  for(int i=0;i<=6;i++){
		  for(int j=0;j<=6;j++){
			  GameBoard gb = new GameBoard(_board, ButtonSize,i, j);
			  int[] pos = {i,j};
			  MovePawnHandler mph = new MovePawnHandler(_board, pos.clone(), play, this);
			  gb.getButton().addActionListener(mph);
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
	  
	//create size Button
	  SizeButton sizeb = new SizeButton(ButtonSize, FontSize, size, this);
	  lp.add(sizeb.getButton(), 0);
	  
	  //create skip button
	  SkipButton sb = new SkipButton(ButtonSize, FontSize, play, this);
	  lp.add(sb.getButton(), 0);

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
  
  public void updateConsole(String message){
	  Console console = new Console(message, ButtonSize, FontSize);
	  lp.add(console.getLabel(), new Integer(3));

	  DeleteConsole dc = console.new DeleteConsole(this);
	  Timer timer = new Timer(5000, dc);
	  timer.setRepeats(false);
	  timer.start();


  }
  
  public void setSize(int s){
	  if(s == 1){
		  ButtonSize = 60;
		  FontSize = 14;
		  windowSizeX = 900;
		  windowSizeY = 750;
		  size = 1;
		  
		  initualize();
	  }
	  
	  else if(s == 2){
		  ButtonSize = 100;
		  FontSize = 20;
		  windowSizeX = 2000;
		  windowSizeY = 1500;
		  size = 2;
		  
		  initualize();
	  }
	  


  }
  
  public int gameSize(){
	  return size;
  }
  
}


