package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import code.Board;
import gui.MultiLayers;
import gui.Play;

public class MovePawnHandler implements ActionListener {
	
	private Board _board;
	private int _playerNO;
	private int[] _request;
	private Play play;
	private MultiLayers ml;
	private String message;
	
	public MovePawnHandler(Board board, int[] request, Play _play, MultiLayers m){
		_board=board;
		_playerNO=_play.CurrentPlayer();
		_request=request;
		play = _play;
		ml=m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(play.getState() == 2){
			boolean result = _board.move(_playerNO, _request);
			if(result==false){
				message = "Whoops! You can't move there!";
				ml.updateConsole(message);
			}
			else if(result==true){
				play.NextTurn();
				play.NextTurn();
				ml.initualize();
			}
		}
		
	}
	

}
