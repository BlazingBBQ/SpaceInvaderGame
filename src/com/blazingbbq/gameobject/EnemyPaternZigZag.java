package com.blazingbbq.gameobject;

import java.util.Random;

import org.lwjgl.opengl.Display;

public class EnemyPaternZigZag extends Enemy{
	
	public boolean leftToRight;
	public boolean downToUp;
	
	public EnemyPaternZigZag(float x, float y){
		super(x, y);
		
		Random random = new Random();
		
		leftToRight = random.nextBoolean();
		downToUp = false;
		
		SPEED = (float)random.nextInt(40) / 10;
		while(SPEED <= 1)
			SPEED = (float)random.nextInt(40)/10;
	}
	
	//update()
	public void update(){
		blaster.shoot();
		
		if(leftToRight == true && downToUp == true){
			move(1, 1);
		}else if(leftToRight == true && downToUp == false){
			move(1, -1);
		}else if(leftToRight == false && downToUp == true){
			move(-1, 1);
		}else if(leftToRight == false && downToUp == false){
			move(-1, -1);
		}
		
		if(x <= 10){
			leftToRight = true;
		}
		if(x >= Display.getWidth() - 10 - Enemy.SIZE){
			leftToRight = false;
		}
		if(y <= Display.getHeight() / 3){
			downToUp = true;
		}
		if(y >= Display.getHeight() - 10 - Enemy.SIZE){
			downToUp = false;
		}
		
	}
	
}
