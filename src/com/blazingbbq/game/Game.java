package com.blazingbbq.game;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import com.blazingbbq.engine.GameObject;
import com.blazingbbq.engine.Main;
import com.blazingbbq.gameobject.*;
import com.blazingbbq.powerup.*;
import com.blazingbbq.stringprinting.PrintableString;

public class Game {
	
	private ArrayList<GameObject> objects;
	private ArrayList<GameObject> remove;
	private ArrayList<GameObject> toBeAdded;
	
	private Player player;
	private boolean gameIsOver = false;
	private int enemyCount;
	
	public HUD hud;
	
	//Constructor
	public Game(){
		Display.setTitle("Space Desperado");
		
		DataUtil.setGame(this);
		
		//ArrayList inits
		objects = new ArrayList<GameObject>();
		remove = new ArrayList<GameObject>();
		toBeAdded = new ArrayList<GameObject>();
		
		enemyCount = 0;
		
		player = new Player(Display.getWidth() / 2 - player.DEFAULT_SIZE / 2, 8);
		objects.add(player);
		DataUtil.setPlayer(player);
		
		hud = new HUD();
	}
	
	public void getInput(){
		if(!gameIsOver){
			player.getInput();
		}else if(gameIsOver){
			if(Keyboard.isKeyDown(Keyboard.KEY_R ) || Keyboard.isKeyDown(Keyboard.KEY_RETURN)){
				Main.resetGame();
			}
		}
	}
	
	public void update(){
		for(GameObject go : objects){
			if(!go.isForRemoval()){
				go.update();
			}else{
				remove.add(go);
			}
		}
		
		for(GameObject go : remove){
			objects.remove(go);
			
			if(go instanceof Enemy){
				removeEnemy();
			}
		}
		remove.clear();
		
		for(GameObject go : toBeAdded){
			objects.add(go);
		}
		toBeAdded.clear();
		
		if(enemyCount <= 0){
			Score.waveUp();
		}
		
		hud.update();
	}
	
	public void render(){
		for(GameObject go : objects){
			go.render();
		}
		
		hud.render();
	}
	
	public ArrayList<GameObject> getObjects(){
		return objects;
	}
	
	public void addObject(GameObject go){
		toBeAdded.add(go);
	}
	
	//gameOver()
	public void gameOver(){
		this.addObject(new GameOver(Display.getWidth() / 2 - 9 * 8 * 9 / 2,Display.getHeight() / 2 - 8 * 8 / 2));
		this.addObject(new RespawnPrompt(Display.getWidth() / 2 - 27 * 1 * 9 / 2, Display.getHeight() / 2 - 8 * 1 / 2 - 8 * 8 / 2 - 20));
		
		gameIsOver = true;
		
		for(GameObject go : objects){
			if(go instanceof Player){
				go.remove();
			}
		}
	}
	
	//EnemyCount++
	public void addEnemy(){
		enemyCount++;
	}
	
	//EnemyCount--
	public void removeEnemy(){
		enemyCount--;
	}
}
