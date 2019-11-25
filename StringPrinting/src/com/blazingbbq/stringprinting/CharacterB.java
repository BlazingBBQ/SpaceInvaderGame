package com.blazingbbq.stringprinting;

public class CharacterB extends NewCharacter{
	
	public CharacterB(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'B';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x8(0, 0);
		//2
		block5x1(2, 0);
		//3
		block2x3(6, 1);
		//4
		block5x1(2, 4);
		//5
		block2x2(6, 5);
		//6
		block5x1(2, 7);
	}
	
}
