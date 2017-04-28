package TextGame;

public class StageFive extends Room {
private int [][] map = new int [5][6];
snorlax SN = new snorlax(4,3);

public StageFive(){
	super("Stage Five (Forest)");
	super.setRoomArray(map);
	this.setDescription("Outside of the dark cave, you are surrounded by trees and wildlife. In the far South, there is a snorlax sleeping...zzz");
	this.addPokemon(SN);
	this.tpX1 = 0;
	this.tpY1 = 1;
	this.tpX2 = 2;
	this.tpY2 = 5;
}

public Room teleport(Adventurer Ditto){
	if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
		Ditto.setX(9);
		Ditto.setY(2);
		StageFour four = new StageFour();
		return four;
	}
	
	if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
		System.out.println("New area reached: Berry Forest A");
		System.out.println();
		Ditto.setX(0);
		Ditto.setY(0);
		StageEx1 ex1 = new StageEx1();
		return ex1;
	}
	
	return null;
}
}
