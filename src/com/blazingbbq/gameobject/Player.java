package com.blazingbbq.gameobject;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Game;
import com.blazingbbq.game.Time;

public class Player extends GameObject{
	
	public static final float DEFAULT_SIZE = 32;
	public float currentSize;
	private PlayerStats stats = new PlayerStats();
	
	//Constructor
	public Player(float x, float y){
		init(x, y, 0.1f, 1f, 0.25f, DEFAULT_SIZE, DEFAULT_SIZE);
		currentSize = DEFAULT_SIZE;
	}
	
	public void getInput(){
		if(Keyboard.isKeyDown(Keyboard.KEY_A) || Keyboard.isKeyDown(Keyboard.KEY_LEFT)){
			move(-1, 0);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D) || Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){
			move(1, 0);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
			stats.getBlaster().shoot();
		}
	}
	
	public void update(){
		
	}
	
	//onRemoval()
	public void onRemoval(){
		DataUtil.getGame().gameOver();
	}
	
	//move()
	public void move(float magX, float magY){
		if(!(x <= 0)){
			if(!((x + currentSize) >= Display.getWidth())){
				x += (magX * stats.getSpeed()) * Time.getDelta();
			}else{
				x = (Display.getWidth() - currentSize) - 1;
			}
		}else{
			x = 1;
		}
		y += (magY * stats.getSpeed()) * Time.getDelta();
	}
	
	public float getSize(){
		return currentSize;
	}
	
	public void setCurrentSize(float currentSize){
		this.currentSize = currentSize;
	}
	
	public PlayerStats getStats(){
		return stats;
	}
	
}
