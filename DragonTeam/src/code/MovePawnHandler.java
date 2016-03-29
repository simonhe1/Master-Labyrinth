package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import code.Board;

public class MovePawnHandler implements MouseListener {
	
	private Board _board;
	private int _playerNO;
	private int[] _request;
	
	public MovePawnHandler(Board board, int playerNO, int[] request){
		_board=board;
		_playerNO=playerNO;
		_request=request;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(_board.move(_playerNO, _request)==false){
			System.out.println("Whoops! You can't move there!");
		}
		else if(_board.move(_playerNO, _request)==true){
			_board.move(_playerNO, _request);
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
