package com.blazingbbq.stringprinting;

public class Character5 extends NewCharacter{
	
	public Character5(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '5';
	}
	
	public void render(){
		//Building Blocks
		//1
		block7x2(0, 0);
		//2
		block2x3(6, 1);
		//3
		block7x2(0, 3);
		//4
		block2x1(0, 5);
		//5
		block8x2(0, 6);
	}
	
}
