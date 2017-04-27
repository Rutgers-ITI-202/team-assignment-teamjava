package TextGame;

public class StageFour extends Room {
private int [][] map = new int [10][4];
rock r1 = new rock(2,0);
rock r2 = new rock(3,1);
rock r3 = new rock(4,0);
zubat bat = new zubat(6,3);
water w1 = new water(7,0);
water w2 = new water(7,1);
water w3 = new water(7,2);
water w4 = new water(7,3);
water w5 = new water(8,0);
water w6 = new water(8,1);
water w7 = new water(8,2);
water w8 = new water(8,3);
ppRestore pp = new ppRestore(3,0);



public StageFour(){
	super("Stage Four (Dark Cave)");
	super.setRoomArray(map);
	this.setDescription("Dark cave area, there seems to be an exit on the South side but it is on the other side of a river. Walking towards the east seems to lead further into the cave.");
	this.addObstacle(r1);
	this.addObstacle(r2);
	this.addObstacle(r3);
	this.addObstacle(w1);
	this.addObstacle(w2);
	this.addObstacle(w3);
	this.addObstacle(w4);
	this.addObstacle(w5);
	this.addObstacle(w6);
	this.addObstacle(w7);
	this.addObstacle(w8);
	this.addPokemon(bat);
	this.addItem(pp);
	this.tpX1 = 0; // (0,3) -> back to Stage Three
	this.tpY1 = 3;
	this.tpX2 = 5; // (5,3) -> to Stage Alt1
	this.tpY2 = 3;
	this.tpX3 = 9; // (9,3) 0> to Stage Five
	this.tpY3 = 3;

}

public Room teleport(Adventurer Ditto){

	
if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
	Ditto.setX(0);
	Ditto.setY(0);
	StageThree three = new StageThree();
	return three;
}

if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
	System.out.println("New area reached: Dark Cave(inner)");
	Ditto.setX(0);
	Ditto.setY(0);
	StageAlt1 alt1 = new StageAlt1();
	return alt1;
}

return null;
}

public static void main(String [] args){
	
}

}
