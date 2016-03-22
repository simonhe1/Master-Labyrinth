package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//note
// board class 
public class Board {
	
	private Tile[][] state = new Tile[7][7];
	
	private Tile extra = new Tile(1);
	
	//private ArrayList<int[]> triangle = new ArrayList<int[]>();
	
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
							 /*{1,1},{1,2},{1,3},{1,4},{1,5},
							 {2,1}      ,{2,3},      {2,5},	
							 {3,1},{3,2},{3,3},{3,4},{3,5},
							 {4,1},      {4,3},      {4,5},
							 {5,1},{5,2},{5,3},{5,4},{5,5},*/
	int[] token1={1,1};
	int[] token2={1,2};
	int[] token3={1,3};
	int[] token4={1,4};
	int[] token5={1,5};
	int[] token6={2,1};
	int[] token7={2,3};
	int[] token8={2,5};
	int[] token9={3,1};
	int[] token10={3,2};
	int[] token11={3,3};
	int[] token12={3,4};
	int[] token13={3,5};
	int[] token14={4,1};
	int[] token15={4,3};
	int[] token16={4,5};
	int[] token17={5,1};
	int[] token18={5,2};
	int[] token19={5,3};
	int[] token20={5,4};
	int[] token21={5,5};
	
	public Board(){
		n1 = 10;
		n2 = 10;
		n3 = 10;
		n4 = 10;
		n5 = 10;
		tokenPosition.add(token1);
		tokenPosition.add(token2);
		tokenPosition.add(token3);
		tokenPosition.add(token4);
		tokenPosition.add(token5);
		tokenPosition.add(token6);
		tokenPosition.add(token7);
		tokenPosition.add(token8);
		tokenPosition.add(token9);
		tokenPosition.add(token10);
		tokenPosition.add(token11);
		tokenPosition.add(token12);
		tokenPosition.add(token13);
		tokenPosition.add(token14);
		tokenPosition.add(token15);
		tokenPosition.add(token16);
		tokenPosition.add(token17);
		tokenPosition.add(token18);
		tokenPosition.add(token19);
		tokenPosition.add(token20);
		tokenPosition.add(token21);
		initialize();
		/*int[] tri1 = {0,1};
		int[] tri2 = {0,3};
		int[] tri3 = {0,5};
		int[] tri4 = {6,1};
		int[] tri5 = {6,3};
		int[] tri6 = {6,5};
		int[] tri7 = {1,0};
		int[] tri8 = {3,0};
		int[] tri9 = {5,0};
		int[] tri10 = {1,6};
		int[] tri11 = {3,6};
		int[] tri12 = {5,6};
		triangle.add(tri1);
		triangle.add(tri2);
		triangle.add(tri3);
		triangle.add(tri4);
		triangle.add(tri5);
		triangle.add(tri6);
		triangle.add(tri7);
		triangle.add(tri8);
		triangle.add(tri9);
		triangle.add(tri10);
		triangle.add(tri11);
		triangle.add(tri12);*/
	}

	public Board(int t1, int t2, int t3, int t4, int t5){
		
		if(t1+t2+t3+t4+t5 == 50){
			n1 = t1;
			n2 = t2;
			n3 = t3;
			n4 = t4;
			n5 = t5;
		}
		else{
			n1 = 10;
			n2 = 10;
			n3 = 10;
			n4 = 10;
			n5 = 10;
		}
		initialize();
		
		/*int[] tri1 = {0,1};
		int[] tri2 = {0,3};
		int[] tri3 = {0,5};
		int[] tri4 = {6,1};
		int[] tri5 = {6,3};
		int[] tri6 = {6,5};
		int[] tri7 = {1,0};
		int[] tri8 = {3,0};
		int[] tri9 = {5,0};
		int[] tri10 = {1,6};
		int[] tri11 = {3,6};
		int[] tri12 = {5,6};
		triangle.add(tri1);
		triangle.add(tri2);
		triangle.add(tri3);
		triangle.add(tri4);
		triangle.add(tri5);
		triangle.add(tri6);
		triangle.add(tri7);
		triangle.add(tri8);
		triangle.add(tri9);
		triangle.add(tri10);
		triangle.add(tri11);
		triangle.add(tri12);*/
		
		
	}
	
	
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
	
	public int[] get_tokenPosition(int tokenNO){
		switch(tokenNO){
		case 1:
			return token1;
		case 2:
			return token2;
		case 3:
			return token3;
		case 4:
			return token4;
		case 5:
			return token5;
		case 6:
			return token6;
		case 7:
			return token7;
		case 8:
			return token8;
		case 9:
			return token9;
		case 10:
			return token10;
		case 11:
			return token11;
		case 12:
			return token12;
		case 13:
			return token13;
		case 14:
			return token14;
		case 15:
			return token15;
		case 16:
			return token16;
		case 17:
			return token17;
		case 18:
			return token18;
		case 19:
			return token19;
		case 20:
			return token20;
		case 21:
			return token21;
		}
		int[] error = {-1,-1};
		return error;
		
	}
	
	public boolean set_tokenPosition(int tokenNO,int[] pos){
		switch(tokenNO){
		case 1:
			token1 = pos;
			return true;
		case 2:
			token2 = pos;
			return true;
		case 3:
			token3 = pos;
			return true;
		case 4:
			token4 = pos;
			return true;
		case 5:
			token5 = pos;
			return true;
		case 6:
			token6 = pos;
			return true;
		case 7:
			token7 = pos;
			return true;
		case 8:
			token8 = pos;
			return true;
		case 9:
			token9 = pos;
			return true;
		case 10:
			token10 = pos;
			return true;
		case 11:
			token11 = pos;
			return true;
		case 12:
			token12 = pos;
			return true;
		case 13:
			token13 = pos;
			return true;
		case 14:
			token14 = pos;
			return true;
		case 15:
			token15 = pos;
			return true;
		case 16:
			token16 = pos;
			return true;
		case 17:
			token17 = pos;
			return true;
		case 18:
			token18 = pos;
			return true;
		case 19:
			token19 = pos;
			return true;
		case 20:
			token20 = pos;
			return true;
		case 21:
			token21 = pos;
			return true;
		}
		return false;
		
	}
		
	
	public Tile placeOneTile(){
		
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
	
	
	public boolean isTile(Tile tile){
		int type = tile.type();
		boolean[] open = tile.open();
		return type>=1&&type<=5&&open.length==4;
	}
	
	
	public Tile[][] get_StateOfBoard(){
		return state;
	}
	
	public Tile get_ExtraTile(){
		return extra;
	}
	
	public boolean isTokenPosition(int[] position){
		for(int[] place:tokenPosition){
			if(place==position){
				return true;
			}
		}
		return false;
	}
	public void initialize(){
		//Run this code before starting.
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		Tile candidate;
		
		for(int i=0; i<=6; i++){
			for(int j=0; j<=6;j++){

				while(state[i][j]==null){

					candidate = placeOneTile();

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
		
		if(count1 < n1){
			extra = new Tile(1);
		}
		else if(count2 < n2){
			extra = new Tile(2);
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
	
		
		ArrayList<Integer> shown = new ArrayList<Integer>();
		while(shown.size()<21){
			Random random = new Random();
			int rand = random.nextInt(21);
			if(shown.contains(rand) == false){
			shown.add(rand);
			}
		}
		
//		while(shown.size()<21){
//			int index = (int)Math.round(Math.random()*21)-1; //0 ~ 20
//			if(shown.contains(index) == false){
//				shown.add(index);
//			}
//		}

		token1 = tokenPosition.get(shown.get(0));
		token2 = tokenPosition.get(shown.get(1));
		token3 = tokenPosition.get(shown.get(2));
		token4 = tokenPosition.get(shown.get(3));
		token5 = tokenPosition.get(shown.get(4));
		token6 = tokenPosition.get(shown.get(5));
		token7 = tokenPosition.get(shown.get(6));
		token8 = tokenPosition.get(shown.get(7));
		token9 = tokenPosition.get(shown.get(8));
		token10 = tokenPosition.get(shown.get(9));
		token11 = tokenPosition.get(shown.get(10));
		token12 = tokenPosition.get(shown.get(11));
		token13 = tokenPosition.get(shown.get(12));
		token14 = tokenPosition.get(shown.get(13));
		token15 = tokenPosition.get(shown.get(14));
		token16 = tokenPosition.get(shown.get(15));
		token17 = tokenPosition.get(shown.get(16));
		token18 = tokenPosition.get(shown.get(17));
		token19 = tokenPosition.get(shown.get(18));
		token20 = tokenPosition.get(shown.get(19));
		token21 = tokenPosition.get(shown.get(20));
		
		
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
			pushPlayer(tri,1);
			pushPlayer(tri,2);
			pushPlayer(tri,3);
			pushPlayer(tri,4);
			
			pushToken(tri,1);
			pushToken(tri,2);
			pushToken(tri,3);
			pushToken(tri,4);
			pushToken(tri,5);
			pushToken(tri,6);
			pushToken(tri,7);
			pushToken(tri,8);
			pushToken(tri,9);
			pushToken(tri,10);
			pushToken(tri,11);
			pushToken(tri,12);
			pushToken(tri,13);
			pushToken(tri,14);
			pushToken(tri,15);
			pushToken(tri,16);
			pushToken(tri,17);
			pushToken(tri,18);
			pushToken(tri,19);
			pushToken(tri,20);
			pushToken(tri,21);
			
			return true;

	}
	
	public boolean pushPlayer(int[] tri, int playerNO){
		int[] pos = get_pawnPosition(playerNO);
		
		//if(triangle.contains(tri)){
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
	
	public void set_Tile(int [] position, int type, int rotation){
		int row = position[0];
		int col = position[1];
		Tile tile = new Tile(type);
		for(int i = 0; i<rotation;i++){
			tile.rotate();
		}
		state[row][col] = tile;
	}
	
	
	
	
	//The idea behind "move" is we first check all possible (legal) positions for a player, make a set to store those positions' (x,y)
	//Then we see if the destination that player request is in the set. 
	//If yes, move the pawn to that position. If no, throw exception.
	
		//input x,y refers to the position that a player's pawn is standing.
		//this method returns an array containing x and y (x,y) which are the "legal" positions next to the pawn's current position.
		
		//check all the corresponding opens. If both open, then add that neighbor into output list.
		//This method only check the four neighbors of a tile. Later on, we'll use an iterator to check all possible moves.
	
	
	
	//This method returns a set of all legal moves.
	//It uses the previous method and a loop.
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
		return output;
		
		
	}
	
	public boolean containsArray(ArrayList<int[]> al, int[] arr){
		for(int i=0; i<al.size(); i++){
			if(al.get(i)[0] == arr[0] && al.get(i)[1] == arr[1]){
				return true;
			}
		}
		return false;
	}

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
			
			if(set.containsKey(request)){

				switch(playerNO){
				case 1:
					pawn1 = request;
					break;
				case 2:
					pawn2 = request;
					break;
				case 3:
					pawn3 = request;
					break;
				case 4:
					pawn4 = request;
					break;
				}
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}

	}

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
