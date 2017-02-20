package adventure;

public class Room {

public int [][] RoomArray;
public boolean hasPlayer;
public String Name;
public String Description;

public Room (){
this.hasPlayer = true;
this.RoomArray = new int [5][5];
this.Name = "The beginning";
this.Description = "This is the beginning of your adventure! Look around, find Pokeballs, and capture Pokemons to pass roadblocks!";
}

public String getDescription() {
	return Description;
}

public String getName() {
	return Name;
}

public String displayRoom(Adventurer james){
		
	StringBuffer layout = new StringBuffer ("");
		for(int row = 0; row < RoomArray.length; row++){
			for(int col = 0; col< RoomArray[0].length; col++){
				 layout.append("[");
				if(row == james.X && col == james.Y){
					layout.append(".] ");
					
				} 
				
				if(row!= james.X || col != james.Y){
					layout.append(" ] ");
				}
				
				
			}
			layout.append("\n");
			}
		
		
		return layout.toString();
		}
}
