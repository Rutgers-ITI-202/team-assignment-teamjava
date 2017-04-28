package adventure;

public class StageEx2 extends Room {
	private int [][] map = new int [5][7];
	ppRestore pp1 = new ppRestore(2,0);
	ppRestore pp2 = new ppRestore(2,1);
	ppRestore pp3 = new ppRestore(3,0);
	ppRestore pp4 = new ppRestore(3,1);
	ppRestore pp5 = new ppRestore(4,0);
	ppRestore pp6 = new ppRestore(4,1);
	sitrusBerry sb1 = new sitrusBerry (2,3);
	sitrusBerry sb2 = new sitrusBerry (2,4);
	sitrusBerry sb3 = new sitrusBerry (3,3);
	sitrusBerry sb4 = new sitrusBerry (3,4);
	sitrusBerry sb5 = new sitrusBerry (4,3);
	sitrusBerry sb6 = new sitrusBerry (4,4);
	
	public StageEx2(){
		super("Stage Extra 2 (Items heaven)");
		super.setRoomArray(map);
		this.setDescription("Secret area in the east side of the forest, filled with resources.");
		this.addItem(pp1);
		this.addItem(pp2);
		this.addItem(pp3);
		this.addItem(pp4);
		this.addItem(pp5);
		this.addItem(pp6);
		this.addItem(sb1);
		this.addItem(sb2);
		this.addItem(sb3);
		this.addItem(sb4);
		this.addItem(sb5);
		this.addItem(sb6);
		
		this.tpX1 = 0;
		this.tpY1 = 1;
	}
	
	public Room teleport(Adventurer Ditto){
	
		if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
			Ditto.setX(0);
			Ditto.setY(6);
			StageEx1 ex = new StageEx1();
			return ex;
		}
		
		return null;
	}
	
	

}
