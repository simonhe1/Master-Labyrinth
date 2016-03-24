package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;
import code.Tile;

public class PlaceOneTileTests {
	@Test public void test01(){
		Board board = new Board();
		Tile tile = board.pickOneTile();
		boolean expected = true;
		boolean actual = board.isTile(tile);
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
