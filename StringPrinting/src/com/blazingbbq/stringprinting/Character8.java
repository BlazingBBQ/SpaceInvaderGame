package com.blazingbbq.stringprinting;

public class Character8 extends NewCharacter{
	
	public Character8(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '8';
	}
	
	public void render(){
		//Building Blocks
		//1
		block6x2(1, 0);
		//2
		block2x3(6, 1);
		//3
		block6x2(1, 3);
		//4
		block2x2(6, 5);
		//5
		block6x2(1, 6);
		//6
		block2x2(0, 5);
		//7
		block2x3(0, 1);
	}
	
}
