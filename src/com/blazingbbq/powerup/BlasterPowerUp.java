package com.blazingbbq.powerup;

import com.blazingbbq.gameobject.*;

public abstract class BlasterPowerUp extends PowerUp{
	
	protected Blaster newBlaster;
	
	public static float r = 1f;
	public static float g = 0.4f;
	public static float b = 0.4f;
	
	public BlasterPowerUp(float x, float y){
		init(x, y, r, g, b, DEFAULT_SIZE, DEFAULT_SIZE);
	}
	
	public void powerUp(){
		PowerUpNexus.powerUpBlaster(newBlaster);
	}
	
}
