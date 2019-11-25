package com.blazingbbq.game;

public class Time {
	
	private static long curTime;
	private static long lastTime;
	private static final long DAMPING = 16;
	
	//Constructor
	public Time(){
		
	}
	
	public static long getDelta(){
		return (curTime - lastTime) / DAMPING;
	}
	
	public static long getTime(){
		return System.currentTimeMillis();
	}
	
	public static void init(){
		curTime = getTime();
		update();
	}
	
	public static void update(){
		lastTime = curTime;
		curTime = getTime();
	}
	
}
