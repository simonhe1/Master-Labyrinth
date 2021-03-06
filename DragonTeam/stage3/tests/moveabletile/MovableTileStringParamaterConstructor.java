package tests.moveabletile;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import code.model.AbstractTile;
import code.model.MoveableTile;
import code.model.Player;

public class MovableTileStringParamaterConstructor {
	
	@Test
	public void TStringArgument() {
		AbstractTile aT = new MoveableTile("T");
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 1;
		int a7 = aT.getLeft();
		int e4 = 1;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 && e1!=a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}
	
	@Test
	public void LStringArgument() {
		AbstractTile aT = new MoveableTile("L");
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 0;
		int a7 = aT.getLeft();
		int e4 = 1;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 
					&& e1!=a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}
	
	@Test
	public void IStringArgument() {
		AbstractTile aT = new MoveableTile("I");
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 1;
		int a7 = aT.getLeft();
		int e4 = 0;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 
					&& e1!=a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}
	
	@Test
	public void invalidStringArgument() {
		AbstractTile aT = new MoveableTile("G");
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 1;
		int a7 = aT.getLeft();
		int e4 = 1;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 
					&& e1==a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}
	
	@Test
	public void emptyStringArgument() {
		AbstractTile aT = new MoveableTile("");
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 1;
		int a7 = aT.getLeft();
		int e4 = 1;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 
					&& e1==a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}
	
	@Test
	public void nullStringArgument() {
		AbstractTile aT = new MoveableTile(null);
		//test behavior of AbstractTile to make sure
		//it has been successfully instantiated by the
		//constructor
		boolean e1 = true;
		Player p1 = new Player("Blue");
		aT.addPlayer(p1);
		boolean a2 = aT.hasPlayer();
		ArrayList<Player> aL = aT.getPlayers();
		Player p2 = aL.get(0);
		boolean a3 = aT.checkLegalDirectionsInput(1, 0, 1, 1);
		//a4 should be false
		boolean a4 = aT.setDirections(1, 0, 1, 1);
		aT.rotate(90);
		int a5 = aT.getTop();
		int e2 = 1;
		int a6 = aT.getBottom();
		int e3 = 1;
		int a7 = aT.getLeft();
		int e4 = 1;
		int a8 = aT.getRight();
		int e5 = 0;
		aT.removePlayer(p1);
		boolean a9 = aT.hasPlayer();
		boolean e6 = false;
		assertTrue("",e1==a2 && e1==a3 
					&& e1==a4 && p1==p2 && a5==e2 && a6==e3 && a7==e4
					&& a8==e5 && a9==e6);
	}


}
