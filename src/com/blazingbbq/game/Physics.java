package com.blazingbbq.game;

import java.awt.Rectangle;

import com.blazingbbq.engine.GameObject;

public class Physics {
	
	public static boolean collides(GameObject go1, GameObject go2){
		Rectangle r1 = new Rectangle((int)go1.getX(), (int)go1.getY(), (int)go1.getSX(), (int)go1.getSY());
		Rectangle r2 = new Rectangle((int)go2.getX(), (int)go2.getY(), (int)go2.getSX(), (int)go2.getSY());
		
		return r1.intersects(r2);
	}
	
}
