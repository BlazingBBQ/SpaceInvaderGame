package com.blazingbbq.game;

import java.util.Random;

import org.lwjgl.opengl.Display;

import com.blazingbbq.gameobject.CoinGroup;
import com.blazingbbq.gameobject.EnemyPaternZigZag;
import com.blazingbbq.powerup.PowerUpNexus;
import com.blazingbbq.stringprinting.PrintableString;

public class Score {
	
	private static Random random = new Random();
	
	private static int currentScore;
	private static PrintableString score;
	
	private static int currentWave;
	private static PrintableString wave;
	
	private static int numberCoins;
	
	private static CoinGroup coinGroup;
	
	private static int multiplier;
	
	public static void init(float x, float y, float r, float g, float b, float size){
		currentScore = 0;
		score = new PrintableString(x, y, r, g, b, size, "");
		multiplier = 1;
		currentWave = 0;
		wave = new PrintableString(Display.getWidth() - 70 * size, y, r, g, b, size, "");
		numberCoins = 0;
		coinGroup = new CoinGroup();
		
		waveUp();
	}
	
	public static void update(){
		score.setString("Score:" + new Integer(currentScore).toString());
		
		wave.setString("Wave:" + new Integer(currentWave).toString());
		
		if(numberCoins >= PowerUpNexus.coinsForPowerUp){
			int temp = numberCoins % PowerUpNexus.coinsForPowerUp;
			int numberSpawn = numberCoins / PowerUpNexus.coinsForPowerUp;
			
			PowerUpNexus.spawnPowerUps(numberSpawn);
			resetCoins(temp);
		}
		
		coinGroup.update();
	}
	
	public static void render(){
		score.render();
		
		wave.render();
		
		coinGroup.render();
	}
	
	public static void add(int amount){
		currentScore += (amount * multiplier);
	}
	
	public static void remove(int amount){
		currentScore -= (amount * multiplier);
	}
	
	//Waves
	public static void waveUp(){
		currentWave++;
		
		spawn();
	}
	
	public static void spawn(){
		
		for(int i = 1; i <= currentWave * 5; i++){
			DataUtil.getGame().addObject(new EnemyPaternZigZag(Display.getWidth() / 4 + random.nextInt(Display.getWidth() / 2), Display.getHeight()));
		}
		
	}
	
	//Coins
	public static void addCoin(){
		numberCoins++;
	}
	
	public static void removeCoin(){
		numberCoins--;
	}
	
	public static void resetCoins(){
		numberCoins = 0;
	}
	
	public static void resetCoins(int amount){
		numberCoins = amount;
	}
	
	public static int getNumberCoins(){
		return numberCoins;
	}
	
}
