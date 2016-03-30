package gui;

import code.Board;

public class Play{
	private int state;
	private int player;
	public Play(){
		state = 1;
		player = 1;
	}
	
	public void NextTurn(){
		switch(state){
		case 1:
			state = 2;
			break;
		case 2:
			state = 3;
			break;
		case 3:
			switch(player){
			case 1:
				player = 2;
				state = 1;
				break;
			case 2:
				player = 3;
				state = 1;
				break;
			case 3:
				player = 4;
				state = 1;
				break;
			case 4:
				player = 1;
				state = 1;
				break;
			}
		}
	}
	
	public int getState(){
		return state;
	}
	
	public int CurrentPlayer(){
		return player;
	}
}
