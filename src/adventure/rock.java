package TextGame;

public class rock extends obstacle {
	public rock(int x, int y){
		super(x, y);
		this.setDescription("Giant rock ahead, if only I can use 'Rock Smash' to get across");
		this.passAbility = "Rock Smash";
	}
	

}