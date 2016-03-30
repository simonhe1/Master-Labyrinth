package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import gui.MultiLayers;
import gui.Play;

public class InsertTileHandler implements MouseListener {
	
	private Board _board;
	private int[] _triangle;
	private int _rotTime;
	private Play play;
	private MultiLayers ml;

	
	public InsertTileHandler(Board board, int[] triangle, int rotTime, Play _play, MultiLayers m){
		_board=board;
		_triangle=triangle;
		_rotTime=rotTime;
		play=_play;
		ml=m;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(play.getState() == 1){
			boolean result = _board.insert(_triangle, _rotTime);
			if(result){
				play.NextTurn();
				ml.initualize();
				//switch to move stage
			}
			else{
				System.out.println("Whoa there bub, you can't put that tile there.");
			}
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
