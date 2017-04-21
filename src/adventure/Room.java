package adventure;
import java.util.*;

public class Room {

private int [][] RoomArray;
private boolean hasPlayer;
private String Name;
private String Description;
private ArrayList <obstacle> Ob;


public Room (String name){
this.hasPlayer = true;
this.RoomArray = new int [5][5];
this.Name = name;
this.Ob = new ArrayList<obstacle> ();
this.setDescription("This is the beginning of your adventure! Look around, find Pokeballs, and capture Pokemons to pass roadblocks!");
}

public void setRoomArray(int [][] x){
	RoomArray = x;
}

public int [][] getArray(){
	return RoomArray;
}

public void setDescription(String s){
	Description = s;
}

public String getDescription() {
	return Description;
}

public void setName(String s){
	Name = s;
}

public String getName() { // gets room name
	return Name;
}

public boolean playerPresent(){
	return hasPlayer;
}

public void addObstacle(obstacle ob){
	Ob.add(ob);
}

public ArrayList<obstacle> getObstacles(){
	return Ob;
}

public String displayRoom(Adventurer james, Pokemons Pika, Items item){
	boolean hasX = false;
	StringBuffer layout = new StringBuffer ("");
		for(int row = 0; row < RoomArray.length; row++){
			for(int col = 0; col< RoomArray[0].length; col++){
				 layout.append("[");
				if(row == james.getX() && col == james.getY()){
					layout.append(".] ");
					continue;
				 } 
				
				else if(row == Pika.getX() && col == Pika.getY()){
					layout.append("P] ");
					continue;
				}
				
				else if(row == item.getX() && col == item.getY()){
					layout.append("I] ");
					continue;
				}
				
				for(int i = 0; i < Ob.size(); i++){
					if(Ob.get(i).getX() == row && Ob.get(i).getY() == col){
						layout.append("X] ");
						hasX = true;
						continue;
					}
				}
			
				if(hasX == true){
					hasX = false;
					continue;
				}
			
				else if ((row!= james.getX() || col != james.getY())){
					layout.append(" ] ");
					
				} 
			}
			layout.append("\n");
			}
		
		if(james.getX() == Pika.getX() && james.getY() == Pika.getY()){
			System.out.println("There is a pokemon nearby, take a look around!" + "\n"); 
		 }
		
		if(james.getX() == item.getX() && james.getY() == item.getY()){
			System.out.println("There is an item nearby, take a look around!");
		}
	
		
		return layout.toString();
		}



public static void main(String [] args){
	Room first = new Room("Hoenn");
	Adventurer james = new Adventurer();
	Pokemons Pika = new Pokemons();
	sitrusBerry berry = new sitrusBerry();
	obstacle ob = new obstacle(3,3);
	first.addObstacle(ob);
	System.out.println(first.displayRoom(james, Pika, berry));
	james.MoveEast(first);
	james.MoveSouth(first);
	System.out.println(first.displayRoom(james, Pika, berry));
	james.MoveSouth(first);
	james.MoveSouth(first);
	james.MoveEast(first);
	james.MoveEast(first);
	System.out.println(first.displayRoom(james, Pika, berry));
	
	
}
}
