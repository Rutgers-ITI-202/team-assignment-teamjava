package adventure;

public class StageThree extends Room {

private int [][] map = new int [5][5];
tree t1 = new tree(1,4);
tree t2 = new tree(2,3);
tree t3 = new tree(3,4);
rock r1 = new rock(4,1);
rock r2 = new rock(3,2);
rock r3 = new rock(4,3);
SandSlash sand = new SandSlash(2,2);


public StageThree(){
	super("Stage Three (Route 135)");
	super.setRoomArray(map);
	this.setDescription("Route 135, you can see glimpses of a huge mountain in the south, but its entrance is blocked by giant rocks...");
	this.addObstacle(t1);
	this.addObstacle(t2);
	this.addObstacle(t3);
	this.addObstacle(r1);
	this.addObstacle(r2);
	this.addObstacle(r3);
	this.addPokemon(sand);
	this.tpX1 = 2;
	this.tpY1 = 0;
	this.tpX2 = 4;
	this.tpY2 = 2;
}

public Room teleport(Adventurer Ditto){
	if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
		Ditto.setX(1);
		Ditto.setY(6);
		StageTwo two = new StageTwo();
		return two;
	}
	
	if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
		System.out.println("New area reached: Dark cave");
		System.out.println();
		Ditto.setX(0);
		Ditto.setY(0);
		StageFour four = new StageFour();
		return four;
	}
	
	
	return null;
}



}
