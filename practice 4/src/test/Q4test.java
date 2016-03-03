package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Q4;

public class Q4test {

	public void generalTest1(String input, boolean expected){
		Q4 q4 = new Q4();
		boolean actual = q4.accept(input);
		assertTrue("Expected= "+expected+"Actual= "+actual,expected==actual);
		
	}
	
	
	public void generalTest2(String input, boolean expected){
		Q4 q4 = new Q4();
		boolean actual = q4.phone(input);
		assertTrue("Expected: "+expected+" Actual: "+actual,expected == actual);
		
	}
	

	public void generalTest3(String input, String s, int expected){
		Q4 q4 = new Q4();
		int actual;
		if(q4.wordCount(input).containsKey(s)){
			actual = q4.wordCount(input).get(s);
		}
		else{
			actual = 0;
		}
		
		assertTrue("Expected= "+expected+"  Actual= "+actual,actual==expected);
		
	}
	@Test
	public void test01() {
		String input = "/Users/david_000/Desktop/cs.txt";
		generalTest3(input,"number",1);
	}
	@Test
	public void test02() {
		String input = "/Users/david_000/Desktop/cs.txt";
		generalTest3(input,"to",3);
	}
	@Test
	public void test03() {
		String input = "/Users/david_000/Desktop/cs.txt";
		generalTest3(input,"0910",0);
	}
	@Test
	public void test4(){
		String input = "770-4719";
		generalTest2(input,true);
	}
	@Test
	public void test5(){
		String input = "(510)770-4719";
		generalTest2(input,true);
	}
	@Test
	public void test6(){
		String input = "(510-770-4719";
		generalTest2(input,false);
	}
	@Test
	public void test7(){
		String input = "hha";
		generalTest2(input,false);
	}
	@Test
	public void test8(){
		generalTest1("SWPDSW", true);
	}
	@Test
	public void test9(){
		generalTest1("SWPD",false);
	}
}
