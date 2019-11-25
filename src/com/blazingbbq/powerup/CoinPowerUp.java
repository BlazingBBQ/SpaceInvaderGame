package com.blazingbbq.powerup;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Physics;
import com.blazingbbq.game.Score;
import com.blazingbbq.gameobject.Player;

public class CoinPowerUp extends PowerUp{
	
	public CoinPowerUp(float x, float y){
		init(x, y, 1f, 1f, 0f, DEFAULT_SIZE, DEFAULT_SIZE);
	}
	
	public void update(){
		for(GameObject go : DataUtil.getGame().getObjects()){
			if(go instanceof Player){
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
	
	public void powerUp(){
		
	}
	
	public void powerDown(){}
	
	public static float getSize(){
		return DEFAULT_SIZE;
	}
	
	//Override
	public void onRemoval(){
		Score.addCoin();
	}
	
}
