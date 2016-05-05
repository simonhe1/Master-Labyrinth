package code.model;
//
import java.util.ArrayList;

import code.fileIO.FileIO;

public class Load {
	private String _filename;
	private ArrayList<String> name = new ArrayList<String>();
	private ArrayList<String> color = new ArrayList<String>();
	private ArrayList<String> wand = new ArrayList<String>();
	private ArrayList<ArrayList<String>> formula = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> tokensGot = new ArrayList<ArrayList<String>>();
	private ArrayList<String> types = new ArrayList<String>();
	private ArrayList<Integer> token = new ArrayList<Integer>();
	private ArrayList<ArrayList<String>> player = new ArrayList<ArrayList<String>>();
	private String IllegalInsert = "0";
	
	public Load(String filename){
		_filename = filename;
		load();
	}
	

	public ArrayList<String> getName(){
		return name;
	}
	public ArrayList<String> getColor(){
		return color;
	}
	public ArrayList<String> getWand(){
		return wand;
	}
	public ArrayList<ArrayList<String>> getFormula(){
		return formula;
	}
	public ArrayList<ArrayList<String>> getTokensGot(){
		return tokensGot;
	}
	public ArrayList<String> getTypes(){
		return types;
	}
	public ArrayList<Integer> getToken(){
		return token;
	}
	public ArrayList<ArrayList<String>> getPlayer(){
		return player;
	}
	public String getIllegalInsert(){
		return IllegalInsert;
	}
	private String getSaved(String filename){
		FileIO fi = new FileIO();
		return fi.readFileToString(filename);
	}
	
	private ArrayList<Integer> IndexofPattern(String s, String pattern){
		ArrayList<Integer> index = new ArrayList<Integer>();
		String input = s;
		int pre = 0;
		while(input.indexOf(pattern)>0){
			int i = input.indexOf(pattern);
			index.add(i + pre);
			pre = index.get(index.size()-1)+1;
			input = input.substring(i+1);
		}
		return index;
	}
	
	private void load(){
		
		String line = getSaved(_filename);
		String line1 = line.substring(0, line.indexOf("]][")+2);
		String line2 = line.substring(line.indexOf("]][")+2, line.lastIndexOf("]")+1);
		String line3 = line.substring(line.lastIndexOf("]")+1);

		//Put line1's info into five ArrayLists
		ArrayList<Integer> pos = IndexofPattern(line1, "]]");
		
		for(int i=0; i<pos.size(); i++){
			String element = "";
			if(i==0){
				element = line1.substring(0, pos.get(i)+2);
			}
			else{
				element = line1.substring(pos.get(i-1)+3, pos.get(i)+2);
			}
		
			ArrayList<Integer> comma = IndexofPattern(element, ",");
			name.add(element.substring(1, comma.get(0)));
			color.add(element.substring(comma.get(0)+1, comma.get(1)));
			wand.add(element.substring(comma.get(1)+1, comma.get(2)));
			
			ArrayList<Integer> bracket = IndexofPattern(element, ",[");
			String f = element.substring(bracket.get(0)+1, bracket.get(1));
			toArrayList(f, formula);
			String t = element.substring(bracket.get(1)+1, element.length()-1);
			if(t.length()>2){
				toArrayList(t, tokensGot);
			}
			else{
				tokensGot.add(null);
			}

		}

		//Put line2's info into three ArrayLists

		for(int i=0; i<49; i++){
			String element = line2.substring(0, line2.indexOf("]]")+2);
			types.add(element.substring(1, 3));
			token.add(Integer.decode(element.substring(element.indexOf(',')+1, element.lastIndexOf(",["))));
			String p = element.substring(element.indexOf(",[")+1, element.indexOf("]]")+1);
			if(p.length()>2){
				toArrayList(p, player);
				player.get(i).remove(player.get(i).size()-1);
			}
			else{
				player.add(null);
			}
			
			if(i < 48){
				line2 = line2.substring(line2.indexOf("]]")+3);
			}

		}
		
		//Put line3 in a String
		IllegalInsert = line3;
		
		
	}
	
	public String getPlayerName(String _color){
		for(int i=0;i<color.size();i++){
			if(color.get(i)==_color){
				return name.get(i);
			}
		}
		return null;
		
	}
	
	private void toArrayList(String s, ArrayList<ArrayList<String>> list){
		ArrayList<Integer> comma = IndexofPattern(s, ",");
		ArrayList<String> formulaList = new ArrayList<String>();
		for(int j=0; j<=comma.size(); j++){
			if(j==0){
				formulaList.add(s.substring(1, comma.get(j)));
			}
			else if(j==comma.size()){
				formulaList.add(s.substring(comma.get(j-1)+1, s.length()-1));
			}
			else{
				formulaList.add(s.substring(comma.get(j-1)+1, comma.get(j)));
			}
			
		}
		list.add(formulaList);
	}

}
