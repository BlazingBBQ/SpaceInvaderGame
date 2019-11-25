package com.blazingbbq.gameobject;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.stringprinting.PrintableString;

public class GameOver extends GameObject{
	
	private PrintableString printable;
	
	//Constructor
	public GameOver(float x, float y){
		printable = new PrintableString(x, y, 1, 0, 0, 8, "Game Over");
	}
	
	public void render(){
		printable.render();
	}
	
	public void onRemoval() {}
	
}
