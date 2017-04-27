package TextGame;

public class StageTwo extends Room {
private int [][] map = new int [3][8];
water w1 = new water(0,4);
water w2 = new water(0,5);
water w3 = new water(1,4);
water w4 = new water(1,5);
water w5 = new water(2,4);
water w6 = new water(2,5);
sitrusBerry berry = new sitrusBerry(2,0);
Lapras lapras = new Lapras(2,3);

public StageTwo(){
super("Stage Two (Riverside)");
super.setRoomArray(map);
this.setDescription("Riverside area, there is a shallow river on the east side. There seems to be a Pokemon nearby the river as well.");
this.addItem(berry);
this.addPokemon(lapras);
this.addObstacle(w1);
this.addObstacle(w2);
this.addObstacle(w3);
this.addObstacle(w4);
this.addObstacle(w5);
this.addObstacle(w6);
this.tpX1 = 0;
this.tpY1 = 2; // first tp point (0,2), -> leading to stage 1
this.tpX2 = 1;
this.tpY2 = 7; // 2nd tp point (1,7), -> leading to stage 3
}

public Room teleport(Adventurer Ditto){
	if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
		Ditto.setX(6);
		Ditto.setY(4);
		StageOne One = new StageOne();
		return One;
	}
	
	if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
		System.out.println("New area reached: Route 135");
		System.out.println();
		Ditto.setX(0);
		Ditto.setY(0);
		StageThree three = new StageThree();
		return three;
	}
	
	return null;
}

}
