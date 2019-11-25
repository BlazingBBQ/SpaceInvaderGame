package com.blazingbbq.stringprinting;

public class Character0 extends NewCharacter{
	
	public Character0(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '0';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x6(0, 1);
		//2
		block6x2(1, 0);
		//3
		block2x6(6, 1);
		//4
		block6x2(1, 6);
	}
	
}
