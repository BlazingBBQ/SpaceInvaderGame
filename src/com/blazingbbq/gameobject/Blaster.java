package com.blazingbbq.gameobject;

import com.blazingbbq.game.Delay;
import com.blazingbbq.game.DataUtil;

public class Blaster {
	
	protected Delay shotDelay;
	protected int blasterPriorityID; 
	
	//Constructor
	public Blaster(){
		blasterPriorityID = 1;
		
		try {
			shotDelay = new Delay(DataUtil.getPlayer().getStats().getShotSpeed());
		} catch (Exception e){
			shotDelay = new Delay(500);
		}
		
		shotDelay.start();
	}
	
	public void shoot(){
		if(!shotDelay.isActive()){
			shotDelay.start();
		} else if(shotDelay.isOver()){
			DataUtil.getGame().getObjects().add(new Shot(DataUtil.getPlayer().getX() + DataUtil.getPlayer().getSize() / 2 - Shot.getSizeX() / 2, DataUtil.getPlayer().getY() + DataUtil.getPlayer().getSize()));
			
			shotDelay.reset();
			shotDelay.start();
		}
	}
	
	//Change shot speed
	public void changeSpeed(int newLength){
		shotDelay.changeDelayLength(newLength);
	}
	
	//Get blaster priority ID
	public int getblasterPriorityID(){
		return blasterPriorityID;
	}
	
}
