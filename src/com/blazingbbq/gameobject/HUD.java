package com.blazingbbq.gameobject;

import org.lwjgl.opengl.Display;

import com.blazingbbq.game.Score;
import com.blazingbbq.powerup.PowerUpNexus;

public class HUD {
	
	public HUD(){
		Score.init(6, Display.getHeight() - 30, 1, 1, 1, 3);
		PowerUpNexus.init(2);
	}
	
	public void update(){
		Score.update();
		PowerUpNexus.update();
	}
	
	public void render(){
		Score.render();
		PowerUpNexus.render();
	}
	
}
