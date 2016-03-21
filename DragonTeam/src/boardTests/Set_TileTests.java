package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;
import code.Tile;

public class Set_TileTests {
	@Test public void test01(){
		Board board = new Board();
		Tile expectedTile = new Tile(2);
		int [] position = {1,3};
		int type = 2;
		board.set_Tile(position, type);
		Tile actualTile = board.get_StateOfBoard()[1][3];
		int expected = expectedTile.type();
		int actual = actualTile.type();
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
