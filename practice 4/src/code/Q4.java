package code;

import java.util.HashMap;

import javax.swing.JFrame;

public class Q4 extends JFrame {

	
	//state machine
	public boolean accept(String input){
		boolean output = false;
		int state = 0;
		for(int i=0; i<=input.length()-1; i++){
			switch(state){
			case 0:
				if(input.charAt(i)=='S'){
					state = 1;
				}
				else
					return false;
				break;
			case 1:
				if(input.charAt(i)=='W'){
					state = 2;
				}
				else
					return false;
				break;
			case 2:
				if(input.charAt(i)=='P'){
					state = 3;
				}
				else
					return false;
				break;
			case 3:
				if(input.charAt(i)=='D'){
					state = 0;
				}
				else
					return false;
				break;
			}
			
		}
		if(state == 2){
			output = true;
		}
		return output;
	}
	
//	public boolean accept(String input){
//		
//		char cur;
//		int state = 0;
//		for(int i=0; i<=input.length()-1; i++){
//			cur = input.charAt(i);
//			switch(state){
//				case 0:
//					if(cur == 'S')
//						state = 1;
//					else
//						return false;
//					break;
//				case 1:
//					if(cur =='W'){
//						if(i == input.length()-1){
//							return true;
//						}
//						state = 2;
//					}
//					else
//						return false;
//					break;
//				case 2:
//				
//					if(cur == 'P')
//						state = 3;
//					else
//						return false;
//					break;
//				case 3:
//					if(cur == 'D')
//						state = 0;
//					else
//						return false;
//		}
//		}
//	return false;
//	}
	

	//phone
	
	public boolean phone(String input){
		
		boolean output = false;
		String state = "0";
		char cur;
		for(int i=0; i<=input.length()-1; i++){
			cur = input.charAt(i);
			switch(state){
			case "0":
				if(cur == '(')
					state = "A1";
				else if(cur == '+')
					state = "B1";
				else if(cur>='0'&&cur<='9')
					state = "2";
				break;
			case "A1":
				if(cur>='0'&&cur<='9')
					state = "A2";
				else
					return false;
				break;
			case "A2":
				if(cur>='0'&&cur<='9')
					state = "A3";
				else
					return false;
				break;
			case "A3":
				if(cur>='0'&&cur<='9')
					state = "A4";
				else
					return false;
				break;
			case "A4":
				if(cur ==')')
					state = "1";
				else
					return false;
				break;
			case "B1":
				if(cur =='1')
					state = "B2";
				else
					return false;
				break;
			case "B2":
				if(cur == '-')
					state = "B3";
				else
					return false;
				break;
			case "B3":
				if(cur>='0'&& cur<='9')
					state = "B4";
				else
					return false;
				break;
			case "B4":
				if(cur>='0'&& cur<='9')
					state = "B5";
				else
					return false;
				break;
			case "B5":
				if(cur>='0'&& cur<='9')
					state = "B6";
				else
					return false;
				break;
			case "B6":
				if(cur == '-')
					state = "1";
				else
					return false;
				break;
			case "1":
				if(cur>='0'&& cur<='9')
					state = "2";
				else
					return false;
				break;
			case "2":
				if(cur>='0'&& cur<='9')
					state = "3";
				else
					return false;
				break;
			case "3":
				if(cur>='0'&& cur<='9')
					state = "4";
				else
					return false;
				break;
			case "4":
				if(cur == '-')
					state = "5";
				else
					return false;
				break;
			case "5":
				if(cur>='0'&& cur<='9')
					state = "6";
				else
					return false;
				break;
			case "6":
				if(cur>='0'&& cur<='9')
					state = "7";
				else
					return false;
				break;
			case "7":
				if(cur>='0'&& cur<='9')
					state = "8";
				else
					return false;
				break;
			case "8":
				if(cur>='0'&& cur<='9')
					state = "9";
				else
					return false;
				break;
			case "9":
				state = "too Much!!";
				break;
			
			}
			
		}
		
		if(state == "9"){
				output = true;
			}
		return output;
	}
	
	

	
	//HashMap  "C:\Users\david_000\Desktop\cs.text"
	
	public HashMap<String, Integer> wordCount(String input){
		HashMap<String, Integer> output = new HashMap<String, Integer>();
		String word = "";
		char cur = 'a';
		CharacterFromFileReader data = new CharacterFromFileReader(input);
		while(data.hasNext()){
			cur = data.next();
			if(cur != '\t'&&cur != ' '&&cur != '\n'&&cur != ','&&cur != '.'){
				word = word + cur;
			}
			 
			if(cur == '\t'||cur == ' '||cur == '\n'||cur == ','||cur == '.'){
				
				if(output.containsKey(word)){
					output.put(word, output.get(word)+1);
				}
				else{
					output.put(word, 1);	
				}
	
				word = "";
			}

		}

		return output;
	}
	
	
	public static void main(String[] arg){
		Q4 q4 = new Q4();
		System.out.println(110 / 16);
		//System.out.println(q4.accept("SWPD"));

		
		
	}
}
