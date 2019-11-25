package com.blazingbbq.gameobject;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.stringprinting.PrintableString;

public class RespawnPrompt extends GameObject{
	
	private PrintableString printable;
	
	//Constructor
	public RespawnPrompt(float x, float y){
		printable = new PrintableString(x, y, .5f, .5f, .5f, 1, "Press R or ENTER to respawn");//29
	}
	
	public void render(){
		printable.render();
	}
	
	public void onRemoval() {}
	
}
