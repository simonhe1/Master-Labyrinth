package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;

//note
public class set_pawnPositionTests {
	
	@Test public void test01(){
		Board board = new Board();
		int playerNO = 1;
		int[] position = {2,3};
		board.set_pawnPosition(playerNO, position);
		int[] expected = {2,3};
		int[] actual = board.get_pawnPosition(playerNO);
		assertTrue("Expected position: "+expected+" actual"
				+ " position: "+actual,expected==actual);
	}
public static void main(String []args){
	Board board = new Board();
	int playerNO = 1;
	int[] position = {2,3};
	board.set_pawnPosition(playerNO, position);
	int[] expected = {2,3};
	int[] actual = board.get_pawnPosition(playerNO);
	System.out.println(actual[0]);
}
}
