package boardTests;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import code.Board;

public class LegalMovesTests {
	@Test public void test01(){
		Board board = new Board();
		int [] tile1 = {1,3}; 
		int [] tile2 = {1,2}; 
		int [] tile3 = {2,2}; 
		int [] current = {3,2};
		board.set_Tile(current, 1, 0);
		board.set_Tile(tile1, 1, 3);
		board.set_Tile(tile2, 2, 1);
		board.set_Tile(tile3, 3, 0);
		HashMap<Integer[], Integer> list = board.checkNeighbor(current);
		int expected = 4;
		int actual = list.size();
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
