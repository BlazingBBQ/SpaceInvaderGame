package com.blazingbbq.stringprinting;

public class Character6 extends NewCharacter{
	
	public Character6(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = '6';
	}
	
	public void render(){
		//Building Blocks
		//1
		block6x2(1, 0);
		//2
		block2x3(6, 1);
		//3
		block5x2(2, 3);
		//4
		block2x6(0, 1);
		//5
		block7x2(1, 6);
	}
	
}
