package com.blazingbbq.game;

public class Delay {
	
	private int length;
	private long endTime;
	boolean started;
	
	public Delay(int length){
		this.length = length;
		started = false;
	}
	
	public boolean isOver(){
		if(!started)return false;
		
		return Time.getTime() >= endTime;
	}
	
	public void start(){
		endTime = length + Time.getTime();
		started = true;
	}
	
	public void reset(){
		started = false;
	}
	
	public boolean isActive(){
		return started;
	}
	
	//Change delay length
	public void changeDelayLength(int length){
		this.length = length;
		start();
	}
	
	//Time remaining in milliseconds
	public int millisecondsRemaining(){
		if (isActive()){
			return (int) (endTime - Time.getTime());
		} else {
			return 0;
		}
	}
	
	//Time remaining in seconds
	public int secondsRemaining(){
		if (isActive()){
			return (int) ((endTime - Time.getTime()) / 1000);
		} else {
			return 0;
		}
	}
	
}
