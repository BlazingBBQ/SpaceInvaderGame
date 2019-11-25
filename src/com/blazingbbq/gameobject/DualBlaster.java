package com.blazingbbq.gameobject;

import com.blazingbbq.game.DataUtil;
import com.blazingbbq.game.Delay;

public class DualBlaster extends Blaster{
	
	//Constructor
	public DualBlaster(){
		blasterPriorityID = 2;
		
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
			
			shotDelay.reset();
			shotDelay.start();
		}
	}
	
}
