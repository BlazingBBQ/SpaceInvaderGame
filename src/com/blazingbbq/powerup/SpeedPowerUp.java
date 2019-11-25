package com.blazingbbq.powerup;

public class SpeedPowerUp extends PowerUp{
	
	public static float r = 0.4f;
	public static float g = 1f;
	public static float b = 0.4f;
	
	public SpeedPowerUp(float x, float y){
		init(x, y, r, g, b, DEFAULT_SIZE, DEFAULT_SIZE);
	}
	
	public void powerUp(){
		PowerUpNexus.powerUpSpeed();
	}
	
}
