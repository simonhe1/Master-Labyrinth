package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;

public class Get_tokenPositionTests {
	@Test public void test01(){
		Board board = new Board();
		int input = 1;
		int row = 0;
		int col = 0;
		/*while(row!=)*/
		int[] expected = {1,1};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test02(){
		Board board = new Board();
		int input = 2;
		int[] expected = {1,2};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test03(){
		Board board = new Board();
		int input = 3;
		int[] expected = {1,3};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test04(){
		Board board = new Board();
		int input = 4;
		int[] expected = {1,4};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test05(){
		Board board = new Board();
		int input = 5;
		int[] expected = {1,5};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test06(){
		Board board = new Board();
		int input = 6;
		int[] expected = {2,1};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test07(){
		Board board = new Board();
		int input = 7;
		int[] expected = {2,3};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test08(){
		Board board = new Board();
		int input = 1;
		int[] expected = {2,5};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
	@Test public void test09(){
		Board board = new Board();
		int input = 9;
		int[] expected = {3,1};
		int[] actual = board.get_tokenPosition(input);
		int counter = 0;
		for(int i = 0; i<2; i++){
			if(expected[i] == actual[i]){
				counter++;
			}
		}
		assertTrue("Expected: "+expected+" Actual: "+actual,counter==2);
		
	}
}
