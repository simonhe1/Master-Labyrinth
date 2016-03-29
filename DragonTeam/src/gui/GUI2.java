package gui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import code.Board;


public class GUI2 implements Runnable, Observer{

	private JPanel _namePanel = new JPanel();
	private JPanel _typePanel = new JPanel();
	private JLabel lab1;
	private JLabel lab2;
	private JLabel player1_lab;
	private JLabel player2_lab;
	private JLabel player3_lab;
	private JLabel player4_lab;
	private JLabel type1_lab;
	private JLabel type2_lab;
	private JLabel type3_lab;
	private JLabel type4_lab;
	private JLabel type5_lab;
	private JTextField name1;
	private JTextField name2;
	private JTextField name3;
	private JTextField name4;
	private JTextField type1;
	private JTextField type2;
	private JTextField type3;
	private JTextField type4;
	private JTextField type5;
	private JTextField[] typeArray;
	private JButton enter;
	private JButton enter2;
	private ArrayList<String> name;
	private ArrayList<Integer> type;
	private Integer t1, t2, t3, t4, t5;
	private JButton[] tri = new JButton[12];

	private Board _board;
	private JFrame _window;
	private JLabel _player1 = new JLabel();
	private JLabel _player2 = new JLabel();
	private JLabel _player3 = new JLabel();
	private JLabel _player4 = new JLabel();
	private JPanel _playerPanel = new JPanel();
	private JPanel _boardPanel = new JPanel(); 
	private JPanel _upTriPanel = new JPanel();
	private JPanel _extraPanel = new JPanel();
	private JButton _extra = new JButton();
	private int _score1=0,_score2=0,_score3=0,_score4=0;
	

	public GUI2(){
		initialize();
	}

	public void play(String p1,String p2,String p3,String p4){
		_board = new Board(t1, t2, t3, t4, t5);
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_player1.setText(p1+"     "+_score1);
		_player2.setText(p2+"     "+_score2);
		_player3.setText(p3+"     "+_score3);
		_player4.setText(p4+"     "+_score4);
		buildBoard();
		turn(4);
	}
	public void play(String p1,String p2,String p3){
		_board = new Board(t1, t2, t3, t4, t5);
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_player1.setText(p1+"     "+_score1);
		_player2.setText(p2+"     "+_score2);
		_player3.setText(p3+"     "+_score3);
		buildBoard();
		turn(3);
	}
	public void play(String p1,String p2){
		_board = new Board(t1, t2, t3, t4, t5);
		_extra.setText(Integer.toString(_board.get_ExtraTile().type()));
		_player1.setText(p1+"     "+_score1);
		_player2.setText(p2+"     "+_score2);
		buildBoard();
		turn(2);
	}

	/*
	 * state machine for insert, move and eat
	 */
	private void playerTurn(int playerNO){
		int state = 1;
		switch(state){
		case 1://insertion

		case 2://move
			
		case 3://eat or not
			
		}
	}
	
	/*
	 * state machine for each player's turn
	 */
	
	private void turn(int totalNO){
		int state =1;
		if(totalNO == 4){
			switch(state){
			case 1://player 1's turn
				playerTurn(1);
				state++;
			case 2://player 2's turn
				playerTurn(2);
			case 3:
				playerTurn(3);
			case 4:
				playerTurn(4);
			}
		}
		else if(totalNO ==3){
			switch(state){
			case 1://player 1's turn
				playerTurn(1);
			case 2://player 2's turn
				playerTurn(2);
			case 3:
				playerTurn(3);
			}
		}
		else if(totalNO ==2){
			switch(state){
			case 1://player 1's turn
				playerTurn(1);
			case 2://player 2's turn
				playerTurn(2);
			}
		}
		
	}
	
	

	private void initialize(){
		lab1 = new JLabel("Please enter player names.");
		player1_lab = new JLabel("Player1");
		player2_lab = new JLabel("Player2");
		player3_lab = new JLabel("Player3");
		player4_lab = new JLabel("Player4");
		name1 = new JTextField(20);
		name2 = new JTextField(20);
		name3 = new JTextField(20);
		name4 = new JTextField(20);

		enter = new JButton("Enter");
		name = new ArrayList<String>();
	}



	@Override
	public void run() {
		_window = new JFrame("Master Labryinth Game");
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.getContentPane().setLayout(new FlowLayout());
		_window.setVisible(true);
		_window.setFocusable(true);

		_namePanel.setLayout(new BoxLayout(_namePanel,BoxLayout.PAGE_AXIS));
		_namePanel.add(lab1);
		_namePanel.add(player1_lab);
		_namePanel.add(name1);
		_namePanel.add(player2_lab);
		_namePanel.add(name2);
		_namePanel.add(player3_lab);
		_namePanel.add(name3);
		_namePanel.add(player4_lab);
		_namePanel.add(name4);
		_namePanel.add(enter);
		EnterHandler h = new EnterHandler();
		enter.addActionListener(h);

		_window.add(_namePanel);
	}
	@Override
	public void update(Observable o, Object arg) { //I'm not sure what the parameters do, will research
		_score1 = _board.showScore(1).size();
		_score2 = _board.showScore(2).size();
		_score3 = _board.showScore(3).size();
		_score4 = _board.showScore(4).size();
	}

	public void settingTiles(){
		lab2 = new JLabel("Please enter number of each tiles, or press Enter to use default.");	
		type1_lab = new JLabel("Type 1 tiles: ");
		type2_lab = new JLabel("Type 2 tiles: ");
		type3_lab = new JLabel("Type 3 tiles: ");
		type4_lab = new JLabel("Type 4 tiles: ");
		type5_lab = new JLabel("Type 5 tiles: ");
		type1 = new JTextField(1);
		type2 = new JTextField(1);
		type3 = new JTextField(1);
		type4 = new JTextField(1);
		type5 = new JTextField(1);
		JTextField[] temp = {type1, type2, type3, type4, type5};
		typeArray = temp;
		type = new ArrayList<Integer>();
		enter2 = new JButton("Enter");
		Enter2Handler h2 = new Enter2Handler();
		enter2.addActionListener(h2);

		_typePanel.setLayout(new BoxLayout(_typePanel, BoxLayout.PAGE_AXIS));
		_typePanel.add(lab2);
		_typePanel.add(type1_lab);
		_typePanel.add(type1);
		_typePanel.add(type2_lab);
		_typePanel.add(type2);
		_typePanel.add(type3_lab);
		_typePanel.add(type3);
		_typePanel.add(type4_lab);
		_typePanel.add(type4);
		_typePanel.add(type5_lab);
		_typePanel.add(type5);
		_typePanel.add(enter2);
		_window.add(_typePanel);
	}

	public void buildBoard(){
		_playerPanel.setLayout(new BoxLayout(_playerPanel,BoxLayout.PAGE_AXIS));
		_playerPanel.add(_player1);
		_playerPanel.add(_player2);
		_playerPanel.add(_player3);
		_playerPanel.add(_player4);
		_playerPanel.setVisible(true);
		_window.add(_playerPanel);
		_boardPanel.setLayout(new GridLayout(7,7));
		
		extraHandler eh = new extraHandler();
		insertHandler ih = new insertHandler();
		
		_extra.addActionListener(eh);
		
		for(int i=0; i<tri.length+1; i++){
			tri[i] =new JButton();
			tri[i].addActionListener(ih);
		}
		
		for(int i=0; i<tri.length; i++){
			_upTriPanel.add(tri[i]);
		}
		
		for(int i=0;i<=6;i++){
			for(int j=0;j<=6;j++){
				JButton temp = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
				_boardPanel.add(temp);
			}
		}
		
		_upTriPanel.setVisible(true);
		_window.add(_upTriPanel);
		_boardPanel.setVisible(true);
		_window.add(_boardPanel);
		_extraPanel.add(_extra);
		_extraPanel.setVisible(true);
		_window.add(_extraPanel);
		_window.setSize(500,300);
		_window.pack();
	}


	private class EnterHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){	
			if(!name1.getText().equals(""))
				name.add(name1.getText());
			if(!name2.getText().equals(""))
				name.add(name2.getText());
			if(!name3.getText().equals(""))
				name.add(name3.getText());
			if(!name4.getText().equals(""))
				name.add(name4.getText());

			settingTiles();
			_namePanel.setVisible(false);

		}

	}

	private class Enter2Handler implements ActionListener{
		public void actionPerformed(ActionEvent event){

			for(JTextField t: typeArray){
				if(t.getText().equals(""))
					type.add(0);
				else
					type.add(Integer.parseInt(t.getText()));
			}

			t1 = type.get(0);
			t2 = type.get(1);
			t3 = type.get(2);
			t4 = type.get(3);
			t5 = type.get(4);
			System.out.println(type.get(0));
			_typePanel.setVisible(false);

			switch(name.size()){
			case 2:
				play(name.get(0), name.get(1));
				break;
			case 3:
				play(name.get(0), name.get(1), name.get(2));
				break;
			case 4:
				play(name.get(0), name.get(1), name.get(2), name.get(3));
				break;
			}

		}
	}
	
	private class extraHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			_board.get_ExtraTile().rotate();
		}
	}
	
	
	private class insertHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton aa = (JButton)event.getSource();
			if(event.getSource()==tri[0]){
				int[] pos1 = {0,1};
				_board.insert(pos1, 0);
			}
			else if(event.getSource()==tri[1]){
				int[] pos2 = {0,3};
				_board.insert(pos2, 0);
			}
			else if(event.getSource()==tri[2]){
				int[] pos3 = {0,5};
				_board.insert(pos3, 0);
			}
			else if(event.getSource()==tri[3]){
				int[] pos4 = {1,6};
				_board.insert(pos4, 0);
			}
			else if(event.getSource()==tri[4]){
				int[] pos5 = {3,6};
				_board.insert(pos5, 0);
			}
			else if(event.getSource()==tri[5]){
				int[] pos6 = {5,6};
				_board.insert(pos6, 0);
			}
			else if(event.getSource()==tri[6]){
				int[] pos7 = {6,1};
				_board.insert(pos7, 0);
			}
			else if(event.getSource()==tri[7]){
				int[] pos8 = {6,3};
				_board.insert(pos8, 0);
			}
			else if(event.getSource()==tri[8]){
				int[] pos9 = {6,5};
				_board.insert(pos9, 0);
			}
			else if(event.getSource()==tri[9]){
				int[] pos10 = {1,0};
				_board.insert(pos10, 0);
			}
			else if(event.getSource()==tri[10]){
				int[] pos11 = {3,0};
				_board.insert(pos11, 0);
			}
			else if(event.getSource()==tri[11]){
				int[] pos12 = {5,0};
				_board.insert(pos12, 0);
			}
				
		}
	}

	


}
