package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import code.Tile;

public class RotateExtraTileHandler implements MouseListener {
	
	private Tile _tile;
	
	public RotateExtraTileHandler(Tile tile){
		_tile=tile;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		_tile.rotate();
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
