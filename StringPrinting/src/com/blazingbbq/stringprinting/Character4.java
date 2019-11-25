package com.blazingbbq.stringprinting;

public class Character4 extends NewCharacter{
	
	public Character4(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '4';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x5(0, 3);
		//2
		block4x2(2, 3);
		//3
		block2x8(6, 0);
	}
	
}
