package TextGame;

public class StageAlt2 extends Room {
	private int [][] map = new int [3][5];
	sitrusBerry sb = new sitrusBerry(0,1);
	sitrusBerry sb2 = new sitrusBerry(0,4);
	sitrusBerry sb3 = new sitrusBerry(2,2);
	sitrusBerry sb4 = new sitrusBerry(2,3);
	sitrusBerry sb5 = new sitrusBerry(2,1);
	
	public StageAlt2 (){
		super("Alternate Stage 2 (Dark Cave Inner -A)");
		super.setRoomArray(map);
		this.setDescription("The middle of the dark cave, it's very dark but there seems to be berries scattered around.");
		this.addItem(sb);
		this.addItem(sb2);
		this.addItem(sb3);
		this.addItem(sb4);
		this.addItem(sb5);
		this.tpX1 = 2;
		this.tpY1 = 0;
	}
	
	public Room teleport(Adventurer Ditto){
		if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
			Ditto.setX(1);
			Ditto.setY(2);
			StageAlt1 alt = new StageAlt1();
			return alt;
		}
		return null;
	}

}
