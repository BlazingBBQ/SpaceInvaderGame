package com.blazingbbq.gameobject;

import java.util.Random;

import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Delay;

public class EBlaster extends Blaster{
	
	protected Delay shotDelay;
	public static final int ENEMY_DEFAULT_SHOT_SPEED = 1000;
	private Enemy enemy;
	private static Random random = new Random();
	
	//Constructor
	public EBlaster(Enemy enemy){
		shotDelay = new Delay(ENEMY_DEFAULT_SHOT_SPEED + random.nextInt(1000));
		shotDelay.start();
		
		this.enemy = enemy;
	}
	
	public void shoot(){
		if(!shotDelay.isActive()){
			shotDelay.start();
		} else if(shotDelay.isOver()){
			DataUtil.getGame().addObject(new EShot(enemy.getX() + Enemy.getSize() / 2 - EShot.getSizeX() / 2, enemy.getY() - EShot.getSizeY()));
			
			shotDelay.reset();
			shotDelay.start();
		}
	}
	
}
