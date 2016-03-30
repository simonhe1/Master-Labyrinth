package gui;

import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import code.Board;

public class GUI implements Runnable, Observer{
	private Board _board;
	private JFrame _window;
	private JLabel _name1 = new JLabel();
	private JLabel _name2 = new JLabel();
	private JLabel _name3 = new JLabel();
	private JLabel _name4 = new JLabel();
	private JPanel _playerPanel = new JPanel();
	private JPanel _boardPanel = new JPanel(); 
	private JPanel _extraPanel = new JPanel();

	private JButton _extra = new JButton();
	private int _score1=-1,_score2=-1,_score3=-1,_score4=-1;
	public GUI(String p1,String p2,String p3,String p4){
		_board = new Board();
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_name1.setText(p1+"     "+(_score1+1));
		_name2.setText(p2+"     "+(_score2+1));
		_name3.setText(p3+"     "+(_score3+1));
		_name4.setText(p4+"     "+(_score4+1));
	}
	public GUI(String p1,String p2,String p3){
		_board = new Board();
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_name1.setText(p1+"     "+(_score1+1));
		_name2.setText(p2+"     "+(_score2+1));
		_name3.setText(p3+"     "+(_score3+1));
	}
	public GUI(String p1,String p2){
		_board = new Board();
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_name1.setText(p1+"     "+(_score1+1));
		_name2.setText(p2+"     "+(_score2+1));
		
	}
	//public GUI(int n1,int n2,int n3,int n4,int n5){
	//	_board = new Board(n1,n2,n3,n4,n5);
	//}
	
	@Override
	public void run() {
		
		_window = new JFrame("Master Labryinth Game");
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.getContentPane().setLayout(new FlowLayout());
		_window.setVisible(true);
		_window.setFocusable(true);
		_playerPanel.setLayout(new BoxLayout(_playerPanel,BoxLayout.PAGE_AXIS));
		_playerPanel.add(_name1);
		_playerPanel.add(_name2);
		_playerPanel.add(_name3);
		_playerPanel.add(_name4);
		_window.add(_playerPanel);
		_boardPanel.setLayout(new GridLayout(7,7));
		for(int i=0;i<=6;i++){
			for(int j=0;j<=6;j++){
				JButton temp = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
				_boardPanel.add(temp);
			}
		}
		
		_window.add(_boardPanel);
		_extraPanel.add(_extra);
		_window.add(_extraPanel);
		_window.setSize(500,500);
		_window.pack();
		
	}
	@Override
	public void update(Observable o, Object arg) { //I'm not sure what the parameters do, will research
		if(_score1!=-1){_score1 = _board.showScore(1).size();}
		if(_score2!=-1){_score2 = _board.showScore(2).size();}
		if(_score3!=-1){_score3 = _board.showScore(3).size();}
		if(_score4!=-1){_score4 = _board.showScore(4).size();}
	}

}
