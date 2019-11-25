package com.blazingbbq.gameobject;

import org.lwjgl.opengl.Display;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Score;
import com.blazingbbq.game.Time;
import com.blazingbbq.powerup.*;

public class Enemy extends GameObject{
	
	public static final float SIZE = 32;
	protected float SPEED = 2f;
	
	protected Blaster blaster;
	
	public Enemy(float x, float y){
		init(x, y, 1f, 0.1f, 0.1f, SIZE, SIZE);
		
		DataUtil.getGame().addEnemy();
		
		this.blaster = new EBlaster(this);
	}
	
	//update()
	public void update(){
		blaster.shoot();
		
		float temp = this.getX() - DataUtil.getPlayer().getX();
		
		if(temp >= 0 && temp > 2){
			move(-1, 0);
		}else if(temp < 0 && temp < -2){
			move(1, 0);
		}
		
		if(y > Display.getHeight() / 2){
			move(0, -1);
		}
	}
	
	//onRemoval()
	public void onRemoval(){
		Score.add(10);
		
		DataUtil.getGame().addObject(new CoinPowerUp(this.getX() + this.getSX() / 2 - CoinPowerUp.getSize() / 2, this.getY() + this.getSY() / 2 - CoinPowerUp.getSize() / 2));
	}
	
	//move()
	public void move(float magX, float magY){
		if(!(x <= 0)){
			if(!((x + SIZE) >= Display.getWidth())){
				x += (magX * SPEED) * Time.getDelta();
			}else{
				x = (Display.getWidth() - SIZE) - 1;
			}
		}else{
			x = 1;
		}
		y += (magY * SPEED) * Time.getDelta();
	}
	
	public static float getSize(){
		return SIZE;
	}
	
}
