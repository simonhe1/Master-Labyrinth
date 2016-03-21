package boardTests;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import code.Board;

public class CheckNeighborTests {
	@Test public void test01(){
		Board board = new Board();
		int [] neighbor1 = {2,1}; //left of current tile
		int [] neighbor2 = {1,2}; //above current tile
		int [] neighbor3 = {3,2}; //below current tile
		int [] neighbor4 = {2,3}; //right of current tile
		int [] current = {2,2};
		board.set_Tile(current, 5);
		board.set_Tile(neighbor1, 5);
		board.set_Tile(neighbor2, 5);
		board.set_Tile(neighbor3, 5);
		board.set_Tile(neighbor4, 5);
		HashMap<Integer[], Integer> list = board.checkNeighbor(current);
		int expected = 4;
		int actual = 0;
		if(list.containsKey(neighbor1)){actual++;}
		if(list.containsKey(neighbor2)){actual++;}
		if(list.containsKey(neighbor3)){actual++;}
		if(list.containsKey(neighbor4)){actual++;}
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
