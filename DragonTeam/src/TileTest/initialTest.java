package TileTest;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Tile;

public class initialTest {

	
	public void generaltest2(int input, boolean[] expected) {
		Tile t = new Tile(input);
		boolean[] actual = t.initial();
		assertTrue( "Expected was " +expected+ "but actual was" + actual, (expected[0] == actual[0]) && (expected[1] == actual[1]) && (expected[2] == actual[2]) && (expected[3] == actual[3]));
	}

	@Test
	public void test01() {
		boolean[] ex = {true,false,false,false};
		generaltest2(1, ex);
		}

	@Test
	public void test02() {
		boolean[] ex = {true,true,false,false};
		generaltest2(2, ex);
		}

	@Test
	public void test03() {
		boolean[] ex = {true,false,true,false};
		generaltest2(3, ex);
		}
	@Test
	public void test04() {
		boolean[] ex = {true,true,false,true};
		generaltest2(4, ex);
		}
	@Test
	public void test05() {
		boolean[] ex = {true,true,true,true};
		generaltest2(5, ex);
		}
}
