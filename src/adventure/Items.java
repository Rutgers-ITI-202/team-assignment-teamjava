package TextGame;
import java.util.*;

public class Items {
private String name;
private String description;
private int X;
private int Y;
	
public Items(){
this.name = "Item";
this.description = "just an item";
this.X = 1;
this.Y = 1;
}

public void setX(int x){
X = x;	
}

public int getX(){
	return X;
}

public void setY(int y){
	Y = y;
}

public int getY(){
	return Y;
}

public void setName(String a){
	name = a;
}

public String getName(){
	return name;
}

public void setDescription(String a){
	description = a;
}

public String getDescription(){
	return description;
}



}

