package adventure;

public class WorldMap {

private Room [][] Map;


public WorldMap(Adventurer james){
this.Map = new Room [4][4]; 
}

public Room[][] getArray(){
	return Map;
}

public String display(Adventurer james){
	
	StringBuffer layout = new StringBuffer ("");
	for(int i = 0; i < Map.length; i++){
		for(int j = 0; j< Map[0].length; j++){
			
			layout.append("{");
			if(james.worldX == i && james.worldY == j){
				layout.append("o} ");
			} else { 
				layout.append(" } ");
				}
			
		} 
		layout.append("\n");
	}
	return layout.toString();
}
	
public static void main (String [] args){
	Adventurer james = new Adventurer();
	WorldMap Map = new WorldMap(james);
	System.out.println(Map.display(james));
	Room kanto = new Room ("Kanto");
	Map.getArray()[0][0] = kanto;
	Room hoenn = new Room ("Hoenn");
	Map.getArray()[0][1] = hoenn;    //Hardcoding and assigning rooms to the Worldmap (Room2DArray)
	
}

}
