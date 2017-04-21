package TextGame;

public class obstacle {
private int X;
private int Y;
private boolean passable;
private String description;

public obstacle(int x, int y){
this.passable = false;
this.X = x;
this.Y = y;
this.description = "Obstacle ahead, think of a way to get around it...";
}

public boolean seePass(){
	return passable;
}

public void setPassable(){
	passable = true;
}

public void setX(int x){
	X = x;
}

public void setY(int y){
	Y = y;
}

public int getX(){
	return X;
}

public int getY(){
	return Y;
}

public void setDescription(String des){
	description = des;
}

public String getDescription(){
	return description;
}

}
