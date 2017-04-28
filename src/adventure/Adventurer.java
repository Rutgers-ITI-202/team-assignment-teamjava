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
import java.util.*;

public class Adventurer extends Pokemons {

protected boolean hasCandy; // Game ending condition

private String name; // Given name to the adventurer
private	int X; // X coordinate position of the adventurer
private int Y; // Y coordinate position of the adventurer
private ArrayList<Items> inventory; // Arraylist that stores the Adventurer's items
private ArrayList <Pokemons> TransformList; // ArrayList that sotres Pokemons objects
protected int PP;
protected int HP;
protected int maxHP;
protected String currentForm; // String representation of Ditto's current transformation

private int worldX; // Adventurer's X coordinate on the world map
private int worldY; // Adventurer's Y coordinate on the world map

public Adventurer (){
	this.hasCandy = false;
	
	this.X = 0;
	this.Y = 0;
	this.name = "Ditto";
	this.inventory = new ArrayList();
	this.TransformList = new ArrayList<Pokemons>(); // the adventurer can transform into a list of pokemons that he/she encounters 
	this.currentForm = "Ditto";
	
	this.worldX = 0;
	this.worldY = 0;
	this.HP = 50;
	this.maxHP = 50;
	this.PP = 5;
	
	this.CanCut = false;
	this.CanDive = false;
	this.CanFly = false;
	this.CanRockSmash = false;
	this.CanSurf = false;

}

public void showStatus(){
	System.out.println("Current status: ");
	System.out.println("Current transform: " + currentForm);
	System.out.println("HP: " + HP + "/" + maxHP);
	System.out.println("PP: " + PP);
	System.out.println();
	
}

public void setmaxHP(int x){
	maxHP = x;
}

public int getmaxHP(){
	return maxHP;
}

public void setHP(int x){
HP = x;	
}

public int getHP(){
	return HP;
}

public int getPP(){
	return PP;
}

public void setPP(int i){
	PP = i;
}

public void setName(String NickName){
	name = NickName;
}

public String getName(){
	return name;
}

public void setX(int x){
	X = x;
}

public int getX(){
	return X;
}

public void setY(int y){
	Y = y;
}

public int getY(){
	return Y;
}

public void setWorldX(int x){
	worldX = x;
}

public int getWorldX(){
	return worldX;
}

public void setWorldY(int y){
	worldY = y;
}

public int getWorldY(){
	return worldY;
}

public void addTransfrom(Pokemons pokemon){ // adds pokemons to the Adventurer's list of tranformable pokemons
	TransformList.add(pokemon);
}

public void viewTransform(){
	if(TransformList.isEmpty() == false){
	for(int i = 0; i < TransformList.size(); i++){
		System.out.print(TransformList.get(i).getName() + " ");
	}
	System.out.println();
}
	else{
		System.out.println("There are no available transformations right now!");
		System.out.println();
	}
}

public ArrayList<Pokemons> getTransform(){
	return TransformList;
}

public void transform(String Poke){
	
	if(PP == 0){
		System.out.println("No more PP left for transform!");
		return;
	}
	
	boolean transformed = false;
	for(int i = 0; i < TransformList.size(); i++){
	if(TransformList.get(i).getName().replaceAll(" ", "").equalsIgnoreCase(Poke.replaceAll(" ", ""))){
		
		transformed = true;
		currentForm = TransformList.get(i).getName();
		
		
		CanCut = TransformList.get(i).CanCut;
		CanRockSmash = TransformList.get(i).CanRockSmash;
		CanSurf = TransformList.get(i).CanSurf;
		CanFly = TransformList.get(i).CanFly;
		 // copying the obstacle bypassing abilities
		
		System.out.println(name + " has succesfully transformed into " + TransformList.get(i).getName() + "!");
		System.out.println();
		PP = PP -1;
	}
	}
	
	if(transformed = false){
		System.out.println("No matching transformation found, transform failed!");
	}
}

public void Pick (Room room){ // Adds item object to inventory ArrayList.
	boolean itemFound = false;
	for(int i = 0; i < room.getItems().size(); i++){
	if(room.getItems().get(i).getX() == X && room.getItems().get(i).getY() == Y){
		inventory.add(room.getItems().get(i));
		room.getItems().get(i).setX(100);
		room.getItems().get(i).setY(100);
		itemFound = true;
		System.out.println(name + " picked up " + room.getItems().get(i).getName() + "!");
		System.out.println();
		}
	}

	if(itemFound == false){
	System.out.println("There is nothing to pick up here!");
	System.out.println();
	}
}

public void ViewInventory(){ // Views inventory and prints toString representation of inventory ArrayList.
	System.out.println(name + "'s inventory: ");
	
	if(inventory.isEmpty() == true){
		System.out.println("Empty");
		System.out.println();
	}
	else{
	for(int i = 0; i < inventory.size(); i++){
		System.out.print(inventory.get(i).getName() + ". ");
	}
	System.out.println();
	System.out.println();
	}
}

protected void addToInventory(Items x){ // Developer's method for adding to inventory
inventory.add(x);	
}

public ArrayList<Items> getInventory(){
	return inventory;
}

public void UseFlute(Adventurer Ditto, Room Current){

	boolean fluteFound = false;
	for(int i = 0; i < inventory.size(); i++){
	if(inventory.get(i) instanceof pokeflute){
	((pokeflute)(inventory.get(i))).function(Ditto, Current);	
	//System.out.println(name + " used " +  ((pokeflute) inventory.get(i)).getName() + ", " + ((pokeflute) inventory.get(i)).functionToString());
	fluteFound = true;
	}
}
	if(fluteFound == false){
		System.out.println("You do not have a poke flute!");
		System.out.println();
	}
}

public void Use(String item, Adventurer Ditto){
for(int i = 0; i < inventory.size(); i++){
if(inventory.get(i).getName().replaceAll(" ", "").equalsIgnoreCase(item.trim().replaceAll(" ", ""))){

if((inventory.get(i)) instanceof sitrusBerry){
((sitrusBerry) inventory.get(i)).function(Ditto);
System.out.println(name + " used " +  ((sitrusBerry) inventory.get(i)).getName() + " and " + ((sitrusBerry) inventory.get(i)).functionToString());
System.out.println();
inventory.remove(i);
return;
}

if((inventory.get(i)) instanceof ppRestore){
((ppRestore) inventory.get(i)).function(Ditto);
System.out.println(name + " used " +  ((ppRestore) inventory.get(i)).getName() + " and " + ((ppRestore) inventory.get(i)).functionToString());
System.out.println();
inventory.remove(i);
return;
}


}

// add other instances of items here


}

System.out.println("Item does not exist...");
System.out.println();
}

public void checkPass(obstacle ob) { // determines if the adventurer has the ability to pass an obstacle

if(ob instanceof sky){
if(canFly() == true){
ob.setPassable();	
		}
	}

if(ob instanceof water){
	if(canSurf() == true){
		ob.setPassable();
	}
}

if(ob instanceof tree){
	if(canCut() == true){
		ob.setPassable();
	}
}

if(ob instanceof rock){
	if(canRockSmash() == true){
		ob.setPassable();
	}
}


}


public void MoveNorth(Room room){ //Updates Adventurer's X coordinate (-1), parameter of type Room for array boundaries
	
	X = X-1;
	if (X < 0) {
		X = 0;
		System.out.println("The adventurer cannot move north anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				X = X +1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
			if(room.getObstacles().get(i).seePass() == true){
				System.out.println(name + "(" + currentForm + ") used " + room.getObstacles().get(i).passAbility + " and bypassed the obstacle!");
				System.out.println();
			}
		}
	} // Obstacle check
	
	for(int i = 0; i < room.getItems().size(); i++){
		if(X == room.getItems().get(i).getX() && Y == room.getItems().get(i).getY()){
			System.out.println("There is an item nearby, look around!");
			System.out.println();
		}
	} // Item check
	
	for(int i = 0; i < room.getPokemons().size(); i++){
		if(X == room.getPokemons().get(i).getX() && Y == room.getPokemons().get(i).getY()){
			System.out.println("There is a Pokemon nearby, look around!");
			System.out.println();
		}
	} // Pokemon check
	
}

public void MoveSouth(Room room){ //Updates Adventurer's X coordinate (+1)
	X = X+1;
	if (X >= room.getArray().length) {
		X = X-1;
		System.out.println("The adventurer cannot move south anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				X = X - 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
			
			if(room.getObstacles().get(i).seePass() == true){
				System.out.println(name + "(" + currentForm + ") used " + room.getObstacles().get(i).passAbility + " and bypassed the obstacle!");
				System.out.println();
			}
		
		}
	}
	
	for(int i = 0; i < room.getItems().size(); i++){
		if(X == room.getItems().get(i).getX() && Y == room.getItems().get(i).getY()){
			System.out.println("There is an item nearby, look around!");
			System.out.println();
		}
	} // Item check
	
	for(int i = 0; i < room.getPokemons().size(); i++){
		if(X == room.getPokemons().get(i).getX() && Y == room.getPokemons().get(i).getY()){
			System.out.println("There is a Pokemon nearby, look around!");
			System.out.println();
		}
	} // Pokemon check
	
}

public void MoveWest(Room room) { //Updates Adventurer's Y coordinate (-1)
	Y = Y-1;
	if (Y < 0){
		Y = 0;
		System.out.println("The adventurer cannot move west anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				Y = Y + 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
			
			if(room.getObstacles().get(i).seePass() == true){
				System.out.println(name + "(" + currentForm + ") used " + room.getObstacles().get(i).passAbility + " and bypassed the obstacle!");
				System.out.println();
			}
			
			
		}
	}
	
	for(int i = 0; i < room.getItems().size(); i++){
		if(X == room.getItems().get(i).getX() && Y == room.getItems().get(i).getY()){
			System.out.println("There is an item nearby, look around!");
			System.out.println();
		}
	} // Item check
	
	for(int i = 0; i < room.getPokemons().size(); i++){
		if(X == room.getPokemons().get(i).getX() && Y == room.getPokemons().get(i).getY()){
			System.out.println("There is a Pokemon nearby, look around!");
			System.out.println();
		}
	} // Pokemon check	
}

public void MoveEast(Room room) { //Updates Adventurer's Y coordinate (+1)
	Y = Y+1;
	if (Y > room.getArray()[0].length - 1){
		Y = Y-1;
		System.out.println("The adventurer cannot move east anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				Y = Y - 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
			
			if(room.getObstacles().get(i).seePass() == true){
				System.out.println(name + "(" + currentForm + ") used " + room.getObstacles().get(i).passAbility + " and bypassed the obstacle!");
				System.out.println();
			}
		}
	}
	
	for(int i = 0; i < room.getItems().size(); i++){
		if(X == room.getItems().get(i).getX() && Y == room.getItems().get(i).getY()){
			System.out.println("There is an item nearby, look around!");
			System.out.println();
		}
	} // Item check
	
	for(int i = 0; i < room.getPokemons().size(); i++){
		if(X == room.getPokemons().get(i).getX() && Y == room.getPokemons().get(i).getY()){
			System.out.println("There is a Pokemon nearby, look around!");
			System.out.println();
		}
	} // Pokemon check
	
} // End of Move

	public void Talk(Pokemons x){ // Talking to pokemons displays their assigned dialogues
	
	if(x instanceof pidgey){	
		((pidgey)x).showDialogue(this);	
	}
	
	if(x instanceof Lapras)
	{
		((Lapras)x).showDialogue(this);
	}
	
	if(x instanceof SandSlash){
		((SandSlash)x).showDialogue(this);
	}
	
	if(x instanceof zubat){
		((zubat)x).showDialogue(this);
	}
	
	if(x instanceof squirtle){
		((squirtle)x).showDialogue(this);
	}
	
	if(x instanceof snorlax){
		((snorlax)x).showDialogue(this);
	}
	
	}
	
	
	
public static void main(String [] args){

}

}
