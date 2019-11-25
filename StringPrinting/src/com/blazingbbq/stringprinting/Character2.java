package com.blazingbbq.stringprinting;

public class Character2 extends NewCharacter{
	
	public Character2(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '2';
	}
	
	public void render(){
		//Building Blocks
		//1
		block8x2(0, 0);
		//2
		block2x1(0, 2);
		//3
		block6x2(1, 3);
		//4
		block2x2(6, 5);
		//5
		block7x2(0, 6);
	}
	
}
