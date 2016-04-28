package code.model;

import java.util.ArrayList;
import java.util.Random;

public class FormulaCards {
	
	private int _token1;
	private int _token2;
	private int _token3;
	
	public FormulaCards(){
		ArrayList<Integer> shown = new ArrayList<Integer>();
		while(shown.size()<21){
			Random random = new Random();
			int rand = random.nextInt(21)+1;
			if(shown.contains(rand) == false&&rand==21){
				shown.add(25);
				}
			if(shown.contains(rand) == false){
			shown.add(rand);
			}
	}
		
		_token1 = shown.get(0);
		_token2 = shown.get(1);
		_token3 = shown.get(2);
	}
	
	public int getToken1(){
		
		return _token1;
	}
	
	public int getToken2(){
		return _token2;
	}
	
	public int getToken3(){
		return _token3;
	}
	
}
