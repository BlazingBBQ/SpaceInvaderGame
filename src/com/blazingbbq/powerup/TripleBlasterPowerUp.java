package com.blazingbbq.powerup;

import com.blazingbbq.gameobject.TripleBlaster;

public class TripleBlasterPowerUp extends BlasterPowerUp{
	
	public TripleBlasterPowerUp(float x, float y) {
		super(x, y);
		
		newBlaster = new TripleBlaster();
	}
	
}
