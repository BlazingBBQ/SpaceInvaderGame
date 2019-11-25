package com.blazingbbq.gameobject;

import com.blazingbbq.engine.GameObject;

public class SafetyCoin extends GameObject{
	
	private static final float DEFAULT_SIZE = 16;
	
	public SafetyCoin(float x, float y){
		init(x, y, 1f, 1f, 0f, DEFAULT_SIZE, DEFAULT_SIZE);
	}
	
	public void onRemoval() {}

}
