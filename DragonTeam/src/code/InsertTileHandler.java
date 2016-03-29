package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InsertTileHandler implements MouseListener {
	
	private Board _board;
	private int[] _triangle;
	private int _rotTime;
	
	public InsertTileHandler(Board board, int[] triangle, int rotTime){
		_board=board;
		_triangle=triangle;
		_rotTime=rotTime;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(_board.insert(_triangle, _rotTime)==false){
			System.out.println("Whoa there bub, you can't put that tile there.");
		}
		else if(_board.insert(_triangle, _rotTime)==true){
			_board.insert(_triangle, _rotTime);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

}
