package com.blazingbbq.gameobject;

import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Delay;

public class TripleBlaster extends Blaster{
	
	//Constructor
	public TripleBlaster(){
		blasterPriorityID = 3;
		
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
			DataUtil.getGame().getObjects().add(new Shot(DataUtil.getPlayer().getX(), DataUtil.getPlayer().getY() + DataUtil.getPlayer().getSize()));
			DataUtil.getGame().getObjects().add(new Shot(DataUtil.getPlayer().getX() + DataUtil.getPlayer().getSize() - Shot.getSizeX(), DataUtil.getPlayer().getY() + DataUtil.getPlayer().getSize()));
			DataUtil.getGame().getObjects().add(new Shot(DataUtil.getPlayer().getX() + DataUtil.getPlayer().getSize() / 2 - Shot.getSizeX() / 2, DataUtil.getPlayer().getY() + DataUtil.getPlayer().getSize() + 10));
			
			shotDelay.reset();
			shotDelay.start();
		}
	}
	
}
