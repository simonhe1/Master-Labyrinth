package code;
import javax.swing.SwingUtilities;
import code.gui.GameBoardGUI;
import code.model.GameBoard;
import code.model.Player;

/**
 * Driver class has a main method which is entry point to run the game
 * @author weijin,satya 04-03-16 6:33pm
 * @author Ian, Josh	04-04-16
 */

public class DriverStage3 {
	
	/**
	  * This starts and sets up the game board and the players
	  * @param args the args are put in when you go to run config,
	  * and go to the arguments tab and type in the players that want to play
	  * For example you would type in: Tom Ben Jerry 
	  * Which would give you 3 players and be counted in the for loop by the in countNumOfPlayers
	  * @author Josh,Ken
	  */
	 public static void main(String[] args){
	 
		 int countNumOfPlayers = 0;
		 for (int i = 0;i<args.length;i++){
			 countNumOfPlayers ++;
		 }
	
		 if(countNumOfPlayers > 1 && countNumOfPlayers < 5 ){
			  GameBoard gb = new GameBoard(countNumOfPlayers);
			  gb.setupRandomBoard();
			  Player[] players = gb.getPlayers();
			  if(countNumOfPlayers == 2){
				  players[0].setName(args[0]);
				  players[1].setName(args[1]);
			  }
			  if(countNumOfPlayers == 3){
				  players[0].setName(args[0]);
				  players[1].setName(args[1]);
				  players[2].setName(args[2]);
			  }
			  if(countNumOfPlayers == 4){
				  players[0].setName(args[0]);
				  players[1].setName(args[1]);
				  players[2].setName(args[2]);
				  players[3].setName(args[3]);
			  }
			  SwingUtilities.invokeLater(new GameBoardGUI(gb));
		 }
		 else{
			  System.out.println("You should only have 2-4 player for this game.");
		 }
	 }
}
