package gui;


import javax.swing.ImageIcon;
import javax.swing.JButton;

import code.Board;

public class GameBoard {
	
	ImageIcon _tile1rotate0 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate0.png"));
	ImageIcon _tile1rotate1 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate1.png"));
	ImageIcon _tile1rotate2 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate2.png"));
	ImageIcon _tile1rotate3 = new ImageIcon(getClass().getResource("/Images/Tile1/Tile1Rotate3.png"));
	ImageIcon _tile2rotate0 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate0.png"));
	ImageIcon _tile2rotate1 = new ImageIcon(getClass().getResource("/Images/Tile2/Tile2Rotate1.png"));
	ImageIcon _tile3rotate0 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate0.png"));
	ImageIcon _tile3rotate1 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate1.png"));
	ImageIcon _tile3rotate2 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate2.png"));
	ImageIcon _tile3rotate3 = new ImageIcon(getClass().getResource("/Images/Tile3/Tile3Rotate3.png"));

	JButton boardTile;

	public GameBoard(Board _board, int ButtonSize, int i, int j){
		boardTile = new JButton(Integer.toString(_board.get_StateOfBoard()[i][j].type()));
		boardTile.setBounds((j+2)*ButtonSize, (i+2)*ButtonSize, ButtonSize, ButtonSize);
		int state = 0;
		boolean[] curTile = _board.get_StateOfBoard()[i][j].curOpen();
		switch(state){
		case 0:
			boolean[] tile1rotate0 = new boolean[]{true, true, false, false};
			int counter0=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile1rotate0[k]){
					counter0++;
					if(counter0==4){
						boardTile.setIcon(_tile1rotate0);
						break;
					}
				}
			}
		
		case 1:
			boolean[] tile1rotate1 = new boolean[]{false, true, true, false};
			int counter1=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile1rotate1[k]){
					counter1++;
					if(counter1==4){
						boardTile.setIcon(_tile1rotate1);
						break;
					}
				}
			}
		
		case 2:
			boolean[] tile1rotate2 = new boolean[]{false, false, true, true};
			int counter2=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile1rotate2[k]){
					counter2++;
					if(counter2==4){
						boardTile.setIcon(_tile1rotate2);
						break;
				}
			}
		}

		
		case 3:
			boolean[] tile1rotate3 = new boolean[]{true, false, false, true};
			int counter3=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile1rotate3[k]){
					counter3++;
					if(counter3==4){
						boardTile.setIcon(_tile1rotate3);
						break;
					}
				}
			}
			
		case 4:
			boolean[] tile2rotate0 = new boolean[]{true, false, true, false};
			int counter4=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile2rotate0[k]){
					counter4++;
					if(counter4==4){
						boardTile.setIcon(_tile2rotate0);
						break;
					}
				}
			}
			
		case 5:
			boolean[] tile2rotate1 = new boolean[]{false, true, false, true};
			int counter5=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile2rotate1[k]){
					counter5++;
					if(counter5==4){
						boardTile.setIcon(_tile2rotate1);
						break;
					}
				}
			}
					
		case 6:
			boolean[] tile3rotate0 = new boolean[]{true, true, false, true};
			int counter6=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile3rotate0[k]){
					counter6++;
					if(counter6==4){
						boardTile.setIcon(_tile3rotate0);
						break;
					}
				}
			}
			
		case 7:
			boolean[] tile3rotate1 = new boolean[]{true, true, true, false};
			int counter7=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile3rotate1[k]){
					counter7++;
					if(counter7==4){
						boardTile.setIcon(_tile3rotate1);
						break;
					}
				}
			}
			
		case 8:
			boolean[] tile3rotate2 = new boolean[]{false, true, true, true};
			int counter8=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile3rotate2[k]){
					counter8++;
					if(counter8==4){
						boardTile.setIcon(_tile3rotate2);
						break;
					}
				}
			}
			
		case 9:
			boolean[] tile3rotate3 = new boolean[]{true, false, true, true};
			int counter9=0;
			for(int k=0; k<4; k++){
				if(curTile[k]==tile3rotate3[k]){
					counter9++;
					if(counter9==4){
						boardTile.setIcon(_tile3rotate3);
						break;
					}
				}
			}
		}
		

	}
	
	public JButton getButton(){
		return boardTile;
	}
}
