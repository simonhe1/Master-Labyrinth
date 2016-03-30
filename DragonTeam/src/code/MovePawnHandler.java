package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import code.Board;
import gui.MultiLayers;
import gui.Play;

public class MovePawnHandler implements MouseListener {
	
	private Board _board;
	private int _playerNO;
	private int[] _request;
	private Play play;
	private MultiLayers ml;
	
	public MovePawnHandler(Board board, int[] request, Play _play, MultiLayers m){
		_board=board;
		_playerNO=_play.CurrentPlayer();
		_request=request;
		play = _play;
		ml=m;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(play.getState() == 2){
			boolean result = _board.move(_playerNO, _request);
			if(result==false){
				System.out.println("Whoops! You can't move there!");
			}
			else if(result==true){
				play.NextTurn();
				play.NextTurn();
				ml.initualize();
				//to eating
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	

}
