package com.blazingbbq.game;

import com.blazingbbq.gameobject.Player;

public class DataUtil {
	
	
	//Game
	private static Game game;
	
	public static void setGame(Game gme){
		game = gme;
	}
	
	public static Game getGame(){
		return game;
	}
	
	
	//Player
	private static Player player;
	
	public static void setPlayer(Player playr){
		player = playr;
	}
	
	public static Player getPlayer(){
		return player;
	}
	
}
