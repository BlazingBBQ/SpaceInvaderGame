package com.blazingbbq.gameobject;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;

import com.blazingbbq.game.Score;

public class CoinGroup {
	
	public ArrayList<SafetyCoin> onScreenCoins;
	
	public CoinGroup(){
		onScreenCoins = new ArrayList<SafetyCoin>();
	}
	
	public void update(){
		resetOnScreenCoins();
		
		for(int i = 1; i <= Score.getNumberCoins(); i++){
			onScreenCoins.add(new SafetyCoin(6, Display.getHeight() - 30 - 20 * i - 2));
		}
	}
	
	public void render(){
		for(SafetyCoin coin : onScreenCoins){
			coin.render();
		}
	}
	
	//On Screen Coins
	public void resetOnScreenCoins(){
		onScreenCoins.clear();
	}
	
}
