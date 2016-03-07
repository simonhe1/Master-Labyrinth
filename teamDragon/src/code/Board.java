package code;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {
	
	private Tile[][] state = new Tile[7][7];
	
	private Tile extra = new Tile(1);
	
	private int[] pawn1 = {2,3};
	private int[] pawn2 = {2,4};
	private int[] pawn3 = {4,2};
	private int[] pawn4 = {4,4};
	
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int n5;

	private ArrayList<int[]> triangle = new ArrayList<int[]>();
	
	Board(int t1, int t2, int t3, int t4, int t5){
		
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
		
		int[] tri1 = {0,1};
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
		triangle.add(tri12);
		
		

	}
	
	
	public int[] pawnPosition(int playerNO){
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
		int[] output = {-1,-1};
		return output;
		
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
				
	}
	
	public boolean insert(int[] tri, int rotTime){
		//change state by moving tiles for 1 block and put extra to the triangle position. 
		//extra = (renew extra) The tile squeezed out by insertion.
		
		Tile out;
		int triRow = tri[0];
		int triCol = tri[1];
		
		
		
		
		if(triangle.contains(tri)){
			if(triRow == 0){
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
			else if(triRow == 6){
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
			else if(triCol == 0){
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
			else if(triCol == 6){
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
			return true;
		}
		else{
			return false;
		}

	}
	
	
	//The idea behind "move" is we first check all possible (legal) positions for a player, make a set to store those positions' (x,y)
	//Then we see if the destination that player request is in the set. 
	//If yes, move the pawn to that position. If no, throw exception.
	
		//input x,y refers to the position that a player's pawn is standing.
		//this method returns an array containing x and y (x,y) which are the "legal" positions next to the pawn's current position.
		
		//check all the corresponding opens. If both open, then add that neighbor into output list.
		//This method only check the four neighbors of a tile. Later on, we'll use an iterator to check all possible moves.
	public HashMap<Integer[], Integer> checkNeighbor(int[] pos){

		HashMap<Integer[], Integer> output = new HashMap<Integer[], Integer>();
		Integer[] outputRC = new Integer[2];

		int inputR = pos[0];
		int inputC = pos[1];

		Tile currentTile = state[inputR][inputC];
		outputRC[0] = inputR;
		outputRC[1] = inputC;
		output.put(outputRC, 1);

		if(currentTile.curOpen()[0] == true){
			if(inputR != 0){
				Tile upTile = state[inputR-1][inputC];

				if(upTile.curOpen()[2] == true){
					outputRC[0] = inputR-1;
					outputRC[1] = inputC;
					output.put(outputRC, 1);
				}
			}

		}
		else if(currentTile.curOpen()[1] == true){

			if(inputC != 6){
				Tile rightTile = state[inputR][inputC+1];

				if(rightTile.curOpen()[3] == true){
					outputRC[0] = inputR;
					outputRC[1] = inputC+1;
					output.put(outputRC, 1);
				}
			}

		}

		else if(currentTile.curOpen()[2] == true){

			if(inputR != 6){
				Tile downTile = state[inputR+1][inputC];

				if(downTile.curOpen()[0] == true){
					outputRC[0] = inputR+1;
					outputRC[1] = inputC;
					output.put(outputRC, 1);
				}
			}

		}

		else if(currentTile.curOpen()[3] == true){

			if(inputC != 0){
				Tile leftTile = state[inputR][inputC-1];

				if(leftTile.curOpen()[3] == true){
					outputRC[0] = inputR;
					outputRC[1] = inputC-1;
					output.put(outputRC, 1);
				}
			}

		}
		return output;

	}
	
	
	
	//This method returns a set of all legal moves.
	//It uses the previous method and a loop.
	public HashMap<Integer[], Integer> legalMoves(int[] pos){

		Integer[] position = {pos[0],pos[1]};

		HashMap<Integer[], Integer> set = new HashMap<Integer[], Integer>();
		set.put(position, 1);

		HashMap<Integer[], Integer> output = checkNeighbor(pos);

		HashMap<Integer[], Integer> tempSet = new HashMap<Integer[], Integer>();

		int[] currentTile;

		while(set.size() < output.size()){
			tempSet = (HashMap<Integer[], Integer>) output.clone();
			for(int i=0; i<=output.size()-1; i++){
				currentTile = (int[]) output.keySet().toArray()[i];
				if(set.containsKey(currentTile) == false){
					output.putAll(checkNeighbor(currentTile));
				}
			}
			set = tempSet;
		}

		return output;

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
			HashMap<Integer[], Integer> set = legalMoves(pos);
			
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
	
}
