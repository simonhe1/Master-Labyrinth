package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;

public class IsTokenPositionTests {
	@Test public void test01(){
		Board board = new Board();
		int input = 1;
		boolean expected = true;
		boolean actual = board.isTokenPosition(board.get_tokenPosition(input));
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
	
	@Test public void test02(){
		Board board = new Board();
		int input = 0;
		boolean expected = false;
		boolean actual = board.isTokenPosition(board.get_tokenPosition(input));
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
