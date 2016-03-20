package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;

public class InitializeTests {
	@Test public void test01(){
		Board board = new Board();
		int expected = 49;
		int sizeOfBoard = 0;
		for(int rows = 0;rows<=6;rows++){
		if(board.get_StateOfBoard()[rows].length==7){
			sizeOfBoard = sizeOfBoard + 7;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+sizeOfBoard,expected==sizeOfBoard);
	}
	@Test public void test02(){
		Board board = new Board();
		boolean expected = true;
		boolean actual = board.isTile(board.get_ExtraTile());
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
	@Test public void test03(){
		Board board = new Board();
		int input = 1;
		boolean expected = true;
		boolean actual = board.isTokenPosition(board.get_tokenPosition(input));
		assertTrue("Expected: "+expected+" Actual: "+actual,expected==actual);
	}
}
