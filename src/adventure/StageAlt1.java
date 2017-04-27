package TextGame;

public class StageAlt1 extends Room{
	private int[][] map = new int [3][3];
	squirtle sq = new squirtle (1,1);
	
	public StageAlt1(){
		super("Stage Alternate 1 (Dark Cave 2)");
		super.setRoomArray(map);
		this.setDescription("Deeper into the dark cave, there seems to be a pokemon residing here.");
		this.addPokemon(sq);
		this.tpX1 = 2;
		this.tpY1 = 0;
		this.tpX2 = 2;
		this.tpY2 = 2;
	}
	
	
	public Room teleport(Adventurer Ditto){
		if(Ditto.getX() == tpX1 && Ditto.getY() == tpY1){
			Ditto.setX(5);
			Ditto.setY(2);
			StageFour four = new StageFour();
			return four;
		}
		
		return null;
	}
	
	public static void main(String[] args){
		
	}
	
}
