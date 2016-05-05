package code.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FormulaCards {
	
	private int[] _tokens;
	private String[] _names = new String[21];
	
	public FormulaCards(){
		_tokens = new int[3];
		_names[0]= "Crab Apple";
		_names[1]= "Pine Cone";
		_names[2]= "Oak Leaf";
		_names[3]= "Oil of Black Slugs";
		_names[4]= "Four-leaf Clover";
		_names[5]= "Garlic";
		_names[6]= "Raven's Feather";
		_names[7]= "Henbane";
		_names[8]= "Spider";
		_names[9]= "Skull";
		_names[10]= "Magic Wand Made of Blindworm";
		_names[11]= "Quartz";
		_names[12]= "Toad";
		_names[13]= "Fire Salamander";
		_names[14]= "Weasel Spit";
		_names[15]= "Silver Thistle";
		_names[16]= "Snake";
		_names[17]= "Emerald";
		_names[18]= "Root of Mandrake";
		_names[19]= "Black Rooster";
		_names[20]= "Berries of Mistletoe";
		ArrayList<Integer> shown = new ArrayList<Integer>();
		while(shown.size()<21){
			Random random = new Random();
			int rand = random.nextInt(21)+1;
			if(rand==21 && !shown.contains(25)){
				shown.add(25);
			}
			else if(shown.contains(rand) == false && rand!=21){
			shown.add(rand);
			}
	}
		_tokens[0] = shown.get(0);
		_tokens[1] = shown.get(1);
		_tokens[2] = shown.get(2);
	}
	
	public int[] getToken(){
		return _tokens;
	}
	
	public void setToken(int[] i){
		 _tokens = i;
	}	
	
	public String tokensToString(){
		return Arrays.toString(_tokens);
	}
	public String getNameToken(int tokenNo){
		if(tokenNo == 25){
			return _names[20];
		}
		else{
			return _names[tokenNo-1];
		}
	}
}
