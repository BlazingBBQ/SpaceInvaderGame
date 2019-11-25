package com.blazingbbq.stringprinting;

public class Character3 extends NewCharacter{
	
	public Character3(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '3';
	}
	
	public void render(){
		//Building Blocks
		//1
		block7x2(0, 0);
		//2
		block2x6(6, 1);
		//3
		block4x2(2, 3);
		//4
		block7x2(0, 6);
	}
	
}
