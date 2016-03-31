package code;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MultiLayers;

public class SizeListener implements ActionListener{
	MultiLayers ml;
	int size;
	public SizeListener(MultiLayers m, int _size){
		ml = m;
		size = _size;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(size == 1){
			ml.setSize(2);
		
		}
		else if(size == 2){
			ml.setSize(1);
			
		}
		
	}
}

