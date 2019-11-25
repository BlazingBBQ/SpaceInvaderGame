package com.blazingbbq.powerup;

import com.blazingbbq.gameobject.DualBlaster;

public class DualBlasterPowerUp extends BlasterPowerUp{
	
	public DualBlasterPowerUp(float x, float y) {
		super(x, y);
		
		newBlaster = new DualBlaster();
	}
	
}
