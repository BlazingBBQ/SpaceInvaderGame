package com.blazingbbq.powerup;

public class ShotSpeedPowerUp extends PowerUp{
	
	public static float r = 1f;
	public static float g = 0.4f;
	public static float b = 1f;
	
	public ShotSpeedPowerUp(float x, float y){
		init(x, y, r, g, b, DEFAULT_SIZE, DEFAULT_SIZE);
	}
	
	public void powerUp(){
		PowerUpNexus.powerUpShotSpeed();
	}
	
}
