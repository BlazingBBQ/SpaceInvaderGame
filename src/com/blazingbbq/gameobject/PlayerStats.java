package com.blazingbbq.gameobject;

public class PlayerStats {
	
	public static final float DEFAULT_SPEED = 6f;
	public static final Blaster DEFAULT_BLASTER = new Blaster();
	public static final int DEFAULT_SHOT_SPEED = 500;
	
	//Constructor
	public PlayerStats(){
		speed = DEFAULT_SPEED;
		blaster = DEFAULT_BLASTER;
		shotSpeed = DEFAULT_SHOT_SPEED;
	}
	
	//Speed
	private float speed;
	
	public void setSpeed(float speed){
		this.speed = speed;
	}
	
	public float getSpeed(){
		return speed;
	}
	
	//Blaster
	private Blaster blaster;
	
	public void setBlaster(Blaster blaster){
		this.blaster = blaster;
	}
	
	public Blaster getBlaster(){
		return blaster;
	}
	
	//ShotSpeed
	private int shotSpeed;
	
	public void setShotSpeed(int shotSpeed){
		this.shotSpeed = shotSpeed;
		getBlaster().changeSpeed(shotSpeed);
	}
	
	public int getShotSpeed(){
		return shotSpeed;
	}
	
}
