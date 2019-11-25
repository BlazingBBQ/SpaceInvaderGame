package com.blazingbbq.stringprinting;

public class Character1 extends NewCharacter{
	
	public Character1(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '1';
	}
	
	public void render(){
		//Building Blocks
		//1
		block8x2(0, 0);
		//2
		block2x6(3, 2);
		//3
		block4x2(1, 6);
		//4
		block2x2(0, 5);
	}
	
}
