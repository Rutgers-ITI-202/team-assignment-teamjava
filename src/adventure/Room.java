package adventure;
import java.util.*;

public class Room {

private int [][] RoomArray;
private boolean hasPlayer;
private String Name;
private String Description;
private ArrayList <obstacle> Ob; // arraylist that stores all obstacles
private ArrayList <Items> items; // arraylist that stores all items
private ArrayList <Pokemons> pokemons;  // arraylist that stores all pokemons

protected int tpX1; // X coordinate of TP point 1
protected int tpY1; // Y coordinate of TP point 1
protected int tpX2;
protected int tpY2;
protected int tpX3;
protected int tpY3;
protected int tpX4;
protected int tpY4;


public Room (String name){
this.hasPlayer = true;
this.RoomArray = new int [5][5];
this.Name = name;
this.Ob = new ArrayList<obstacle> ();
this.items = new ArrayList<Items> ();
this.pokemons = new ArrayList<Pokemons>();
this.setDescription("This is the beginning of your adventure! Look around, find Pokeballs, and capture Pokemons to pass roadblocks!");
this.tpX1 = 100;
this.tpX2 = 100;
this.tpX3 = 100;
this.tpX4 = 100;
this.tpY1 = 100;
this.tpY2 = 100;
this.tpY3 = 100;
this.tpY4 = 100;
}

public boolean tpCheck(Adventurer Ditto){
	if((Ditto.getX() == tpX1 && Ditto.getY() == tpY1) || (Ditto.getX() == tpX2 && Ditto.getY() == tpY2) || (Ditto.getX() == tpX3 && Ditto.getY() == tpY3) || (Ditto.getX() == tpX4 && Ditto.getY() == tpY4)){
		return true;
	}
	else{
		return false;
	}
}

public Room teleport(Adventurer Ditto){
if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
	StageOne One = new StageOne();
	Ditto.setX(0);
	Ditto.setY(0);
	return 	One;
}

if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
	StageTwo Two = new StageTwo();
	Ditto.setX(0);
	Ditto.setY(0);
	return Two;
}

if(Ditto.getX() == tpX3 && Ditto.getY() == tpY3){
	StageOne One = new StageOne();
	Ditto.setX(0);
	Ditto.setY(0);
	return One;
}

if(Ditto.getX() == tpX4 && Ditto.getY() == tpY4){
	StageOne One = new StageOne();
	Ditto.setX(0);
	Ditto.setY(0);
	return One;
}
else {
return null;
}

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

public void addItem(Items IT){
	items.add(IT);
}

public ArrayList<Items> getItems(){
	return items;
}

public void addPokemon(Pokemons poke){
	pokemons.add(poke);
}

public ArrayList<Pokemons> getPokemons(){
	return pokemons;
}

public String displayRoom(Adventurer james){
	boolean hasX = false;
	boolean hasP = false;
	boolean hasI = false;
	boolean hasT = false;
	
	StringBuffer layout = new StringBuffer ("");
		for(int row = 0; row < RoomArray.length; row++){
			for(int col = 0; col< RoomArray[0].length; col++){
				 layout.append("[");
				if(row == james.getX() && col == james.getY()){
					layout.append(".] ");
					continue;
				 } 
				
				for(int i = 0; i < pokemons.size(); i++){
					if(pokemons.get(i).getX() == row && pokemons.get(i).getY() == col){
						layout.append("P] ");
						hasP = true;
						continue;
					}
				}
				
				if(hasP == true){
					hasP = false;
					continue;
				}
				
				for(int i = 0; i < items.size(); i++){
					if(items.get(i).getX() == row && items.get(i).getY() == col){
						layout.append("I] ");
						hasI = true;
						continue;
					}
				}
				
				if(hasI == true){
					hasI = false;
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
				
				if(row == tpX1 && col == tpY1){
					layout.append("T] ");
					continue;
				}
				
				if(row == tpX2 && col == tpY2){
					layout.append("T] ");
					continue;
				}
				
				if(row == tpX3 && col == tpY3){
					layout.append("T] ");
					continue;
				}
				
				if(row == tpX4 && col == tpY4){
					layout.append("T] ");
					continue;
				}
			
				else if ((row!= james.getX() || col != james.getY())){
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
	sitrusBerry berry = new sitrusBerry(1,2);
	obstacle ob = new obstacle(3,3);
	first.addObstacle(ob);
	System.out.println(first.displayRoom(james));
	james.MoveEast(first);
	james.MoveSouth(first);
	System.out.println(first.displayRoom(james));
	james.MoveSouth(first);
	james.MoveSouth(first);
	james.MoveEast(first);
	james.MoveEast(first);
	System.out.println(first.displayRoom(james));
	first.addPokemon(Pika);
	Pika.setX(2);
	Pika.setY(2);
	first.addItem(berry);
	System.out.println(first.displayRoom(james));
	
}
}
