package com.blazingbbq.stringprinting;

public class Character9 extends NewCharacter{
	
	public Character9(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '9';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x7(6, 0);
		//2
		block6x2(1, 6);
		//3
		block2x4(0, 3);
		//4
		block5x2(1, 2);
	}
	
}
