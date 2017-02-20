public class Room {

public int [][] RoomArray;
public boolean hasPlayer;

public Room (){
this.hasPlayer = false;
this.RoomArray = new int [5][5];
}

public String displayRoom(){
		
	StringBuffer layout = new StringBuffer ("");
		for(int row = 0; row < RoomArray.length; row++){
			for(int col = 0; col< RoomArray[0].length; col++){
				 layout.append("[");
				if(hasPlayer == true){
					layout.append(".] ");
					
				} else {
					layout.append("] ");
					
				}
			}
			layout.append("\n");
			}
		return layout.toString();
		}

public static void main(String [] args){
	Room first = new Room();
	System.out.println(first.displayRoom());
	
}
	
}
