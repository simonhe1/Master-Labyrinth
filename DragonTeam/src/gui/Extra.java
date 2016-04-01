package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import code.Board;

public class Extra {
	
	protected JButton extra;
	ImageIcon _tile1rotate0size1 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate0Size1.png"));
	ImageIcon _tile1rotate1size1 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate1Size1.png"));
	ImageIcon _tile1rotate2size1 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate2Size1.png"));
	ImageIcon _tile1rotate3size1 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate3Size1.png"));
	ImageIcon _tile2rotate0size1 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate0Size1.png"));
	ImageIcon _tile2rotate1size1 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate1Size1.png"));
	ImageIcon _tile3rotate0size1 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate0Size1.png"));
	ImageIcon _tile3rotate1size1 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate1Size1.png"));
	ImageIcon _tile3rotate2size1 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate2Size1.png"));
	ImageIcon _tile3rotate3size1 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate3Size1.png"));
	
	ImageIcon _tile1rotate0size2 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate0.png"));
	ImageIcon _tile1rotate1size2 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate1.png"));
	ImageIcon _tile1rotate2size2 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate2.png"));
	ImageIcon _tile1rotate3size2 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate3.png"));
	ImageIcon _tile2rotate0size2 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate0.png"));
	ImageIcon _tile2rotate1size2 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate1.png"));
	ImageIcon _tile3rotate0size2 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate0.png"));
	ImageIcon _tile3rotate1size2 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate1.png"));
	ImageIcon _tile3rotate2size2 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate2.png"));
	ImageIcon _tile3rotate3size2 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate3.png"));
	
	ImageIcon _tile1rotate0size3 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate0Size3.png"));
	ImageIcon _tile1rotate1size3 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate1Size3.png"));
	ImageIcon _tile1rotate2size3 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate2Size3.png"));
	ImageIcon _tile1rotate3size3 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate3Size3.png"));
	ImageIcon _tile2rotate0size3 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate0Size3.png"));
	ImageIcon _tile2rotate1size3 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate1Size3.png"));
	ImageIcon _tile3rotate0size3 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate0Size3.png"));
	ImageIcon _tile3rotate1size3 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate1Size3.png"));
	ImageIcon _tile3rotate2size3 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate2Size3.png"));
	ImageIcon _tile3rotate3size3 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate3Size3.png"));
	public Extra(Board _board, int ButtonSize, int size, int rotations){
		  int type =_board.get_ExtraTile().type();
		  extra = new JButton();
		  if(size == 1){
			  switch(type){
			  case 1:
				switch(rotations){
				
				case 0:
						extra.setIcon(_tile1rotate0size1);
						break;
	
				case 1:
						extra.setIcon(_tile1rotate1size1);
						break;
				
				case 2:
						extra.setIcon(_tile1rotate2size1);
						break;
				
				case 3:
						extra.setIcon(_tile1rotate3size1);
						break;
				}break;
			  case 2:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile2rotate0size1);
							break;
		
					case 1:
							extra.setIcon(_tile2rotate1size1);
							break;
					case 2:
							extra.setIcon(_tile2rotate0size1);
							break;
	
					case 3:
							extra.setIcon(_tile2rotate1size1);
							break;
				}break;
			  case 3:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile3rotate0size1);
							break;
		
					case 1:
							extra.setIcon(_tile3rotate1size1);
							break;
					
					case 2:
							extra.setIcon(_tile3rotate2size1);
							break;
					
					case 3:
							extra.setIcon(_tile3rotate3size1);
							break;
					}break;
			  }
		  }
		  if(size == 2){
			  switch(type){
			  case 1:
				switch(rotations){
				
				case 0:
						extra.setIcon(_tile1rotate0size2);
						break;
	
				case 1:
						extra.setIcon(_tile1rotate1size2);
						break;
				
				case 2:
						extra.setIcon(_tile1rotate2size2);
						break;
				
				case 3:
						extra.setIcon(_tile1rotate3size2);
						break;
				}break;
			  case 2:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile2rotate0size2);
							break;
		
					case 1:
							extra.setIcon(_tile2rotate1size2);
							break;
					}break;
			  case 3:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile3rotate0size2);
							break;
		
					case 1:
							extra.setIcon(_tile3rotate1size2);
							break;
					
					case 2:
							extra.setIcon(_tile3rotate2size2);
							break;
					
					case 3:
							extra.setIcon(_tile3rotate3size2);
							break;
					}break;
			  }
		  }
		  if(size == 3){
			  switch(type){
			  case 1:
				switch(rotations){
				
				case 0:
						extra.setIcon(_tile1rotate0size3);
						break;
	
				case 1:
						extra.setIcon(_tile1rotate1size3);
						break;
				
				case 2:
						extra.setIcon(_tile1rotate2size3);
						break;
				
				case 3:
						extra.setIcon(_tile1rotate3size3);
						break;
				}break;
			  case 2:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile2rotate0size3);
							break;
		
					case 1:
							extra.setIcon(_tile2rotate1size3);
							break;
					}break;
			  case 3:
				  switch(rotations){
					
					case 0:
							extra.setIcon(_tile3rotate0size3);
							break;
		
					case 1:
							extra.setIcon(_tile3rotate1size3);
							break;
					
					case 2:
							extra.setIcon(_tile3rotate2size3);
							break;
					
					case 3:
							extra.setIcon(_tile3rotate3size3);
							break;
					}break;
			  }
		  }
		  extra.setBounds(11*ButtonSize, 1*ButtonSize, ButtonSize, ButtonSize);
	}
	
	public JButton getButton(){
		return extra;
	}
}
