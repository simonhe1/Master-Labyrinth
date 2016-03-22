package boardTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Board;

public class useMagicWandTest {
	@Test public void test01(){
		Board b = new Board();
		int expected = 2;
		int actual = b.useMagicWand(1);
		assertTrue("Expected was"+expected+"but actual was"+actual,expected==actual);
		
		
	}
		@Test public void test02(){
		Board b = new Board();
		int expected = -1;
		int actual = b.useMagicWand(5);
		assertTrue("Expected was"+expected+"but actual was"+actual,expected==actual);
			
			
		}
		@Test public void test03(){
			Board b = new Board();
			b.useMagicWand(1);
			int expected = 1;
			int actual = b.useMagicWand(1);
			assertTrue("Expected was"+expected+"but actual was"+actual,expected==actual);
			}
}

