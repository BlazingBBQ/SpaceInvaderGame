package com.blazingbbq.stringprinting;

public class Character7 extends NewCharacter{
	
	public Character7(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '7';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x4(3, 0);
		//2
		block2x2(5, 4);
		//3
		block1x1(7, 5);
		//4
		block8x2(0, 6);
	}
	
}
