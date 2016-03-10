package code;

// tile class
public class Tile{
	private int type;
	boolean[] open = {false,false,false,false}; //boolean[] open = new boolean[4]  
	 											//open[0] = false  open[1] = false...
	
	Tile(int k) {
		if(k>=1 && k<=5){
			type = k;
		}
		else{
			type = 1;
			//Default type = 1
		}
		
		initial();
	}
	
	//type 1~5 , correspond to the 5 kinds of tiles
	//type one refers to the tile with an open on the top.
	
//		||||  ||||
//		||      ||
//		||      ||
//		||      ||
//		||||||||||

	//type two refers to the tile with an open on the top and an open on the side.
	
//		||||  ||||
//		||      ||
//		||      
//		||      ||
//		||||||||||
	
	//type three refers to the tile with an open on the top and an open on the other side.
	
//		||||  ||||
//		||      ||
//	    ||      ||
//		||      ||
//		||||  ||||
	
	//type four refers to the tile with an open on the top and two opens on the side.
	
//		||||  ||||
//		||      ||
//	      
//		||      ||
//		||||||||||
	
	//type five refers to the tile with opens on all sides.
	//Not sure if there is type five in this game...
	
//		||||  ||||
//		||      ||
//	      
//		||      ||
//		||||  ||||	
	
	public int type(){
		return type;
	}
	
	public boolean[] initial(){
		 //initialize the Tile
		 //return the initial opens of a tile 

		switch (type){
			case 1: 
				boolean[] initialOpen1 = {true,false,false,false};
				open = initialOpen1;
				break;
			case 2: 
				boolean[] initialOpen2 = {true,true,false,false};
				open = initialOpen2;
				break;
			case 3: 
				boolean[] initialOpen3 = {true,false,true,false};
				open = initialOpen3;
				break;
			case 4: 
				boolean[] initialOpen4 = {true,true,false,true};
				open = initialOpen4;
				break;
			case 5: 
				boolean[] initialOpen5 = {true,true,true,true};
				open = initialOpen5;
				
				}
		
		return curOpen();
	}
	
	public boolean[] curOpen(){
		//return current opens of a tile
		return open.clone();
	
	}
	public void rotate(){
		//rotate the tile clockwise and change the curOpen
		boolean[] newOpen = new boolean[4];
		newOpen[0] = open[3];
		newOpen[1] = open[0];
		newOpen[2] = open[1];
		newOpen[3] = open[2];
		
		open = newOpen;

	}

	
	
	
}

