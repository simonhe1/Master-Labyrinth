package code;

import java.util.ArrayList;
import java.util.Random;
//note
// board class 
public class Board {
	
	private Tile[][] state = new Tile[7][7];
	
	private Tile extra = new Tile(1);
	
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int n5;
	
	private int[] pawn1 = {2,2};
	private int[] pawn2 = {2,4};
	private int[] pawn3 = {4,2};
	private int[] pawn4 = {4,4};
	
	private int pawn1Wands = 3;
	private int pawn2Wands = 3;
	private int pawn3Wands = 3;
	private int pawn4Wands = 3;
	
	private ArrayList<Integer> score1 = new ArrayList<Integer>();
	private ArrayList<Integer> score2 = new ArrayList<Integer>();
	private ArrayList<Integer> score3 = new ArrayList<Integer>();
	private ArrayList<Integer> score4 = new ArrayList<Integer>();
	private int curToken = 1;
	
	
	private ArrayList<int[]> tokenPosition = new ArrayList<int[]>();
		
	private int[] tokenPos1={1,1};
	private int[] tokenPos2={1,2};
	private int[] tokenPos3={1,3};
	private int[] tokenPos4={1,4};
	private int[] tokenPos5={1,5};
	private int[] tokenPos6={2,1};
	private int[] tokenPos7={2,3};
	private int[] tokenPos8={2,5};
	private int[] tokenPos9={3,1};
	private int[] tokenPos10={3,2};
	private int[] tokenPos11={3,3};
	private int[] tokenPos12={3,4};
	private int[] tokenPos13={3,5};
	private int[] tokenPos14={4,1};
	private int[] tokenPos15={4,3};
	private int[] tokenPos16={4,5};
	private int[] tokenPos17={5,1};
	private int[] tokenPos18={5,2};
	private int[] tokenPos19={5,3};
	private int[] tokenPos20={5,4};
	private int[] tokenPos21={5,5};
	
	private ArrayList<int[]> token = new ArrayList<int[]>();

	
	//Constructor for tile type number not specified 
	//use default 6,6,6,6,9
	private void addTokenPosition(){
		tokenPosition.add(tokenPos1);
		tokenPosition.add(tokenPos2);
		tokenPosition.add(tokenPos3);
		tokenPosition.add(tokenPos4);
		tokenPosition.add(tokenPos5);
		tokenPosition.add(tokenPos6);
		tokenPosition.add(tokenPos7);
		tokenPosition.add(tokenPos8);
		tokenPosition.add(tokenPos9);
		tokenPosition.add(tokenPos10);
		tokenPosition.add(tokenPos11);
		tokenPosition.add(tokenPos12);
		tokenPosition.add(tokenPos13);
		tokenPosition.add(tokenPos14);
		tokenPosition.add(tokenPos15);
		tokenPosition.add(tokenPos16);
		tokenPosition.add(tokenPos17);
		tokenPosition.add(tokenPos18);
		tokenPosition.add(tokenPos19);
		tokenPosition.add(tokenPos20);
		tokenPosition.add(tokenPos21);
	}
	public Board(){
		n1 = 6;
		n2 = 6;
		n3 = 6;
		n4 = 6;
		n5 = 9;
		addTokenPosition();
		initialize();
	
	}
	//Constructor for tile type number specified 
	//if sum != 33, use default 6,6,6,6,9
	public Board(int t1, int t2, int t3, int t4, int t5){
		
		if(t1+t2+t3+t4+t5 == 33){
			n1 = t1;
			n2 = t2;
			n3 = t3;
			n4 = t4;
			n5 = t5;
		}
		else{
			n1 = 6;
			n2 = 6;
			n3 = 6;
			n4 = 6;
			n5 = 9;
		}
		addTokenPosition();
		initialize();

	}
	
	//Returns the position of the player
	public int[] get_pawnPosition(int playerNO){
		
			switch(playerNO){
			case 1:
				return pawn1;
			case 2:
				return pawn2;
			case 3:
				return pawn3;
			case 4:
				return pawn4;
			}
		
			int[] error = {-1,-1};
			return error;
	}
	
	//Sets new designated position of player
	//Used in mainly the move and insert method
	public boolean set_pawnPosition(int playerNO, int[] pos){
		switch(playerNO){
		case 1:
			pawn1 = pos;
			return true;
		case 2:
			pawn2 = pos;
			return true;
		case 3:
			pawn3 = pos;
			return true;
		case 4:
			pawn4 = pos;
			return true;
		}
		return false;
	}
	
	//Ranges from 1-21 and gets the position of the token number 
	public int[] get_tokenPosition(int tokenNO){
		if(tokenNO>=1 && tokenNO <=21){
			return token.get(tokenNO-1);
		}
		
		int[] error = {-1,-1};
		return error;
		
	}
	
	//Sets the position of a token
	//This method is mainly used in the insert method
	public boolean set_tokenPosition(int tokenNO,int[] pos){
		if(tokenNO>=1 && tokenNO <=21){
			 token.set(tokenNO-1,pos);
		}
		return false;
		
	}
		
	//This method was create solely for testing to check whether the input is a tile
	public boolean isTile(Tile tile){
		int type = tile.type();
		boolean[] open = tile.open();
		return type>=1&&type<=5&&open.length==4;
	}
	
	//This was created mainly for testing in order to access the board 
	public Tile[][] get_StateOfBoard(){
		return state;
	}
	
	//This was created mainly for testing in order to access the extra tile
	public Tile get_ExtraTile(){
		return extra;
	}
	
	//This was used for testing in order to check whether initially the tokens were placed
	//Correctly in the 5 x 5 positions (Not including the players)
	public boolean isTokenPosition(int[] position){
		for(int[] place:tokenPosition){
			if(place[0]==position[0] && place[1]==position[1]){
				return true;
			}
		}
		return false;
	}
	
	//Gets a random tile with random type and random amount of rotations
	public Tile getRandomTile(){
		
		int randomType;
		int rotTime;
		Tile output;
		
		randomType = (int)Math.round(Math.random()*5);
		rotTime = (int)Math.round(Math.random()*4);
		
		output = new Tile(randomType);
		for(int k=1; k<=rotTime; k++){
			output.rotate();
		}
		return output;
	}
	
	public void initialize(){
		//Run this code before starting.
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		Tile candidate;
		
		//placing the 16 fixed tiles
		int[] pos1 = {0,0};
		set_Tile(pos1, 2, 1);
		int[] pos2 = {0,2};
		set_Tile(pos2, 4, 2);
		int[] pos3 = {0,4};
		set_Tile(pos3, 4, 2);
		int[] pos4 = {0,6};
		set_Tile(pos4, 2, 2);
		int[] pos5 = {2,0};
		set_Tile(pos5, 4, 1);
		int[] pos6 = {2,2};
		set_Tile(pos6, 4, 1);
		int[] pos7 = {2,4};
		set_Tile(pos7, 4, 2);
		int[] pos8 = {2,6};
		set_Tile(pos8, 4, 3);
		int[] pos9 = {4,0};
		set_Tile(pos9, 4, 1);
		int[] pos10 = {4,2};
		set_Tile(pos10, 4, 0);
		int[] pos11 = {4,4};
		set_Tile(pos11, 4, 3);
		int[] pos12 = {4,6};
		set_Tile(pos12, 4, 3);
		int[] pos13 = {6,0};
		set_Tile(pos13, 2, 0);
		int[] pos14 = {6,2};
		set_Tile(pos14, 4, 0);
		int[] pos15 = {6,4};
		set_Tile(pos15, 4, 0);
		int[] pos16 = {6,6};
		set_Tile(pos16, 2, 3);
		
		//placing the 33 flexible tiles
		for(int i=0; i<=6; i++){
			for(int j=0; j<=6;j++){

				while(state[i][j]==null){

					candidate = getRandomTile();

					switch(candidate.type()){
					case 1:
						if(count1<n1){
							state[i][j] = candidate;
							count1++;
						}
						break;
					case 2:
						if(count2<n2){
							state[i][j] = candidate;
							count2++;
						}
						break;
					case 3:
						if(count3<n3){
							state[i][j] = candidate;
							count3++;
						}
						break;
					case 4:
						if(count4<n4){
							state[i][j] = candidate;
							count4++;
						}
						break;
					case 5:
						if(count5<n5){
							state[i][j] = candidate;
							count5++;
						}
						break;

					}

				}

			}

		}
		
		
		//find the extra tile
		if(count1 < n1){
			extra = new Tile(2);
		}
		else if(count2 < n2){
			extra = new Tile(1);
		}
		else if(count3 < n3){
			extra = new Tile(3);
		}
		else if(count4 < n4){
			extra = new Tile(4);
		}
		else if(count5 < n5){
			extra = new Tile(5);
		}
	
		//ArrayList shown contains a sequence of random 1~21 integers
		ArrayList<Integer> shown = new ArrayList<Integer>();
		while(shown.size()<21){
			Random random = new Random();
			int rand = random.nextInt(21);
			if(shown.contains(rand) == false){
			shown.add(rand);
			}
		}
		
		for(int i=0; i<shown.size(); i++){
			Integer randomNum = shown.get(i);
			int[] pos = tokenPosition.get(randomNum);
			token.add(pos.clone());
		}
		
		
		
	}
	
	public boolean insert(int[] tri, int rotTime){
		//change state by moving tiles for 1 block and put extra to the triangle position. 
		//extra = (renew extra) The tile squeezed out by insertion.
		
		Tile out;
		int triRow = tri[0];
		int triCol = tri[1];
			
			if(triRow == 0){
				if(triCol == 1 || triCol == 3 || triCol == 5){
				out = state[triRow + 6][triCol];
				for(int i=6; i>0;i--){
					state[triRow + i][triCol] = state[triRow + (i-1)][triCol];
				}

				for(int i=1; i<=rotTime; i++){
					extra.rotate();
				}

				state[triRow][triCol] = extra;
				extra = out;
				
				}
				else{return false;}
			}
			else if(triRow == 6){
				if(triCol == 1 || triCol == 3 || triCol == 5){
				out = state[triRow - 6][triCol];
				for(int i=6; i>0;i--){
					state[triRow  - i][triCol] = state[triRow  - (i-1)][triCol];
				}
				
				for(int i=1; i<=rotTime; i++){
					extra.rotate();
				}

				state[triRow][triCol] = extra;
				extra = out;
				
				}
				else{return false;}
			}
			else if(triCol == 0){
				if(triRow == 1 || triRow == 3 || triRow == 5){
				out = state[triRow][triCol + 6];
				for(int i=6; i>0; i--){
					state[triRow][triCol + i] = state[triRow][triCol + (i-1)];
				}
				for(int i=1; i<=rotTime; i++){
					extra.rotate();
				}

				state[triRow][triCol] = extra;
				extra = out;
				
				}
				else{return false;}
			}
			else if(triCol == 6){
				if(triRow == 1 || triRow == 3 || triRow == 5){
				out = state[triRow][triCol-6];
				for(int i=6; i>0; i--){
					state[triRow][triCol - i] = state[triRow][triCol - (i-1)];
				}
				for(int i=1; i<=rotTime; i++){
					extra.rotate();
				}

				state[triRow][triCol] = extra;
				extra = out;
				}
				else{return false;}
			}
			else{return false;}
			for(int i=1; i<=4; i++){
				pushPlayer(tri,i);
			}
			
			for(int i=1; i<=21; i++){
				pushToken(tri,i);
			}
			
			return true;

	}
	
	//Used when the insert method is called, moves player along with column or row
	public boolean pushPlayer(int[] tri, int playerNO){
		int[] pos = get_pawnPosition(playerNO);
		
			if(tri[0] == 0){
				if(tri[1] == 1 || tri[1] == 3 || tri[1] == 5){
					if(pos[1] == tri[1]){
						if(pos[0] != 6){
							pos[0]++;
						}
						else if(pos[0] == 6){
							pos[0] = 0;
						}
					}
				}
				else{return false;}
			}
			if(tri[0] == 6){
				if(tri[1] == 1 || tri[1] == 3 || tri[1] == 5){
					if(pos[1] == tri[1]){
						if(pos[0] != 0){
							pos[0]--;
						}
						else if(pos[0] == 0){
							pos[0] = 6;
						}
					}
				}
				else{return false;}
			}
			if(tri[1] == 0){
				if(tri[0] == 1 || tri[0] == 3 || tri[0] == 5){
					if(pos[0] == tri[0]){
						if(pos[1] != 6){
							pos[1]++;
						}
						else if(pos[1] == 6){
							pos[1] = 0;
						}
					}
				}
				else{return false;}
			}
			if(tri[1] == 6){
				if(tri[0] == 1 || tri[0] == 3 || tri[0] == 5){
					if(pos[0] == tri[0]){
						if(pos[1] != 0){
							pos[1]--;
						}
						else if(pos[1] == 0){
							pos[1] = 6;
						}
					}
				}
				else{return false;}
		}
		set_pawnPosition(playerNO,pos);
		
		return true;

	}
	
	//Used when the insert method is called, moves token along with column or row
	public boolean pushToken(int[] tri, int tokenNO){
		int[] pos = get_tokenPosition(tokenNO);
		
			if(tri[0] == 0){
				if(tri[1] == 1 || tri[1] == 3 || tri[1] == 5){
					if(pos[1] == tri[1]){
						if(pos[0] != 6){
							pos[0]++;
						}
						else if(pos[0] == 6){
							pos[0] = 0;
						}
					}
				}
				else{return false;}
			}
			if(tri[0] == 6){
					if(tri[1] == 1 || tri[1] == 3 || tri[1] == 5){
						if(pos[1] == tri[1]){
							if(pos[0] != 0){
								pos[0]--;
							}
							else if(pos[0] == 0){
								pos[0] = 6;
							}
						}
					}
					else{return false;}
			}
			if(tri[1] == 0){
				if(tri[0] == 1 || tri[0] == 3 || tri[0] == 5){
					if(pos[0] == tri[0]){
						if(pos[1] != 6){
							pos[1]++;
						}
						else if(pos[1] == 6){
							pos[1] = 0;
						}
					}
				}
				else{return false;}
			}
			if(tri[1] == 6){
				if(tri[0] == 1 || tri[0] == 3 || tri[0] == 5){
					if(pos[0] == tri[0]){
						if(pos[1] != 0){
							pos[1]--;
						}
						else if(pos[1] == 0){
							pos[1] = 6;
						}
					}
				}
				else{return false;}
			}
		
		set_tokenPosition(tokenNO,pos);
		
		return true;

	}
	
	//Used to set the tile to a specific position on the board
	public void set_Tile(int [] position, int type, int rotation){
		int row = position[0];
		int col = position[1];
		Tile tile = new Tile(type);
		for(int i = 0; i<rotation;i++){
			tile.rotate();
		}
		state[row][col] = tile;
	}
		
	//check all the corresponding opens. If both open, then add that neighbor into output list.
	//This method only check the four neighbors of a tile. 
	//Later on, we'll use an iterator to check all possible moves.
	public ArrayList<int[]> checkNeighbor(int[] pos){

		ArrayList<int[]> output = new ArrayList<int[]>();

		int inputR = pos[0];
		int inputC = pos[1];

		Tile currentTile = state[inputR][inputC];
		
		if(currentTile.curOpen()[0] == true){
			if(inputR != 0){
				Tile upTile = state[inputR-1][inputC];
				
				if(upTile.curOpen()[2] == true){
					int [] outputUP = new int[2];
					outputUP[0] = inputR-1;
					outputUP[1] = inputC;
					output.add(outputUP);
				}
			}

		}
		if(currentTile.curOpen()[1] == true){

			if(inputC != 6){
				Tile rightTile = state[inputR][inputC+1];

				if(rightTile.curOpen()[3] == true){
					int [] outputRIGHT = new int[2];
					outputRIGHT[0] = inputR;
					outputRIGHT[1] = inputC+1;
					output.add(outputRIGHT);
				}
			}

		}

		if(currentTile.curOpen()[2] == true){

			if(inputR != 6){
				Tile downTile = state[inputR+1][inputC];

				if(downTile.curOpen()[0] == true){
					int [] outputDOWN = new int[2];
					outputDOWN[0] = inputR+1;
					outputDOWN[1] = inputC;
					output.add(outputDOWN);
				}
			}

		}

		if(currentTile.curOpen()[3] == true){

			if(inputC != 0){
				Tile leftTile = state[inputR][inputC-1];

				if(leftTile.curOpen()[1] == true){
					int [] outputLEFT = new int[2];
					outputLEFT[0] = inputR;
					outputLEFT[1] = inputC-1;
					output.add(outputLEFT);
				}
			}

		}
		return output;

	}
	
	//input pos refers to the position that a player's pawn is standing.
	//this method adds the possible positions to an ArrayList which contains all possible positions
	//in which the player can move to
	//It iterates checkNeighbor to explore all connected tiles
	public ArrayList<int[]> legalMoves(int[] pos){
		ArrayList<int[]> output = (checkNeighbor(pos));
		ArrayList<int[]> neighbor;
		for(int i=0; i<output.size(); i++){
			neighbor = checkNeighbor(output.get(i));
			for(int j=0; j<neighbor.size(); j++){
				if(!containsArray(output, neighbor.get(j))){
					output.add(neighbor.get(j).clone());
				}
			}
		}
		
		//removing the current pos of player
//		for(int[] coordinate: output){
//			if(coordinate[0]==pos[0] && coordinate[1]==pos[1]){
//				output.remove(coordinate);
//			}
//		}
		
		
		return output;
		
		
	}
	
	//checks whether the int[] arr is inside the ArrayList al by "comparing" values
	public boolean containsArray(ArrayList<int[]> al, int[] arr){
		for(int i=0; i<al.size(); i++){
			if(al.get(i)[0] == arr[0] && al.get(i)[1] == arr[1]){
				return true;
			}
		}
		return false;
	}

	//The idea behind "move" is we first check all possible (legal) positions for a player, make a set to store those positions' (x,y)
	//Then we see if the destination that player request is in the set. 
	//If yes, it returns true and moves the pawn to that position. If no, it returns false.
	public boolean move(int playerNO, int[] request){

		if(playerNO>= 1 && playerNO<=4){
			int[] pos = {0,0};
			

			switch(playerNO){
			case 1:
				pos = pawn1;
				break;
			case 2:
				pos = pawn2;
				break;
			case 3:
				pos = pawn3;
				break;
			case 4:
				pos = pawn4;
				break;
			}
			ArrayList<int[]> set = legalMoves(pos);
			
			if(containsArray(set,request)){

				switch(playerNO){
				case 1:
					pawn1 = request;
					return true;
				case 2:
					pawn2 = request;
					return true;
				case 3:
					pawn3 = request;
					return true;
				case 4:
					pawn4 = request;
					return true;
				}
				return false;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}

	}
	
	//adds the current eatable token to the player
	//increments the current eat token
	public void eat(int playerNO){
		if(playerNO>=1 && playerNO<=4){
				switch(playerNO){
			case 1:
				score1.add(curToken);
				curToken++;
				break;
			case 2:
				score2.add(curToken);
				curToken++;
				break;
			case 3:
				score3.add(curToken);
				curToken++;
				break;
			case 4:
				score4.add(curToken);
				curToken++;
				break;
			}
		}
		
	}
	
	//shows the score of the player
	public ArrayList<Integer> showScore(int playerNO){
		if(playerNO>=1 && playerNO<=4){
			switch(playerNO){
			case 1:
				return score1;
			case 2:
				return score2;
			case 3:
				return score3;
			case 4:
				return score4;
			}
			return null;
		}
		return null;
	}
	
	//gives the player an opportunity to go again
	public Integer useMagicWand(int playerNO){
		if(playerNO>=1 && playerNO<=4){
		switch(playerNO){
		case 1:
			if(pawn1Wands>0){
			pawn1Wands = pawn1Wands - 1;
			return pawn1Wands;
			}
			else{
				playerNO=5;
				break;
			}
		case 2:
			if(pawn2Wands>0){
			pawn2Wands = pawn2Wands - 1;
			return pawn2Wands;
			}
			else{
				playerNO=5;
				break;
			}
		case 3:
			if(pawn3Wands>0){
			pawn3Wands = pawn3Wands - 1;
			return pawn3Wands;
			}
			else{
				playerNO=5;
				break;
			}
		case 4:
			if(pawn4Wands>0){
			pawn4Wands = pawn4Wands - 1;
			return pawn4Wands;
			}
			else{
				playerNO=5;
				break;
			}
		case 5:
			return -1;
			}
		}
		return -1;
	}
	
	//gets the amount of wands the player has left
	public Integer getMagicWands(int playerNO){
		if(playerNO>=1 && playerNO<=4){
			switch(playerNO){
			case 1:
				return pawn1Wands;
			case 2:
				return pawn2Wands;
			case 3:
				return pawn3Wands;
			case 4:
				return pawn4Wands;
			}
		}
	return -1;
	}
	
}
