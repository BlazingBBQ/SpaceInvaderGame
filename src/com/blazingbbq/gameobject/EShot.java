package com.blazingbbq.gameobject;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Physics;
import com.blazingbbq.game.Time;

public class EShot extends GameObject{
	
	private static final float SIZE_X = 4;
	private static final float SIZE_Y = 16;
	private static final float SPEED_X = 0f;
	private static final float SPEED_Y = 4f;
	
	public EShot(float x, float y){
		init(x, y, 1f, 0.1f, 0.1f, SIZE_X, SIZE_Y);
	}
	
	public void update(){
		for(GameObject go : DataUtil.getGame().getObjects()){
			if(go instanceof Player){
				if(Physics.collides(this, go)){
					remove();
					go.remove();
					
					go.onRemoval();
				}
			}
		}
		if(y < 0){
			remove();
		}else{
			move(1, -1f);
		}
	}
	
	//onRemoval()
	public void onRemoval(){}
	
	public void move(float magX, float magY){
		x += (magX * SPEED_X) * Time.getDelta();
		y += (magY * SPEED_Y) * Time.getDelta();
	}
	
	public static float getSizeX(){
		return SIZE_X;
	}
	
	public static float getSizeY(){
		return SIZE_Y;
	}
	
}
