package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import code.Tile;
import gui.MultiLayers;

public class RotateExtraTileHandler implements MouseListener {
	
	private Tile _tile;
	private MultiLayers ml;
	
	public RotateExtraTileHandler(Tile tile, MultiLayers m){
		_tile=tile;
		ml=m;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		_tile.rotate();
		ml.initualize();
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
