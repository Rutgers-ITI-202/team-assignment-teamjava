package TextGame;

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

sitrusBerry berry = new sitrusBerry();

public StageOne(){
super ("Stage One (Cliffside)");
super.setRoomArray(map);
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
this.berry.setX(0);
this.berry.setY(3);
}
	
public static void main(String [] args){
Adventurer james = new Adventurer();
pidgey npc = new pidgey(1,5);
StageOne One = new StageOne();
sitrusBerry berry = new sitrusBerry();
System.out.println(One.displayRoom(james, npc, berry));
james.MoveEast(One);
james.MoveEast(One);
james.MoveSouth(One);
james.MoveSouth(One);
james.MoveSouth(One);
System.out.println(One.displayRoom(james, npc, berry));
}

}
