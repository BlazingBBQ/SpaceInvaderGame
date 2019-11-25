package com.blazingbbq.engine;

import static org.lwjgl.opengl.GL11.*;

public abstract class GameObject {
	
	protected float x;
	protected float y;
	protected Sprite spr;
	
	protected boolean[] flags = new boolean[2];
	
	protected void init(float x, float y, float r, float g, float b, float sx, float sy){
		this.x = x;
		this.y = y;
		this.spr = new Sprite(r, g, b, sx, sy);
	}
	
	public void getInput(){
		
	}
	
	public void update(){
		
	}
	
	public void render(){
		glPushMatrix();
		{
			glTranslatef(x, y, 0);
			spr.render();
		}
		glPopMatrix();
	}
	
	//On Removal
	public abstract void onRemoval();
	
	//Get
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
	
	public float getSX(){
		return spr.getSX();
	}
	
	public float getSY(){
		return spr.getSY();
	}
	
	//Set
	public void setSX(float newSX){
		spr.setSX(newSX);
	}
	
	public void setSY(float newSY){
		spr.setSY(newSY);
	}
	
	public void setSize(float newSize){
		spr.setSX(newSize);
		spr.setSY(newSize);
	}
	
	//Flags
	
	//Remove flag
	public void remove(){
		flags[0] = true;
	}
	
	public boolean isForRemoval(){
		return flags[0];
	}
	
}
