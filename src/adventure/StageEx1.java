package TextGame;

public class StageEx1 extends Room {
	private int [][] map = new int [2][7];
	
	sitrusBerry sb1 = new sitrusBerry (0,1);
	sitrusBerry sb2 = new sitrusBerry (0,2);
	sitrusBerry sb3 = new sitrusBerry (0,3);
	sitrusBerry sb4 = new sitrusBerry (1,3);
	sitrusBerry sb5 = new sitrusBerry (1,4);
	
	
	public StageEx1 (){
		super("Stage Extra 1 (Berry Forest A)");
		super.setRoomArray(map);
		
		this.setDescription("East side of the forest, there are many sitrus berries on the floor!");
		this.addItem(sb1);
		this.addItem(sb2);
		this.addItem(sb3);
		this.addItem(sb4);
		this.addItem(sb5);
		
		this.tpX1 = 1;
		this.tpY1 = 0;
		this.tpX2 = 1;
		this.tpY2 = 6;
		
	}
	
	public Room teleport(Adventurer Ditto){
		if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
			Ditto.setX(2);
			Ditto.setY(4);
			StageFive five = new StageFive();
			return five;
		}
		
		if(Ditto.getX() == tpX2 && Ditto.getY() == tpY2){
			System.out.println("New area reached: Items Heaven");
			Ditto.setX(0);
			Ditto.setY(0);
			StageEx2 ex2 = new StageEx2 ();
			return ex2;
		}
		
		return null;
	}
	

}
