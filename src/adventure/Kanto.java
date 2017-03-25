package adventure;
import java.util.*;

public class Kanto extends Room {
	public int [][] map = new int [5][5];
	public ArrayList<Pokemons> pokemons;
	
	public Kanto (){
	super ("Kanto");
	super.RoomArray = map;
	Lapras lapras = new Lapras();
	pokemons.add(lapras);
	}
	

	public static void main(String [] args){
		Kanto kanto = new Kanto ();
		Lapras lapras = new Lapras();
		Adventurer james = new Adventurer ();
		System.out.println(kanto.getDescription());
		System.out.println();
		System.out.println(kanto.displayRoom(james, lapras));
	}
	
}
