package adventure;

public class StageOne extends Room {
private int [][] map = new int [7][6];
sky ob1 = new sky(2,0);
sky ob2 = new sky(2,1);
sky ob3 = new sky(3,0);
sky ob4 = new sky(3,1);
sky ob5 = new sky(4,0);
sky ob6 = new sky(4,1);
sky ob7 = new sky(3,2);
sky ob8 = new sky(3,3);
sky ob9 = new sky(2,4);
sky ob10 = new sky(2,5);
sky ob11 = new sky(3,4);
sky ob12 = new sky(3,5);
sky ob13 = new sky(4,4);
sky ob14 = new sky(4,5);
sitrusBerry berry = new sitrusBerry(0,3);
pidgey P = new pidgey(1,4);

public StageOne(){
super ("Stage One (Cliffside)");
super.setRoomArray(map);
this.tpX1 = 6;
this.tpY1 = 5;
this.setDescription("Cliffside area, the bridge connecting to the other side is broken.");
this.addObstacle(ob1);
this.addObstacle(ob2);
this.addObstacle(ob3);
this.addObstacle(ob4);
this.addObstacle(ob5);
this.addObstacle(ob6);
this.addObstacle(ob7);
this.addObstacle(ob8);
this.addObstacle(ob9);
this.addObstacle(ob10);
this.addObstacle(ob11);
this.addObstacle(ob12);
this.addObstacle(ob13);
this.addObstacle(ob14);
this.addItem(berry);
this.addPokemon(P);
}

public Room teleport(Adventurer Ditto){
	if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
		System.out.println("New area reached: Riverside");
		System.out.println();
		
		Ditto.setX(0);
		Ditto.setY(0);
		StageTwo Two = new StageTwo();
		return Two;
	}
	
	return null;
}



public static void main(String [] args){
Adventurer james = new Adventurer();
pidgey npc = new pidgey(1,5);
StageOne One = new StageOne();
sitrusBerry berry = new sitrusBerry(1,3);
System.out.println(One.displayRoom(james));
james.MoveEast(One);
james.MoveEast(One);
james.MoveEast(One);
System.out.println(One.displayRoom(james));
james.Pick(One);
james.MoveEast(One);
System.out.println(One.displayRoom(james));
james.ViewInventory();
james.setHP(10);
james.showStatus();
james.Use("sitrus berry", james);
james.ViewInventory();
james.showStatus();


}

}
