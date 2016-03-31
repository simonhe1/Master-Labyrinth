package code;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MultiLayers;

public class SizeListener implements ActionListener{
	MultiLayers ml;
	public SizeListener(MultiLayers m){
		ml = m;
	}

	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		int result = ml.setSize(2);
		ml.initualize();
	}
}

