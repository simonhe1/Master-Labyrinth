package gui;
//
import java.awt.Font;

import javax.swing.JButton;

import code.SizeListener;

public class SizeButton {

	JButton sizeButton = new JButton();
	public SizeButton(int ButtonSize, int FontSize, MultiLayers m){
		sizeButton.setText("sizeButton");
		sizeButton.setFont(new Font(sizeButton.getName(), Font.BOLD, FontSize));
		sizeButton.setBounds(13*ButtonSize, 1*ButtonSize, ButtonSize, ButtonSize);
		SizeListener sl = new SizeListener(m);
		sizeButton.addActionListener(sl);
	}
	
	public JButton getButton(){
		return sizeButton;
	}
}