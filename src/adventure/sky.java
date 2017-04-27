package adventure;

public class sky extends obstacle {

	public sky(int x, int y) {
		super(x, y);
		this.setDescription("Aerial terrain ahead, if only I can use 'fly' to get across..." + "\n");
		this.passAbility = "Fly";
	}


}
