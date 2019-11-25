package com.blazingbbq.powerup;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Delay;
import com.blazingbbq.game.Physics;
import com.blazingbbq.game.Score;
import com.blazingbbq.game.Time;
import com.blazingbbq.gameobject.Player;
import com.blazingbbq.gameobject.Shot;

public abstract class PowerUp extends GameObject{
	
	protected static final float DEFAULT_SIZE = 16;
	protected static final float SPEED_X = 0f;
	protected static final float SPEED_Y = 4f;
	
	public void update(){
		for(GameObject go : DataUtil.getGame().getObjects()){
			if(go instanceof Shot){
				if(Physics.collides(this, go)){
					remove();
					go.remove();
					powerUp();
					onRemoval();
				}
			}else if(go instanceof Player){
				if(Physics.collides(this, go)){
					remove();
					powerUp();
					onRemoval();
				}
			}
		}
		if(y <= 0){
			remove();
		}else{
			move(1, -1);
		}
	}
	
	public abstract void powerUp();
	
	//Override-able if: -Score is different
	//                  -Different power up
	public void onRemoval(){}
	
	public void move(float magX, float magY){
		x += (magX * SPEED_X) * Time.getDelta();
		y += (magY * SPEED_Y) * Time.getDelta();
	}
	
}
