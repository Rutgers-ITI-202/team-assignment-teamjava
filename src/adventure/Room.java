package adventure;
public class Room {

public int [][] RoomArray;
public boolean hasPlayer;
public String Name;
public String Description;
public String Stage;
Pokemons Pika;


public Room (String name){
this.hasPlayer = true;
this.RoomArray = new int [5][5];
this.Name = "The beginning";
this.Description = "This is the beginning of your adventure! Look around, find Pokeballs, and capture Pokemons to pass roadblocks!";
this.Stage = name;
}

public void setStage(String name){
Stage = name;
}

/**public void Initialize (){

	if(Stage.equalsIgnoreCase("Kanto")){
		RoomArray = new int [5][5];
	}
	
	if(Stage.equalsIgnoreCase("Hoenn")){
		RoomArray = new int [6][6];
	}
	
}*/ 


public String getDescription() {
	return Description;
}

public String getName() {
	return Name;
}

public String displayRoom(Adventurer james, Pokemons Pika){
		
	StringBuffer layout = new StringBuffer ("");
		for(int row = 0; row < RoomArray.length; row++){
			for(int col = 0; col< RoomArray[0].length; col++){
				 layout.append("[");
				if(row == james.X && col == james.Y){
					layout.append(".] ");
					
				} else if(row == Pika.X && col == Pika.Y){
					layout.append("P] ");
				}
				
				else if((row!= james.X || col != james.Y)){
					layout.append(" ] ");
				} 
			}
			layout.append("\n");
			}
		
		return layout.toString();
		}

public static void main(String [] args){
	Room first = new Room("Hoenn");
	Adventurer james = new Adventurer();
	Pokemons Pika = new Pokemons();
	System.out.println(first.displayRoom(james, Pika));
}
}
