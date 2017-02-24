/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
*/

package adventure;

public class Adventurer {
public String name; // Given name to the adventurer
public 	int X; // X coordinate position of the adventurer
public int Y; // Y coordinate position of the adventurer
public ArrayList inventory; // Arraylist that stores the Adventurer's items
public Pokemons [] pokemons; // Array that sotres Pokemons objects
public int TeamSize; // How many pokemons adventurer has on team

public Adventurer (){
	
	this.X = 0;
	this.Y = 0;
	this.name = "James";
	this.inventory = new ArrayList();
	this.pokemons = new Pokemons[6]; // the adventurer can have a max team of 6 pokemons
	this.TeamSize = 0;
}

public void Pick (Object item){ // Adds item object to inventory ArrayList.
inventory.add(item);
}

public void ViewInventory(){ // Views inventory and prints toString representation of inventory ArrayList.
	System.out.println(name + "'s inventory: " + inventory.toString());
}

public void CatchPokemon(Pokemons x){
	
	if (TeamSize < 7){
	int counter = (int) (Math.random() * 100);
	if(counter <= x.CatchRate){
	System.out.println("Congratulations, the pokemon has been caught!");
	pokemons[TeamSize] = x;
	TeamSize++;
	} else { System.out.println("The pokemon escaped from the pokeball!");
		
	}
	} else { System.out.println("You already have 6 pokemons! No more could be caught at this moment.");
	}
	
	
}

public void MoveNorth(){ //Updates Adventurer's X coordinate (-1)
	
	X = X-1;
	if (X < 0) {
		X = 0;
		System.out.println("The adventurer cannot move north anymore.");
		System.out.println();
	}
	
}

public void MoveSouth(){ //Updates Adventurer's X coordinate (+1)
	X = X+1;
	if (X > 4) {
		X = 4;
		System.out.println("The adventurer cannot move south anymore.");
		System.out.println();
	}
	
}

public void MoveWest() { //Updates Adventurer's Y coordinate (-1)
	Y = Y-1;
	if (Y < 0){
		Y = 0;
		System.out.println("The adventurer cannot move west anymore.");
		System.out.println();
	}
	
}

public void MoveEast() { //Updates Adventurer's Y coordinate (+1)
	Y = Y+1;
	if (Y > 4){
		Y = 4;
		System.out.println("The adventurer cannot move east anymore.");
		System.out.println();
	}
	
}

public static void main(String [] args){
	String item = "pokeball";
	Object water = "potion";
	Adventurer james = new Adventurer ();
	james.Pick(item);
	james.ViewInventory();
	james.Pick(water);
	james.ViewInventory();
	Pokemons pokemon = new Pokemons();
	james.CatchPokemon(pokemon);
	
}

}
